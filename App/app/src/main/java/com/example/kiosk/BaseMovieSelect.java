package com.example.kiosk;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class BaseMovieSelect extends AppCompatActivity {

    boolean selected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_movie_select);

        // 문자열 중 일부 글자색 변경
        TextView movie_select_notice = (TextView) findViewById(R.id.movie_select_notice); // 텍스트 변수 선언
        String content = movie_select_notice.getText().toString(); // 텍스트 가져옴
        SpannableString spannableString = new SpannableString(content); // 객체 생성

        String word = "영화";
        int start = content.indexOf(word);
        int end = start + word.length();

        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#447673")), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new StyleSpan(Typeface.BOLD), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        movie_select_notice.setText(spannableString);

        ConstraintLayout movie1_btn = findViewById(R.id.movie1);
        movie1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    movie1_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    movie1_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        ConstraintLayout movie2_btn = findViewById(R.id.movie2);
        movie2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    movie2_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    movie2_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        ConstraintLayout movie3_btn = findViewById(R.id.movie3);
        movie3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    movie3_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    movie3_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        ConstraintLayout movie4_btn = findViewById(R.id.movie4);
        movie4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    movie4_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    movie4_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        ConstraintLayout movie5_btn = findViewById(R.id.movie5);
        movie5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    movie5_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    movie5_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        ConstraintLayout movie6_btn = findViewById(R.id.movie6);
        movie6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    movie6_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    movie6_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        ConstraintLayout movie7_btn = findViewById(R.id.movie7);
        movie7_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    movie7_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    movie7_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        ConstraintLayout movie8_btn = findViewById(R.id.movie8);
        movie8_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    movie8_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    movie8_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });



        // 처음 화면(activity.xml)으로 이동
        Button home_btn = findViewById(R.id.home_button);
        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        // 완료 버튼 클릭시 인원 및 좌석 고르는 화면(base_chair_select.xml)으로 이동
        Button finish_btn = findViewById(R.id.finish_button);
        finish_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BaseChairSelect.class);
                startActivity(intent);
            }
        });

        // 쉬운 화면으로 보기 버튼 클릭시 쉬운 영화 고르는 화면(movie_select.xml)으로 이동
        Button easy_btn = findViewById(R.id.easy_button);
        easy_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MovieSelect.class);
                startActivity(intent);
            }
        });
    }

}
