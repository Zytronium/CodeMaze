package com.example.codeMaze

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val windowInsetsController =
            ViewCompat.getWindowInsetsController(window.decorView) ?: return
        windowInsetsController.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        windowInsetsController.hide(WindowInsetsCompat.Type.systemBars())
        windowInsetsController.hide(WindowInsetsCompat.Type.displayCutout())
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

//        val configuration = Configuration.Builder()
//            // Defines a thread pool with 10 threads.
//            // Ideally you would choose a number that is dynamic based on the number
//            // of cores on the device.
//            .setExecutor(Executors.newFixedThreadPool(100))
//            .build()
//        WorkManager.initialize(context, configuration)
//        WindowCompat.setDecorFitsSystemWindows(window, true)
    }

    enum class Gamemode { // 1 = Classic, 2 = SpeedMaze, 3 = Apocalypse, 4 = Glitch, 5 = PainMode, 6 = Inf, 7 SuddenDeath, 8 = NoMaze, 9 = Corruption. | 10 = Scavenger, 11 = TimeTrials, 0 = Story
        Classic, SpeedMaze, Apocalypse, Glitch, PainMode, Inf, SuddenDeath, NoMaze, Corruption, Scavenger, TimeTrials, Story
    }
    object GameGm {
        var gamemode: Gamemode = Gamemode.Classic
    }

    fun classic(view: View) {
        GameGm.gamemode = Gamemode.Classic
        val intent = Intent(this@MainMenuActivity, DifficultyActivity::class.java)
        startActivity(intent)
    }

    fun painMode(view: View) {
        GameGm.gamemode = Gamemode.PainMode
        val intent = Intent(this@MainMenuActivity, DifficultyActivity::class.java)
        startActivity(intent)
    }

    fun apocalypse(view: View) {
        GameGm.gamemode = Gamemode.Apocalypse
        val intent = Intent(this@MainMenuActivity, DifficultyActivity::class.java)
        startActivity(intent)
    }

    fun glitchSpread(view: View) {
        GameGm.gamemode = Gamemode.Glitch
        val intent = Intent(this@MainMenuActivity, DifficultyActivity::class.java)
        startActivity(intent)
    }

    fun infmode(view: View) {
        GameGm.gamemode = Gamemode.Inf
        val intent = Intent(this@MainMenuActivity, DifficultyActivity::class.java)
        startActivity(intent)
    }

    fun suddenDeath(view: View) {
    GameGm.gamemode = Gamemode.SuddenDeath
    val intent = Intent(this@MainMenuActivity, DifficultyActivity::class.java)
    startActivity(intent)
    }

    fun noMaze(view: View) {
        GameGm.gamemode = Gamemode.NoMaze
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
        GameGm.gamemode = Gamemode.SpeedMaze
        val intent = Intent(this@MainMenuActivity, StartActivity::class.java)
        startActivity(intent)
    }

    fun corruption(view: View) {
        GameGm.gamemode = Gamemode.Corruption
        val intent = Intent(this@MainMenuActivity, DifficultyActivity::class.java)
        startActivity(intent)
    }

    fun story(view: View) {
        val intent = Intent(this@MainMenuActivity, StoryStartActivity::class.java)
        startActivity(intent)}

}

// Ideas: each gamemode has its own separate StartActivity. For example, GlitchModeStartActivity for Glitch mode.