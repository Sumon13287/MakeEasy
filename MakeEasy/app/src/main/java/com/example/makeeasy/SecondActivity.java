package com.example.makeeasy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void next(View view) {

        Intent gotoThirt = new Intent();
        gotoThirt.setClass(this, ThirtActivity.class);
        startActivity(gotoThirt);
    }
}