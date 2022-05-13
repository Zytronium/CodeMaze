package com.example.minigame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
    }

    fun classic(view: View) {
        val intent = Intent(this@MainMenuActivity, StartActivity(1)::class.java)
        startActivity(intent)
        finish()
    }

    fun painMode(view: View) {
        val intent = Intent(this@MainMenuActivity, StartActivity(5)::class.java)
        startActivity(intent)
        finish()
    }

}

// Ideas: each gamemode has its own separate StartActivity. For example, GlitchModeStartActivity for Glitch mode.