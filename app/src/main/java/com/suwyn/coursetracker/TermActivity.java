package com.suwyn.coursetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TermActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_term);
    }

    public void toHome(View view){
        Intent intent = new Intent(TermActivity.this, MainActivity.class);
        startActivity(intent);
    }
}