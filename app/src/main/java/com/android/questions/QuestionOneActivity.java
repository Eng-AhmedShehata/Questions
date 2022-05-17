package com.android.questions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class QuestionOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qestion_one);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        button1.setOnClickListener(view -> {
            openQuestionTwo(0);
        });
        button2.setOnClickListener(view -> {
            openQuestionTwo(5);
        });

        button3.setOnClickListener(view -> {
            openQuestionTwo(0);
        });
    }

    private void openQuestionTwo(int score) {
        Intent intent = new Intent(this, QuestionTwoActivity.class);
        intent.putExtra("score", score);
        startActivity(intent);
        finish();
    }
}