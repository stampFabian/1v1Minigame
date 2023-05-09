package com.example.a1v1minigame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int x = 0;
    int p1 = 0;
    int p2 = 0;

    private TextView tv1;
    private TextView tv2;
    private TextView tvDiff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void player1(View v){
        /*Button btn1 = findViewById(R.id.btn_p1);
        btn1.setScaleY(btn1.getScaleY() + 1);
        x++;

        p1++;

        tv1= findViewById(R.id.tv1);

        tv1.setText("" + p1);
        diff(v);*/


        ProgressBar pgBar = findViewById(R.id.pgBar);
        pgBar.setProgress(pgBar.getProgress() - (p1+1));

        tv1= findViewById(R.id.tv1);

        tv1.setText("" + p1);
    }

    public void player2(View v){
        /*Button btn2 = findViewById(R.id.btn_p2);
        btn2.setScaleY(btn2.getScaleY() + 1);
        x++;

        p2++;
        tv2 = findViewById(R.id.tv2);

        tv2.setText("" + p2);

        diff(v);*/

        ProgressBar pgBar = findViewById(R.id.pgBar);
        pgBar.setProgress(pgBar.getProgress() + (p2 + 1));

        tv2 = findViewById(R.id.tv2);

        tv2.setText("" + p2);
    }

    public void diff(View v){
        Button btn1 = findViewById(R.id.btn_p1);
        Button btn2 = findViewById(R.id.btn_p2);
/*
        tvDiff = findViewById(R.id.tvDiff);
        if(p1 > p2 && p1 != 0 && p2 != 0){
            tvDiff.setText("" + (p1 - p2));
        }
        else if(p1 < p2 && p1 != 0 && p2 != 0){
            tvDiff.setText("" + (p2 - p1));
        }
        else{
            tvDiff.setText("0");
        }

        if(p1 == 100){
            tvDiff.setText("Player 1 won!");
            btn1.setEnabled(false);
            btn2.setEnabled(false);

        }
        else if(p2 == 100){
            tvDiff.setText("Player 2 won");
            btn1.setEnabled(false);
            btn2.setEnabled(false);
        }*/
        ProgressBar pgBar = findViewById(R.id.pgBar);
        if(pgBar.getProgress() == 100){
            tv2.setText("Player 2 won!");
            btn1.setEnabled(false);
            btn2.setEnabled(false);
        }
        else if(pgBar.getProgress() == 0){
            tv1.setText("Player 1 won!");
            btn1.setEnabled(false);
            btn2.setEnabled(false);
        }
    }

}