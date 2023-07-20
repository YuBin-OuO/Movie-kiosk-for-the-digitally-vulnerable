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

public class PersonCount extends AppCompatActivity {

    boolean selected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.person_count);

        // 문자열 중 일부 글자색 변경
        TextView person_count_notice = (TextView)findViewById(R.id.person_count_notice); // 텍스트 변수 선언
        String content = person_count_notice.getText().toString(); // 텍스트 가져옴
        SpannableString spannableString = new SpannableString(content); // 객체 생성

        String word ="인원";
        int start = content.indexOf(word);
        int end = start + word.length();

        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#447673")), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new StyleSpan(Typeface.BOLD), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        person_count_notice.setText(spannableString);

        //성인 인원
        Button per0_btn = findViewById(R.id.btn0);
        per0_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    per0_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    per0_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button per1_btn = findViewById(R.id.btn1);
        per1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    per1_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    per1_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button per2_btn = findViewById(R.id.btn2);
        per2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    per2_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    per2_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button per3_btn = findViewById(R.id.btn3);
        per3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    per3_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    per3_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button per4_btn = findViewById(R.id.btn4);
        per4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    per4_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    per4_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button per5_btn = findViewById(R.id.btn5);
        per5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    per5_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    per5_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button per6_btn = findViewById(R.id.btn6);
        per6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    per6_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    per6_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button per7_btn = findViewById(R.id.btn7);
        per7_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    per7_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    per7_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button per8_btn = findViewById(R.id.btn8);
        per8_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    per8_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    per8_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });

        //청소년 인원
        Button tper0_btn = findViewById(R.id.tbtn0);
        tper0_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    tper0_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    tper0_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button tper1_btn = findViewById(R.id.tbtn1);
        tper1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    tper1_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    tper1_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button tper2_btn = findViewById(R.id.tbtn2);
        tper2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    tper2_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    tper2_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button tper3_btn = findViewById(R.id.tbtn3);
        tper3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    tper3_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    tper3_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button tper4_btn = findViewById(R.id.tbtn4);
        tper4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    tper4_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    tper4_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button tper5_btn = findViewById(R.id.tbtn5);
        tper5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    tper5_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    tper5_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button tper6_btn = findViewById(R.id.tbtn6);
        tper6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    tper6_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    tper6_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button tper7_btn = findViewById(R.id.tbtn7);
        tper7_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    tper7_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    tper7_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button tper8_btn = findViewById(R.id.tbtn8);
        tper8_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    tper8_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    tper8_btn.setSelected(true); //선택아님
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

        // 이전 화면으로 이동
        Button previous_btn = findViewById(R.id.previous_button);
        previous_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        // 완료 버튼 클릭시 좌석 고르는 화면(chair_select.xml)으로 이동
        Button finish_btn = findViewById(R.id.finish_button);
        finish_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChairSelect.class);
                startActivity(intent);
            }
        });
    }

}
