package com.example.minigame

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.minigame.MainMenuActivity.GameMode.gamemode

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("starting activity")
        when((1..13).random()) {
            1 -> {
                val intent = Intent(this@StartActivity, Path1Activity::class.java)
                startActivity(intent)
                println("1")
                finish()
            }
            2 -> {
                val intent = Intent(this@StartActivity, Path2Activity::class.java)
                startActivity(intent)
                println("2")
                finish()
            }
            3 -> {
                val intent = Intent(this@StartActivity, Path3Activity::class.java)
                startActivity(intent)
                println("3")
                finish()
            }
            4 -> {
                val intent = Intent(this@StartActivity, Path4Activity::class.java)
                startActivity(intent)
                println("4")
                finish()
            }
            5 -> {
                val intent = Intent(this@StartActivity, Path5Activity::class.java)
                startActivity(intent)
                println("5")
                finish()
            }
            6 -> {
                val intent = Intent(this@StartActivity, Path6Activity::class.java)
                startActivity(intent)
                println("6")
                finish()
            }
            7 -> {
                val intent = Intent(this@StartActivity, Path7Activity::class.java)
                startActivity(intent)
                println("7")
                finish()
            }
            8 -> {
                val intent = Intent(this@StartActivity, Path8Activity::class.java)
                startActivity(intent)
                println("8")
                finish()
            }
            9 -> {
                val intent = Intent(this@StartActivity, Path9Activity::class.java)
                startActivity(intent)
                println("9")
                finish()
            }
            10 -> {
                val intent = Intent(this@StartActivity, Path10Activity::class.java)
                startActivity(intent)
                println("10")
                finish()
            }
            11 -> {
                val intent = Intent(this@StartActivity, Path11Activity::class.java)
                startActivity(intent)
                println("11")
                finish()
            }
            12 -> {
                val intent = Intent(this@StartActivity, Path12Activity::class.java)
                startActivity(intent)
                println("12")
                finish()
            }
            13 -> {
                val intent = Intent(this@StartActivity, Path13Activity::class.java)
                startActivity(intent)
                println("13")
                finish()
            }
        }
    }
}