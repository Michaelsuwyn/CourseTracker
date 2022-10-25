package com.suwyn.coursetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void viewTerms(View view){
        Intent intent = new Intent(MainActivity.this, TermActivity.class);
        startActivity(intent);
    }

    public void viewCourses(View view){
        Intent intent = new Intent(MainActivity.this, CourseActivity.class);
        startActivity(intent);
    }

    public void viewAssessments(View view){
        Intent intent = new Intent(MainActivity.this, AssessmentActivity.class);
        startActivity(intent);
    }

}