package com.example.employeepayrollapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity  extends  AppCompatActivity {

     int SPLASH_TIME_OUT=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mIntent=new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(mIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
