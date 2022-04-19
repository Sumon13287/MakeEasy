package com.example.makeeasy;

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

    public void secondPage(View view) {
        Intent gotoSecond = new Intent();
        gotoSecond.setClass(this, SecondActivity.class);
        startActivity(gotoSecond);
    }
}