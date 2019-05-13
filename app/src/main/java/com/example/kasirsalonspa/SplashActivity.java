package com.example.kasirsalonspa;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class SplashActivity extends AppCompatActivity {

    //inisialisasi timer
    private static int SPLASHTIMEOUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //if timer off,method run
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent goMain = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(goMain);

                finish();
            }
        }, SPLASHTIMEOUT);
    }
}
