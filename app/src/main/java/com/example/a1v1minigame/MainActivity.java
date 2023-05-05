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
        Button button = findViewById(R.id.btn_p1);
        button.setScaleY(button.getScaleY() + 1);
        x++;
    }

    public void player2(View v){
        Button button = findViewById(R.id.btn_p2);
        button.setScaleY(button.getScaleY() + 1);
        x++;
    }
}