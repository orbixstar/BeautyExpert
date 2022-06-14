package com.orbixstar.beautyapp.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.orbixstar.beautyapp.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        splashScreen()
    }

    private fun splashScreen() {
        Handler(Looper.getMainLooper()).postDelayed({
            if (!isFinishing) {

                startActivity(Intent(this, TutorialActivity::class.java))
                finish()
            }
        }, 1000)
    }
}