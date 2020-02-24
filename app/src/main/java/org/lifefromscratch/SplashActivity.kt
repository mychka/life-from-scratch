package org.lifefromscratch

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        LifeFromScratchApp.appStartedNormally = true

        super.onCreate(savedInstanceState)

        startActivity(Intent(this, LoginActivity::class.java))

        finish()
    }
}