package com.example.codeMaze

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.codeMaze.MainMenuActivity.GameMode.gamemode

class DifficultyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_difficulty)
    }

    object Difficulty {
        var difficulty: Int = 1
    }

    fun beginner(view: View) {
        Difficulty.difficulty = 1
        var intent = Intent(this@DifficultyActivity, StartActivity::class.java)
        if (gamemode == 8) intent = Intent(this@DifficultyActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun easy(view: View) {
        Difficulty.difficulty = 2
        var intent = Intent(this@DifficultyActivity, StartActivity::class.java)
        if (gamemode == 8) intent = Intent(this@DifficultyActivity, MainActivity::class.java)
        startActivity(intent)
//        finish()
    }
    fun medium(view: View) {
        Difficulty.difficulty = 3
        var intent = Intent(this@DifficultyActivity, StartActivity::class.java)
        if (gamemode == 8) intent = Intent(this@DifficultyActivity, MainActivity::class.java)
        startActivity(intent)
//        finish()
    }
    fun hard(view: View) {
        Difficulty.difficulty = 4
        var intent = Intent(this@DifficultyActivity, StartActivity::class.java)
        if (gamemode == 8) intent = Intent(this@DifficultyActivity, MainActivity::class.java)
        startActivity(intent)
//        finish()
    }
    fun experienced(view: View) {
        Difficulty.difficulty = 5
        var intent = Intent(this@DifficultyActivity, StartActivity::class.java)
        if (gamemode == 8) intent = Intent(this@DifficultyActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun expert(view: View) {
        Difficulty.difficulty = 6
        var intent = Intent(this@DifficultyActivity, StartActivity::class.java)
        if (gamemode == 8) intent = Intent(this@DifficultyActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun master(view: View) {
        Difficulty.difficulty = 7
        var intent = Intent(this@DifficultyActivity, StartActivity::class.java)
        if (gamemode == 8) intent = Intent(this@DifficultyActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun deity(view: View) {
        Difficulty.difficulty = 8
        var intent = Intent(this@DifficultyActivity, StartActivity::class.java)
        if (gamemode == 8) intent = Intent(this@DifficultyActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun impossible(view: View) {
        Difficulty.difficulty = 9
        var intent = Intent(this@DifficultyActivity, StartActivity::class.java)
        if (gamemode == 8) intent = Intent(this@DifficultyActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun impossiblePlus(view: View) {
        Difficulty.difficulty = 10
        var intent = Intent(this@DifficultyActivity, StartActivity::class.java)
        if (gamemode == 8) intent = Intent(this@DifficultyActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

}