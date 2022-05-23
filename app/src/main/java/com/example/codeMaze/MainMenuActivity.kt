package com.example.codeMaze

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.concurrent.Executors

class MainMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
//        val configuration = Configuration.Builder()
//            // Defines a thread pool with 10 threads.
//            // Ideally you would choose a number that is dynamic based on the number
//            // of cores on the device.
//            .setExecutor(Executors.newFixedThreadPool(100))
//            .build()
//
//        WorkManager.initialize(context, configuration)
//        WindowCompat.setDecorFitsSystemWindows(window, true)
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

    fun noMaze(view: View) {
        GameMode.gamemode = 8
        val intent = Intent(this@MainMenuActivity, DifficultyActivity::class.java)
        startActivity(intent)
    }

    fun settings(view: View) {
        val intent = Intent(this@MainMenuActivity, SettingsActivity::class.java)
        startActivity(intent)
    }

    fun about(view: View) {
        val intent = Intent(this@MainMenuActivity, AboutActivity::class.java)
        startActivity(intent)
    }

    fun speedMaze(view: View) {
        GameMode.gamemode = 2
        val intent = Intent(this@MainMenuActivity, DifficultyActivity::class.java)
        startActivity(intent)
    }

    fun story(view: View) {
        val intent = Intent(this@MainMenuActivity, StoryStartActivity::class.java)
        startActivity(intent)}

}

// Ideas: each gamemode has its own separate StartActivity. For example, GlitchModeStartActivity for Glitch mode.