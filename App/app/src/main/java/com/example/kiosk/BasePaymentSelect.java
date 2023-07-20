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

public class BasePaymentSelect extends AppCompatActivity {

    boolean selected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base_payment_select);

        // 문자열 중 일부 글자색 변경
        TextView payment_select_notice = (TextView)findViewById(R.id.payment_select_notice); // 텍스트 변수 선언
        String content = payment_select_notice.getText().toString(); // 텍스트 가져옴
        SpannableString spannableString = new SpannableString(content); // 객체 생성

        String word ="결제 수단";
        int start = content.indexOf(word);
        int end = start + word.length();

        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#447673")), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(new StyleSpan(Typeface.BOLD), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        payment_select_notice.setText(spannableString);

        Button credit_card_btn = findViewById(R.id.credit_card_button);
        credit_card_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    credit_card_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    credit_card_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button cash_btn = findViewById(R.id.cash_button);
        cash_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    cash_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    cash_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button kakao_pay_btn = findViewById(R.id.kakao_pay_button);
        kakao_pay_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    kakao_pay_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    kakao_pay_btn.setSelected(true); //선택아님
                    selected=true;
                }
            }
        });
        Button samsung_pay_btn = findViewById(R.id.samsung_pay_button);
        samsung_pay_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected){
                    samsung_pay_btn.setSelected(false); //선택아님
                    selected=false;
                }
                else{
                    samsung_pay_btn.setSelected(true); //선택아님
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
    }

}
