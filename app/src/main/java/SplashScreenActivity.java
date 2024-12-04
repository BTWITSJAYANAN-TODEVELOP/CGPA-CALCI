package com.example.cgpacalci;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);  // Make sure activity_splash_screen.xml exists

        // Handler to show the splash screen for 3 seconds and then start MainActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start MainActivity after the splash screen
                Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish();  // Finish SplashActivity so that it doesn't show again
            }
        }, 3000);  // 3000 milliseconds = 3 seconds
    }
}
