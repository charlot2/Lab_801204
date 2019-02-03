package com.example.tanai.homework2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView box;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    box = findViewById(R.id.box);
    one = findViewById(R.id.one);
    two = findViewById(R.id.two);
    three = findViewById(R.id.three);
    four = findViewById(R.id.four);
    five = findViewById(R.id.five);
    six = findViewById(R.id.six);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                box.setText("233-225-222");
                box.setBackgroundColor(Color.rgb(233,225,222));
            }

        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                box.setText("231-204-203");
                box.setBackgroundColor(Color.rgb(231,204,203));
            }

        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                box.setText("119-134-154");
                box.setBackgroundColor(Color.rgb(119,134,154));
            }

        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                box.setText("156-169-189");
                box.setBackgroundColor(Color.rgb(156,169,189));
            }

        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                box.setText("196-204-212");
                box.setBackgroundColor(Color.rgb(196,204,212));
            }

        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                box.setText("222-226-229");
                box.setBackgroundColor(Color.rgb(222,226,229));
            }

        });



    }



}
