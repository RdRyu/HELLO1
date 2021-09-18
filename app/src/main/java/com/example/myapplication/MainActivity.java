package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=findViewById(R.id.button);
        Button btn2=findViewById(R.id.button2);
        Button btn3=findViewById(R.id.button3);
        Button btn4=findViewById(R.id.button4);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findViewById(R.id.textView2);
                int score = Integer.parseInt(tv.getText().toString()) + 3;
                tv.setText(String.valueOf(score));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findViewById(R.id.textView2);
                int score = Integer.parseInt(tv.getText().toString()) + 2;
                tv.setText(String.valueOf(score));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findViewById(R.id.textView2);
                int score = Integer.parseInt(tv.getText().toString()) + 1;
                tv.setText(String.valueOf(score));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findViewById(R.id.textView2);
                int score =0;
                tv.setText(String.valueOf(score));
            }
        });
        Button btn5=findViewById(R.id.button5);
        Button btn6=findViewById(R.id.button6);
        Button btn7=findViewById(R.id.button7);
        Button btn8=findViewById(R.id.button8);
        Button btn9=findViewById(R.id.button9);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findViewById(R.id.textView4);
                int score = Integer.parseInt(tv.getText().toString()) + 3;
                tv.setText(String.valueOf(score));
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findViewById(R.id.textView4);
                int score = Integer.parseInt(tv.getText().toString()) + 2;
                tv.setText(String.valueOf(score));
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findViewById(R.id.textView4);
                int score = Integer.parseInt(tv.getText().toString()) + 1;
                tv.setText(String.valueOf(score));
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findViewById(R.id.textView4);
                int score = 0;
                tv.setText(String.valueOf(score));
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findViewById(R.id.textView2);
                int score = 0;
                tv.setText(String.valueOf(score));
                tv=findViewById(R.id.textView4);
                tv.setText(String.valueOf(score));
            }
        });
    }
}