package com.example.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t = findViewById(R.id.text);
        t.setText("Buchacha was here");
        t.setText("Buchacha went out");
        t.setText("Buchacha get crazy");
        t.setText("Buchacha get too much crazy");

        t.setText("Buchacha get ill as he was very crazy");
        t.setText("Buchacha go vacation");
        t.setText("Buchacha calm down");
        t.setText("Buchacha started work hard and earn big money");


    }
}
