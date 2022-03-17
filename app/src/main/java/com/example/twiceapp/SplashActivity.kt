package com.example.twiceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //3000ms후에 MainActivity로 넘김
        Handler().postDelayed({
          startActivity(Intent(this, MainActivity::class.java))
          finish()
        }, 3000)
    }
}