package com.example.hsinhwang.shrimpshell;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class RoomPreviewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle(R.string.rp_title);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_preview);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
