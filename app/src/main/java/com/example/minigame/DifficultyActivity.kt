package com.example.minigame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DifficultyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_difficulty)
    }

    fun beginner(view: View) {
        Difficulty.difficulty = 1
        val intent = Intent(this@DifficultyActivity, StartActivity::class.java)
        startActivity(intent)
        finish()
    }

    object Difficulty {
        var difficulty: Int = 1
    }

    fun easy(view: View) {
        Difficulty.difficulty = 2
        val intent = Intent(this@DifficultyActivity, StartActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun medium(view: View) {
        Difficulty.difficulty = 3
        val intent = Intent(this@DifficultyActivity, StartActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun hard(view: View) {
        Difficulty.difficulty = 4
        val intent = Intent(this@DifficultyActivity, StartActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun harder(view: View) {
        Difficulty.difficulty = 5
        val intent = Intent(this@DifficultyActivity, StartActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun expert(view: View) {
        Difficulty.difficulty = 6
        val intent = Intent(this@DifficultyActivity, StartActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun impossible(view: View) {
        Difficulty.difficulty = 7
        val intent = Intent(this@DifficultyActivity, StartActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun impossiblePlus(view: View) {
        Difficulty.difficulty = 8
        val intent = Intent(this@DifficultyActivity, StartActivity::class.java)
        startActivity(intent)
        finish()
    }

}