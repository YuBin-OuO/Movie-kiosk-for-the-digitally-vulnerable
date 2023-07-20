package com.example.kiosk;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 티켓 구매 버튼 클릭시 얼굴 인식 화면(camera.xml)으로 이동
        ImageButton ticket_btn = findViewById(R.id.ticket_icon);
        ticket_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Camera.class);
                startActivity(intent);
            }
        });
    }

}