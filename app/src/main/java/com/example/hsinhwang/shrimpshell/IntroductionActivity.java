package com.example.hsinhwang.shrimpshell;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class IntroductionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle(R.string.intro_title);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
