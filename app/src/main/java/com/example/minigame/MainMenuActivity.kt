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
        GameMode.gamemode = 1
        val intent = Intent(this@MainMenuActivity, DifficultyActivity::class.java)
        startActivity(intent)
    }

    fun painMode(view: View) {
        GameMode.gamemode = 5
        val intent = Intent(this@MainMenuActivity, DifficultyActivity::class.java)
        startActivity(intent)
    }

    object GameMode {
        var gamemode: Int = 1
    }

    fun apocalypse(view: View) {
        GameMode.gamemode = 3
        val intent = Intent(this@MainMenuActivity, DifficultyActivity::class.java)
        startActivity(intent)
    }

    fun glitchSpread(view: View) {
        GameMode.gamemode = 4
        val intent = Intent(this@MainMenuActivity, DifficultyActivity::class.java)
        startActivity(intent)
    }

    fun infmode(view: View) {
        GameMode.gamemode = 6
        val intent = Intent(this@MainMenuActivity, DifficultyActivity::class.java)
        startActivity(intent)
    }

    fun suddenDeath(view: View) {
    GameMode.gamemode = 7
    val intent = Intent(this@MainMenuActivity, DifficultyActivity::class.java)
    startActivity(intent)
    }

    fun settings(view: View) {
        val intent = Intent(this@MainMenuActivity, SettingsActivity::class.java)
        startActivity(intent)
    }

}

// Ideas: each gamemode has its own separate StartActivity. For example, GlitchModeStartActivity for Glitch mode.