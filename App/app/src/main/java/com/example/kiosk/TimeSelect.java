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

public class TimeSelect extends AppCompatActivity {

    boolean selected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time_select);

        // 문자열 중 일부 글자색 변경
        TextView time_select_notice = (TextView)findViewById(R.id.time_select_notice); // 텍스트 변수 선언
        String content = time_select_notice.getText().toString(); // 텍스트 가져옴
        SpannableString spannableString = new SpannableString(content); // 객체 생성

        String word ="시간";
        int start = content.indexOf(word);
        int end = start + word.length();

        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#447673")), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new StyleSpan(Typeface.BOLD), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        time_select_notice.setText(spannableString);

        Button time1_btn = findViewById(R.id.time_button01);
        time1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    time1_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    time1_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });

        Button time2_btn = findViewById(R.id.time_button02);
        time2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    time2_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    time2_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button time3_btn = findViewById(R.id.time_button03);
        time3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    time3_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    time3_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button time4_btn = findViewById(R.id.time_button04);
        time4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    time4_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    time4_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button time5_btn = findViewById(R.id.time_button05);
        time5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    time5_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    time5_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button time6_btn = findViewById(R.id.time_button06);
        time6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    time6_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    time6_btn.setSelected(true); //선택아님
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

        // 완료 버튼 클릭시 인원수 고르는 화면(person_count.xml)으로 이동
        Button finish_btn = findViewById(R.id.finish_button);
        finish_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PersonCount.class);
                startActivity(intent);
            }
        });
    }

}
