package com.example.kiosk;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.InputStream;
import java.net.Socket;


public class Camera extends AppCompatActivity {

    public static String recv_msg = new String("");

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        // camera.xml로 이동
        super.onCreate(savedInstanceState);
        setContentView(R.layout.camera);

        // 문자열 중 일부 글자색 변경
        TextView camera_notice = (TextView)findViewById(R.id.camera_notice); // 텍스트 변수 선언
        String content = camera_notice.getText().toString(); // 텍스트 가져옴
        SpannableString spannableString = new SpannableString(content); // 객체 생성

        String word ="얼굴 인식";
        int start = content.indexOf(word);
        int end = start + word.length();

        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#447673")), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new StyleSpan(Typeface.BOLD), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        camera_notice.setText(spannableString);

        // 얼굴 인식 버튼 클릭시 성별/연령대 정보 불러와 추천 화면 띄움
        Button face_detection_btn = findViewById(R.id.face_detection);
        face_detection_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                ClientThread thread = new ClientThread();
                thread.start();
                face_detection_btn.setText("얼굴을 인식하는 중입니다.");

                try {
                    thread.join();
                } catch (InterruptedException e) {
                    face_detection_btn.setText("얼굴 인식에 실패했습니다.");
                    e.printStackTrace();
                }

                String[] splitText = recv_msg.split(" ");
                String gender = splitText[0];
                int age = Integer.parseInt(splitText[4]);
                try{
                    Intent intent = new Intent(getApplicationContext(), Recommendation.class);
                    if (gender.equals("Male")){
                        intent.putExtra("성별", "남성");
                    }
                    else if (gender.equals("Female")){
                        intent.putExtra("성별", "여성");
                    }

                    if (age <= 25){
                        intent.putExtra("연령대", "20대 미만");
                    }
                    else if (age <= 35){
                        intent.putExtra("연령대", "20대");
                    }
                    else if (age <= 45){
                        intent.putExtra("연령대", "30대");
                    }
                    else if (age <= 55){
                        intent.putExtra("연령대", "4-50대");
                    }
                    else {
                        intent.putExtra("연령대", "60대 이상");
                    }

                    startActivity(intent);
                }catch (NumberFormatException ex){
                    ex.printStackTrace();
                }
            }
        });

    }

    class ClientThread extends Thread {
        public void run(){

            String host = "172.18.13.212";
            int port = 12345;

            try{
                Socket s = new Socket(host, port);

                InputStream is;
                String msg;
                is = s.getInputStream();

                byte[] byteArr = new byte[512];
                int readByteCount = is.read(byteArr);
                msg = new String(byteArr, 0, readByteCount, "UTF-8");
                Camera.recv_msg = msg;
                is.close();
                s.close();


            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


}


