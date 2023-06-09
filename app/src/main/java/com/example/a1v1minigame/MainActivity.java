package com.example.a1v1minigame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int p1 = 0;
    int p2 = 0;

    private TextView tvDiff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button BackButton = findViewById(R.id.btn_back);
        Button ResetButton = findViewById(R.id.btn_reset);

        BackButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
            startActivity(intent);
        });

        ResetButton.setOnClickListener(v -> playAgain(v));
    }

    public void player1(View v){
        ProgressBar pgBar = findViewById(R.id.pgBar);
        pgBar.setProgress(pgBar.getProgress() - (p1 + 2));

        /*TextView tv1= findViewById(R.id.tv1);

        tv1.setText("" + p1+2);*/

        diff(v);
    }

    public void player2(View v){
        ProgressBar pgBar = findViewById(R.id.pgBar);
        pgBar.setProgress(pgBar.getProgress() + (p2 + 2));

        /*TextView tv2 = findViewById(R.id.tv2);

        tv2.setText("" + p2+2);*/

        diff(v);
    }

    public void diff(View v){
        Button btn1 = findViewById(R.id.btn_p1);
        Button btn2 = findViewById(R.id.btn_p2);

        ProgressBar pgBar = findViewById(R.id.pgBar);
        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        Button btnReplay = findViewById(R.id.btnReplay);
        if(pgBar.getProgress() == 100){
            tv2.setVisibility(View.VISIBLE);
            btnReplay.setVisibility(View.VISIBLE);
            btnReplay.setRotation(180);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
        }

        if(pgBar.getProgress() == 0){
            tv1.setVisibility(View.VISIBLE);
            btnReplay.setVisibility(View.VISIBLE);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
        }
    }

    public void playAgain(View v){
        ProgressBar pgBar = findViewById(R.id.pgBar);
        pgBar.setProgress(50);
        recreate();
    }
}