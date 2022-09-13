package com.example.codeMaze

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.example.codeMaze.MainMenuActivity.GameGm.gamemode

class DifficultyActivity : AppCompatActivity() {
    private lateinit var diffText: TextView
    private lateinit var startBtn: Button

    private lateinit var beginnerBtn: Button
    private lateinit var easyBtn: Button
    private lateinit var normalBtn: Button
    private lateinit var hardBtn: Button
    private lateinit var experiencedBtn: Button
    private lateinit var expertBtn: Button
    private lateinit var masterBtn: Button
    private lateinit var deityBtn: Button
    private lateinit var impossibleBtn: Button
    private lateinit var impossiblePlusBtn: Button
    private lateinit var custardBtn: Button
    private lateinit var diffButtons: Array<Button>
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_difficulty)
        diffText = findViewById(R.id.desc)
        startBtn = findViewById(R.id.startBtn)

        beginnerBtn = findViewById(R.id.btn_beginner)
        easyBtn = findViewById(R.id.btn_easy)
        normalBtn = findViewById(R.id.btn_medium)
        hardBtn = findViewById(R.id.btn_hard)
        experiencedBtn = findViewById(R.id.btn_experienced)
        expertBtn = findViewById(R.id.btn_expert)
        masterBtn = findViewById(R.id.btn_master)
        deityBtn = findViewById(R.id.btn_deity)
        impossibleBtn = findViewById(R.id.btn_impossible)
        impossiblePlusBtn = findViewById(R.id.btn_impossiblePlus)
        custardBtn = findViewById(R.id.btn_custard)
        diffButtons = arrayOf(beginnerBtn, easyBtn, normalBtn, hardBtn, experiencedBtn, expertBtn, masterBtn, deityBtn, impossibleBtn, impossiblePlusBtn, custardBtn)

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

        diffText.text = getString(R.string.diff_text, "No Difficulty Selected;\nChoose a difficulty level to see a description")

        diffText.setOnLongClickListener{

            Difficulty.difficulty = 0
            startBtn.isEnabled = true
            startBtn.setBackgroundColor(getColor(R.color.blue))
            startBtn.setTextColor(getColor(R.color.glow_teal))

            diffText.text = getString(R.string.diff_text, "In baby mode, the player looses at only 30 issues and wins at a goal of 3 optimizers. In Apocalypse mode, tiles progress to worse stages every 5 seconds. This might be the hardest difficulty yet. This hidden mode has bee used for testing purposes, but it is fine to use if you just can't do it on beginner mode.")
            resizeText()
            resetButtonScales()
            true
        }


    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun resizeText() {
        fun setAutoSizeTextTypeUniformWithConfiguration(
            autoSizeMinTextSize: Int, autoSizeMaxTextSize: Int,
            autoSizeStepGranularity: Int, unit: Int
        ) {}
//        setAutoSizeTextTypeUniformWithConfiguration(int autoSizeMinTextSize, int autoSizeMaxTextSize,
//            int autoSizeStepGranularity, int unit)

        diffText.setAutoSizeTextTypeUniformWithConfiguration(
            12, 225, 4, TypedValue.COMPLEX_UNIT_DIP);
    }

    object Difficulty {
        var difficulty: Int = 0
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun custom(view: View) {
        Difficulty.difficulty = -1
        startBtn.isEnabled = true
        startBtn.setBackgroundColor(getColor(R.color.blue))
        startBtn.setTextColor(getColor(R.color.glow_teal))

        diffText.text = getString(R.string.diff_text, "In custom difficulty, you choose all, the parameters. Currently, customizable parameters include choosing the amount of issues the player looses at, the range of numbers that the optimizers goal can be, and, if your in Apocalypse mode, the speed Apocalypse mode progresses.")
        resizeText()
        resetButtonScales()
        view.scaleX = 1f
        view.scaleY = 1f
    }

    private fun resetButtonScales() {
        diffButtons.forEach { button: Button ->
            run {
                button.scaleX = 0.95f
                button.scaleY = 0.95f
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun beginner(view: View) {
        Difficulty.difficulty = 1
         startBtn.isEnabled = true
        startBtn.setBackgroundColor(getColor(R.color.blue))
        startBtn.setTextColor(getColor(R.color.glow_teal))

        diffText.text = getString(R.string.diff_text, "In beginner mode, the player looses at 20 issues and wins at a goal of 5 to 10 optimizers. In Apocalypse mode, tiles progress to worse stages every 2.5 seconds. This gamemode is perfect for beginners. ")
        resizeText()
        resetButtonScales()
        view.scaleX = 1f
        view.scaleY = 1f
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun easy(view: View) {
        Difficulty.difficulty = 2
        startBtn.isEnabled = true
        startBtn.setBackgroundColor(getColor(R.color.blue))
        startBtn.setTextColor(getColor(R.color.glow_teal))

        diffText.text = getString(R.string.diff_text, "In easy mode, the player looses at 15 issues and wins at 10 to 15 optimizers. In Apocalypse mode, tiles progress to worse stages every 1.5 seconds.")
        resizeText()
        resetButtonScales()
        view.scaleX = 1f
        view.scaleY = 1f
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun medium(view: View) {
        Difficulty.difficulty = 3
        startBtn.isEnabled = true
        startBtn.setBackgroundColor(getColor(R.color.blue))
        startBtn.setTextColor(getColor(R.color.glow_teal))

        diffText.text = getString(R.string.diff_text, "In normal mode, the player looses at 10 issues and wins at 15 to 25 optimizers. In Apocalypse mode, tiles progress to worse stages every 1 second. This is recommended for an average game")
        resizeText()
        resetButtonScales()
        view.scaleX = 1f
        view.scaleY = 1f
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun hard(view: View) {
        Difficulty.difficulty = 4
        startBtn.isEnabled = true
        startBtn.setBackgroundColor(getColor(R.color.blue))
        startBtn.setTextColor(getColor(R.color.glow_teal))

        diffText.text = getString(R.string.diff_text, "In hard mode, the player looses at 10 issues and wins at 30 to 60 optimizers. In Apocalypse mode, tiles progress to worse stages every 1 second.")
        resizeText()
        resetButtonScales()
        view.scaleX = 1f
        view.scaleY = 1f
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun experienced(view: View) {
        Difficulty.difficulty = 5
        startBtn.isEnabled = true
        startBtn.setBackgroundColor(getColor(R.color.blue))
        startBtn.setTextColor(getColor(R.color.glow_teal))

        diffText.text = getString(R.string.diff_text, "In experienced mode, the player looses at 9 issues and wins at 65 to 135 optimizers. In Apocalypse mode, tiles progress to worse stages every 3/4 of a second.")
        resizeText()
        resetButtonScales()
        view.scaleX = 1f
        view.scaleY = 1f
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun expert(view: View) {
        Difficulty.difficulty = 6
        startBtn.isEnabled = true
        startBtn.setBackgroundColor(getColor(R.color.blue))
        startBtn.setTextColor(getColor(R.color.glow_teal))

        diffText.text = getString(R.string.diff_text, "In expert mode, the player looses at 8 issues and wins at 150 to 275 optimizers. In Apocalypse mode, tiles progress to worse stages every 3/4 of a second.")
        resizeText()
        resetButtonScales()
        view.scaleX = 1f
        view.scaleY = 1f
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun master(view: View) {
        Difficulty.difficulty = 7
        startBtn.isEnabled = true
        startBtn.setBackgroundColor(getColor(R.color.blue))
        startBtn.setTextColor(getColor(R.color.glow_teal))

        diffText.text = getString(R.string.diff_text, "In master mode, the player looses at 7 issues and wins at 300 to 425 optimizers. In Apocalypse mode, tiles progress to worse stages every half a second.")
        resizeText()
        resetButtonScales()
        view.scaleX = 1f
        view.scaleY = 1f
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun deity(view: View) {
        Difficulty.difficulty = 8
        startBtn.isEnabled = true
        startBtn.setBackgroundColor(getColor(R.color.blue))
        startBtn.setTextColor(getColor(R.color.glow_teal))

        diffText.text = getString(R.string.diff_text, "In deity mode, the player looses at 6 issues and wins at 444 to 777 optimizers. How lucky... In Apocalypse mode, tiles progress to worse stages every half a second.")
        resizeText()
        resetButtonScales()
        view.scaleX = 1f
        view.scaleY = 1f
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun impossible(view: View) {
        Difficulty.difficulty = 9
        startBtn.isEnabled = true
        startBtn.setBackgroundColor(getColor(R.color.blue))
        startBtn.setTextColor(getColor(R.color.glow_teal))

        diffText.text = getString(R.string.diff_text, "In impossible mode, the player looses at just 5 issues and wins at 800 to 1500 optimizers. In Apocalypse mode, tiles progress to worse stages every 1/3 of a second. Try this if you want to be playing for an hour only to loose when your almost there.")
        resizeText()
        resetButtonScales()
        view.scaleX = 1f
        view.scaleY = 1f
    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun impossiblePlus(view: View) {
        Difficulty.difficulty = 10
        startBtn.isEnabled = true
        startBtn.setBackgroundColor(getColor(R.color.blue))
        startBtn.setTextColor(getColor(R.color.glow_teal))

        diffText.text = getString(R.string.diff_text, "In impossible+ mode, the player looses at only 3 issues, and wins at 2000 to 5000 optimizers. In Apocalypse mode, tiles progress to worse stages every quarter second. If you can beat this you'll win one trillion useless points. Seriously, don't try this, it's not worth it.")
        resizeText()
        resetButtonScales()
        view.scaleX = 1f
        view.scaleY = 1f
    }

    fun start(view: View) {
        var intent = Intent(this@DifficultyActivity, StartActivity::class.java)
        if (gamemode == MainMenuActivity.Gamemode.NoMaze) intent = Intent(this@DifficultyActivity, MainActivity::class.java)
        if (Difficulty.difficulty == -1) intent = Intent(this@DifficultyActivity, CustomizeDifficultyActivity::class.java)
        startActivity(intent)
        finish()
    }

}