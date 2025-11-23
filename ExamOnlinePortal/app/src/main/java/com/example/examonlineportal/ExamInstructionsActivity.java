package com.example.examonlineportal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExamInstructionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_instructions);

        TextView tvExamName = findViewById(R.id.tvExamName);
        Button btnStartExam = findViewById(R.id.btnStartExam);

        String examName = getIntent().getStringExtra("exam_name");
        tvExamName.setText(examName + " Exam");

        btnStartExam.setOnClickListener(v -> {
            Intent intent = new Intent(ExamInstructionsActivity.this, ExamPageActivity.class);
            intent.putExtra("exam_name", examName);
            startActivity(intent);
        });
    }
}
