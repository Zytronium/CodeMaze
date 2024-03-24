package com.example.codeMaze

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import kotlin.math.roundToInt

class CustomizeDifficultyActivity : AppCompatActivity() {
    private lateinit var optiMinNum: EditText
    private lateinit var optiMaxNum: EditText
    private lateinit var issueMax: EditText
    private lateinit var apocLoopSpeed: EditText
    private lateinit var apocSpeedSet: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customize_difficulty)
        optiMinNum = findViewById(R.id.optiMin)
        optiMaxNum = findViewById(R.id.optiMax)
        issueMax = findViewById(R.id.maxIssues)
        apocLoopSpeed = findViewById(R.id.loopSpeed)
        apocSpeedSet = findViewById(R.id.apocSpd)
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
        if((MainMenuActivity.GameGm.gamemode == MainMenuActivity.Gamemode.Apocalypse || MainMenuActivity.GameGm.gamemode == MainMenuActivity.Gamemode.Stages)) apocSpeedSet.visibility = View.VISIBLE

    }

    fun start(view: View) {
        var intent = Intent(this@CustomizeDifficultyActivity, StartActivity::class.java)
        if (MainMenuActivity.GameGm.gamemode == MainMenuActivity.Gamemode.NoMaze) intent = Intent(this@CustomizeDifficultyActivity, MainActivity::class.java)

        if (!optiMinNum.text.isNullOrEmpty() && !optiMaxNum.text.isNullOrEmpty() && !issueMax.text.isNullOrEmpty()) {
            if (optiMinNum.text.toString().toInt() <= optiMaxNum.text.toString().toInt()) {
                if (((MainMenuActivity.GameGm.gamemode == MainMenuActivity.Gamemode.Apocalypse || MainMenuActivity.GameGm.gamemode == MainMenuActivity.Gamemode.Stages) && !apocLoopSpeed.text.isNullOrEmpty()) || (MainMenuActivity.GameGm.gamemode != MainMenuActivity.Gamemode.Apocalypse &&  MainMenuActivity.GameGm.gamemode != MainMenuActivity.Gamemode.Stages)) {

                    CustomDifficulty.optiMin = optiMinNum.text.toString().toInt()
                    CustomDifficulty.optiMax = optiMaxNum.text.toString().toInt()
                    CustomDifficulty.issuesMax = issueMax.text.toString().toInt()
                    if ((MainMenuActivity.GameGm.gamemode == MainMenuActivity.Gamemode.Apocalypse || MainMenuActivity.GameGm.gamemode == MainMenuActivity.Gamemode.Stages)) {
                        val loopTime = (apocLoopSpeed.text.toString().toDouble() * 1000).roundToInt()
                        CustomDifficulty.apocLoopTime = loopTime
                        if (loopTime <= 60000) {
                            startActivity(intent)
                            finish()
                        } else Toast.makeText(applicationContext, "Apocalypse Speed cannot be over a minute.", Toast.LENGTH_SHORT).show()
                    } else {
                        startActivity(intent)
                        finish()
                    }

                } else if ((MainMenuActivity.GameGm.gamemode == MainMenuActivity.Gamemode.Apocalypse || MainMenuActivity.GameGm.gamemode == MainMenuActivity.Gamemode.Stages) && apocLoopSpeed.text.isNullOrEmpty()) Toast.makeText(applicationContext, "Please fill out every option.", Toast.LENGTH_SHORT).show()
            } else Toast.makeText(applicationContext, "Make sure the Minimum Optimizers Goal you set is less than the maximum you set.", Toast.LENGTH_LONG).show()

        } else Toast.makeText(applicationContext, "Please fill out every option.", Toast.LENGTH_SHORT).show()

    }
    
    object CustomDifficulty {
        var apocLoopTime = 1000
        var optiMin = 0
        var optiMax = 0

        var issuesMax = 0
    }
}