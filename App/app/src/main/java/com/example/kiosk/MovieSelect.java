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

public class MovieSelect extends AppCompatActivity {

    boolean selected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_select);

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

        //영화 선택시 (button_click.xml)으로 변경
        Button admiral_btn = findViewById(R.id.admiral_button);
        admiral_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    admiral_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    admiral_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button architecture_btn = findViewById(R.id.architecture_button);
        architecture_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    architecture_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    architecture_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button avengers_btn = findViewById(R.id.avengers_button);
        avengers_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    avengers_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    avengers_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button extreme_btn = findViewById(R.id.extreme_button);
        extreme_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    extreme_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    extreme_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button frozen_btn = findViewById(R.id.frozen_button);
        frozen_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                if(selected){
                    frozen_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    frozen_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button gift_btn = findViewById(R.id.gift_button);
        gift_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    gift_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    gift_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button mission_btn = findViewById(R.id.mission_button);
        mission_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    mission_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    mission_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button thieves_btn = findViewById(R.id.thieves_button);
        thieves_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    thieves_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    thieves_btn.setSelected(true); //선택아님
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

        // 완료 버튼 클릭시 시간 고르는 화면(time_select.xml)으로 이동
        Button finish_btn = findViewById(R.id.finish_button);
        finish_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TimeSelect.class);
                startActivity(intent);
            }
        });

        // 기본 화면으로 보기 버튼 클릭시 기본 영화 고르는 화면(base_movie_select.xml)으로 이동
        Button base_btn = findViewById(R.id.base_button);
        base_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BaseMovieSelect.class);
                startActivity(intent);
            }
        });
    }

}
