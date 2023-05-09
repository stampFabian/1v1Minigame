package com.example.a1v1minigame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    int x = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void player1(View v){
        Button btn1 = findViewById(R.id.btn_p1);
        btn1.setScaleY(btn1.getScaleY() + 1);
        x++;
    }

    public void player2(View v){
        Button btn2 = findViewById(R.id.btn_p2);
        btn2.setScaleY(btn2.getScaleY() + 1);
        x++;
    }

    private void calc(View v){
        Button btn1 = findViewById(R.id.btn_p1);
        Button btn2 = findViewById(R.id.btn_p2);
        if(btn1.getScaleY() >= btn2.getScaleY()){
            btn2.setScaleY(100);
        }
    }
}