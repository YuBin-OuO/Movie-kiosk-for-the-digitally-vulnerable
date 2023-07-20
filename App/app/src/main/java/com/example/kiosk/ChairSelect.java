package com.example.kiosk;

import android.app.AlertDialog;
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

public class ChairSelect extends AppCompatActivity {

    boolean selected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chair_select);

        // 문자열 중 일부 글자색 변경
        TextView chair_select_notice = (TextView) findViewById(R.id.chair_select_notice); // 텍스트 변수 선언
        String content = chair_select_notice.getText().toString(); // 텍스트 가져옴
        SpannableString spannableString = new SpannableString(content); // 객체 생성

        String word = "좌석";
        int start = content.indexOf(word);
        int end = start + word.length();

        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#447673")), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new StyleSpan(Typeface.BOLD), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        chair_select_notice.setText(spannableString);

        Button chair01_btn = findViewById(R.id.chair01);
        chair01_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    chair01_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    chair01_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button chair02_btn = findViewById(R.id.chair02);
        chair02_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    chair02_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    chair02_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button chair03_btn = findViewById(R.id.chair03);
        chair03_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    chair03_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    chair03_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button chair04_btn = findViewById(R.id.chair04);
        chair04_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    chair04_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    chair04_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button chai05_btn = findViewById(R.id.chair05);
        chai05_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    chai05_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    chai05_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button chair06_btn = findViewById(R.id.chair06);
        chair06_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    chair06_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    chair06_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button chair07_btn = findViewById(R.id.chair07);
        chair07_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    chair07_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    chair07_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button chair08_btn = findViewById(R.id.chair08);
        chair08_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    chair08_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    chair08_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button chair09_btn = findViewById(R.id.chair09);
        chair09_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    chair09_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    chair09_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button chair10_btn = findViewById(R.id.chair10);
        chair10_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    chair10_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    chair10_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button chair11_btn = findViewById(R.id.chair11);
        chair11_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    chair11_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    chair11_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button chair12_btn = findViewById(R.id.chair12);
        chair12_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    chair12_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    chair12_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button chair13_btn = findViewById(R.id.chair13);
        chair13_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    chair13_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    chair13_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button chair14_btn = findViewById(R.id.chair14);
        chair14_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    chair14_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    chair14_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button chair15_btn = findViewById(R.id.chair15);
        chair15_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    chair15_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    chair15_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button chair16_btn = findViewById(R.id.chair16);
        chair16_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    chair16_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    chair16_btn.setSelected(true); //선택아님
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

        // 완료 버튼 클릭시 결제 방식 고르는 화면(payment_select.xml)으로 이동
        Button finish_btn = findViewById(R.id.finish_button);
        finish_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PaymentSelect.class);
                startActivity(intent);
            }
        });


    }

}
