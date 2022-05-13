package com.example.minigame

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class StartActivity(gamemode: Int) : AppCompatActivity() {

    private val mode: Int = gamemode

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("starting activity")
        when((1..13).random()) {
            1 -> {
                val intent = Intent(this@StartActivity, Path1Activity(mode)::class.java)
                startActivity(intent)
                println("1")
                finish()
            }
            2 -> {
                val intent = Intent(this@StartActivity, Path2Activity(mode)::class.java)
                startActivity(intent)
                println("2")
                finish()
            }
            3 -> {
                val intent = Intent(this@StartActivity, Path3Activity(mode)::class.java)
                startActivity(intent)
                println("3")
                finish()
            }
            4 -> {
                val intent = Intent(this@StartActivity, Path4Activity(mode)::class.java)
                startActivity(intent)
                println("4")
                finish()
            }
            5 -> {
                val intent = Intent(this@StartActivity, Path5Activity(mode)::class.java)
                startActivity(intent)
                println("5")
                finish()
            }
            6 -> {
                val intent = Intent(this@StartActivity, Path6Activity(mode)::class.java)
                startActivity(intent)
                println("6")
                finish()
            }
            7 -> {
                val intent = Intent(this@StartActivity, Path7Activity(mode)::class.java)
                startActivity(intent)
                println("7")
                finish()
            }
            8 -> {
                val intent = Intent(this@StartActivity, Path8Activity(mode)::class.java)
                startActivity(intent)
                println("8")
                finish()
            }
            9 -> {
                val intent = Intent(this@StartActivity, Path9Activity(mode)::class.java)
                startActivity(intent)
                println("9")
                finish()
            }
            10 -> {
                val intent = Intent(this@StartActivity, Path10Activity(mode)::class.java)
                startActivity(intent)
                println("10")
                finish()
            }
            11 -> {
                val intent = Intent(this@StartActivity, Path11Activity(mode)::class.java)
                startActivity(intent)
                println("11")
                finish()
            }
            12 -> {
                val intent = Intent(this@StartActivity, Path12Activity(mode)::class.java)
                startActivity(intent)
                println("12")
                finish()
            }
            13 -> {
                val intent = Intent(this@StartActivity, Path13Activity(mode)::class.java)
                startActivity(intent)
                println("13")
                finish()
            }
        }
    }
}