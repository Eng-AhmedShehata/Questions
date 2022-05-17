package com.android.questions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Button buttonPlay = findViewById(R.id.buttonPlay);
        Button buttonClose = findViewById(R.id.buttonClose);
        TextView textView = findViewById(R.id.textView4);

        //get previous question score
        int totalScore = getIntent().getIntExtra("score", 0);

        textView.append(totalScore + "");
        buttonPlay.setOnClickListener(view -> {
            finish();
        });
        buttonClose.setOnClickListener(view -> {
            finishAffinity();
        });
    }
}