package com.android.questions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class QuestionThreeActivity extends AppCompatActivity {

    private int previousScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_three2);

        //get previous question score
        previousScore = getIntent().getIntExtra("score", 0);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        button1.setOnClickListener(view -> {
            openResultScreen(0);
        });
        button2.setOnClickListener(view -> {
            openResultScreen(0);
        });

        button3.setOnClickListener(view -> {
            openResultScreen(5);
        });
    }

    private void openResultScreen(int score) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("score", previousScore + score);
        startActivity(intent);
        finish();
    }
}