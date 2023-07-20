package com.example.kiosk;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Recommendation extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        // recommendation.xml로 이동
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recommendation);

        TextView estimation_message = findViewById(R.id.estimation_message);
        TextView recommendation_message = findViewById(R.id.recommendation_message);
        ImageView recommendation_poster = findViewById(R.id.recommendation_poster);


        Intent intent = getIntent();
        String gender = intent.getStringExtra("성별");
        String age = intent.getStringExtra("연령대");
        String genre = "선호 장르";
        String movie = "추천 영화";

        estimation_message.setText("고객님은 "+ age +" " + gender +"으로 추정되었습니다.");

        if (gender.equals("남성")){
            if (age.equals("20대 미만")){
                recommendation_poster.setImageResource(R.drawable.avengers);
                genre = "SF/판타지/어드벤처";
                movie = "어벤져스";
            }
            else if (age.equals("20대")){
                recommendation_poster.setImageResource(R.drawable.mission);
                genre = "액션";
                movie = "미션 임파서블";
            }
            else if (age.equals("30대")){
                recommendation_poster.setImageResource(R.drawable.thieves);
                genre = "범죄/스릴러/미스테리";
                movie = "도둑들";
            }
            else if (age.equals("4-50대")){
                recommendation_poster.setImageResource(R.drawable.avengers);
                genre = "SF/판타지/어드벤처";
                movie = "어벤져스";
            }
            else if (age.equals("60대 이상")){
                recommendation_poster.setImageResource(R.drawable.mission);
                genre = "액션";
                movie = "미션 임파서블";
            }
        }
        else if (gender.equals("여성")){
            if (age.equals("20대 미만")){
                recommendation_poster.setImageResource(R.drawable.frozen);
                genre = "애니메이션";
                movie = "겨울왕국";
            }
            else if (age.equals("20대")){
                recommendation_poster.setImageResource(R.drawable.thieves);
                genre = "범죄/스릴러/미스터리";
                movie = "도둑들";
            }
            else if (age.equals("30대")){
                recommendation_poster.setImageResource(R.drawable.mission);
                genre = "액션";
                movie = "미션 임파서블";
            }
            else if (age.equals("4-50대")){
                recommendation_poster.setImageResource(R.drawable.avengers);
                genre = "SF/판타지/어드벤처";
                movie = "어벤져스";
            }
            else if (age.equals("60대 이상")){
                recommendation_poster.setImageResource(R.drawable.architecture);
                genre = "로맨틱코미디";
                movie = "건축학개론";
            }
        }

        recommendation_message.setText(genre + " 장르의 <" + movie +"> 어떠세요?");


        // 처음 화면(activity.xml)으로 이동
        Button home_btn = findViewById(R.id.home_button);
        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        // 확인 버튼 클릭시 영화 고르는 화면(base_movie_select.xml)으로 이동
        Button change_movie_btn = findViewById(R.id.ok_button);
        change_movie_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                if (age.equals("4-50대") || age.equals("60대 이상"))
                    intent = new Intent(getApplicationContext(), MovieSelect.class);
                    // 시니어 고객일 경우 MovieSelect로
                else
                    intent = new Intent(getApplicationContext(), BaseMovieSelect.class);
                startActivity(intent);
            }
        });


    }


}
