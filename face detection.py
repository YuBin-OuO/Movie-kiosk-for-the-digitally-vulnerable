import cv2
import argparse
import threading

gender = 0
age = 0

def highlightFace(net, frame, conf_threshold=0.7):
    frameOpencvDnn=frame.copy()
    frameHeight=frameOpencvDnn.shape[0]
    frameWidth=frameOpencvDnn.shape[1]
    blob=cv2.dnn.blobFromImage(frameOpencvDnn, 1.0, (300, 300), [104, 117, 123], True, False)   # (input 영상, 각 픽셀값의 배율, input 영상 크기 resize, 각 이미지에서 빼야 하는 평균, R과 B 채널 swap 여부)
    # Net에 입력되는 데이터는 blob 형식으로 변경해 줘야 함 → 이미지를 blob으로 설정
    # blob: OpenCV에서 Mat 타입의 4차원 행렬 (4D Tensor: N;영상 개수, C;채널 개수, H;영상 높이, W;영상 넓이)

    net.setInput(blob)  # Net에 blob 형태의 데이터 넣어줌
    detections=net.forward()    # 순방향으로 Net 실행
    faceBoxes=[]
    for i in range(detections.shape[2]):
        confidence=detections[0,0,i,2]  # 사람의 얼굴일 확률
        if confidence>conf_threshold:   # 사람의 얼굴일 확률이 역치값보다 높을 때만
            x1=int(detections[0,0,i,3]*frameWidth)  # 왼쪽 맨 위 x좌표 상대 위치
            y1=int(detections[0,0,i,4]*frameHeight) # 왼쪽 맨 위 y좌표 상대 위치
            x2=int(detections[0,0,i,5]*frameWidth)  # 오른쪽 맨 아래 x좌표 상대 위치
            y2=int(detections[0,0,i,6]*frameHeight) # 오른쪽 맨 아래 y좌표 상대 위치
            faceBoxes.append([x1,y1,x2,y2])
            cv2.rectangle(frameOpencvDnn, (x1,y1), (x2,y2), (0,255,0), int(round(frameHeight/150)), 8)
    return frameOpencvDnn,faceBoxes

def capture():
    parser=argparse.ArgumentParser()
    parser.add_argument('--image')

    args=parser.parse_args()

    faceProto="opencv_face_detector.pbtxt"
    faceModel="opencv_face_detector_uint8.pb"
    ageProto="age_deploy.prototxt"
    ageModel="age_net.caffemodel"
    genderProto="gender_deploy.prototxt"
    genderModel="gender_net.caffemodel"

    # 사전 학습된 가중치
    MODEL_MEAN_VALUES=(78.4263377603, 87.7689143744, 114.895847746)
    ageList=['( 0 - 2 )', ' ( 4 - 6 )', ' ( 8 - 12 )', '( 15 - 20 )', '( 25 - 32 )', '( 38 - 43 )', '( 48 - 53 )', '( 60 - 100 )']
    genderList=['Male','Female']

    # readNet: 전달된 model과 config 파일 이름 확장자를 분석해 구성 및 프레임워크를 자동으로 감지한 후 Net 객체 생성, 메모리에 로드
    faceNet=cv2.dnn.readNet(faceModel,faceProto)
    ageNet=cv2.dnn.readNet(ageModel,ageProto)
    genderNet=cv2.dnn.readNet(genderModel,genderProto)

    video = cv2.VideoCapture(args.image if args.image else 0)
    padding = 20
    i = 0

    while cv2.waitKey(1) < 0:
        hasFrame,frame=video.read() # 캡처, 이미지 불러오기
        if not hasFrame:
            cv2.waitKey()
            break

        resultImg,faceBoxes=highlightFace(faceNet,frame)    # 얼굴 탐지 해 실시간으로 사각형 표시
        if not faceBoxes:
            print("No face detected")
        for faceBox in faceBoxes:
            face=frame[max(0,faceBox[1]-padding):
                    min(faceBox[3]+padding,frame.shape[0]-1),max(0,faceBox[0]-padding)
                    :min(faceBox[2]+padding, frame.shape[1]-1)]

            blob=cv2.dnn.blobFromImage(face, 1.0, (227,227), MODEL_MEAN_VALUES, swapRB=False)   # (input 영상, 각 픽셀값의 배율, input 영상 크기 resize, 각 이미지에서 빼야 하는 평균, R과 B 채널 swap 여부)
            # Net에 입력되는 데이터는 blob 형식으로 변경해 줘야 함 → 이미지를 blob으로 설정
            # blob: OpenCV에서 Mat 타입의 4차원 행렬 (4D Tensor: N;영상 개수, C;채널 개수, H;영상 높이, W;영상 넓이)
            genderNet.setInput(blob)    # Net에 blob 형태의 데이터 넣어줌
            genderPreds=genderNet.forward() # 순방향으로 Net 실행
            global gender
            gender = genderList[genderPreds[0].argmax()]    # 가장 높은 score값으로 성별 예측
            #print(f'Gender: {gender}')

            ageNet.setInput(blob)
            agePreds = ageNet.forward()
            global age
            age=ageList[agePreds[0].argmax()]   # 가장 높은 score값으로 연령대 예측
            #print(f'Age: {age[1:-1]} years')

            cv2.putText(resultImg, f'{gender}, {age}', (faceBox[0], faceBox[1]-10), cv2.FONT_HERSHEY_SIMPLEX, 0.8, (0,255,255), 2, cv2.LINE_AA)
            cv2.imshow("Detecting age and gender", resultImg)
            i = i + 1



import socket

host = '172.18.13.212'
port = 12345

t = threading.Thread(target=capture)
t.start()

with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    print("클라이언트 대기")
    s.bind((host, port))
    s.listen()
    while True:
        client_socket, client_addr = s.accept()
        print("클라이언트 접속")
        data = bytes(gender + " "+age, 'utf-8')
        print(data)
        client_socket.send(data)
        client_socket.close()

