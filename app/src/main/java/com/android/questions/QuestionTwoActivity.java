package com.android.questions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class QuestionTwoActivity extends AppCompatActivity {

    private int previousScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questiontwo);

        //get previous question score
        previousScore = getIntent().getIntExtra("score", 0);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        button1.setOnClickListener(view -> {
            openQuestionThree(5);
        });
        button2.setOnClickListener(view -> {
            openQuestionThree(0);
        });

        button3.setOnClickListener(view -> {
            openQuestionThree(0);
        });
    }

    private void openQuestionThree(int score) {
        Intent intent = new Intent(this, QuestionThreeActivity.class);
        intent.putExtra("score", previousScore + score);
        startActivity(intent);
        finish();
    }
}