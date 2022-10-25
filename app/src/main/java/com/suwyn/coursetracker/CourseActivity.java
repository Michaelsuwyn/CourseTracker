package com.suwyn.coursetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CourseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
    }

    public void toHome(View view){
        Intent intent = new Intent(CourseActivity.this, MainActivity.class);
        startActivity(intent);
    }
}