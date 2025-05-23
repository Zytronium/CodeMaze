package com.example.codeMaze

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.graphics.RenderEffect
import android.graphics.Shader
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.*
import android.view.*
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.*
import androidx.gridlayout.widget.GridLayout
import com.example.codeMaze.Path1Tiles.ALL_TILES
import com.example.codeMaze.Path1Tiles.TILE0
import com.example.codeMaze.Path1Tiles.TILE1
import com.example.codeMaze.Path1Tiles.TILE10
import com.example.codeMaze.Path1Tiles.TILE11
import com.example.codeMaze.Path1Tiles.TILE12
import com.example.codeMaze.Path1Tiles.TILE13
import com.example.codeMaze.Path1Tiles.TILE14
import com.example.codeMaze.Path1Tiles.TILE15
import com.example.codeMaze.Path1Tiles.TILE16
import com.example.codeMaze.Path1Tiles.TILE17
import com.example.codeMaze.Path1Tiles.TILE18
import com.example.codeMaze.Path1Tiles.TILE19
import com.example.codeMaze.Path1Tiles.TILE2
import com.example.codeMaze.Path1Tiles.TILE20
import com.example.codeMaze.Path1Tiles.TILE21
import com.example.codeMaze.Path1Tiles.TILE22
import com.example.codeMaze.Path1Tiles.TILE23
import com.example.codeMaze.Path1Tiles.TILE24
import com.example.codeMaze.Path1Tiles.TILE25
import com.example.codeMaze.Path1Tiles.TILE26
import com.example.codeMaze.Path1Tiles.TILE27
import com.example.codeMaze.Path1Tiles.TILE28
import com.example.codeMaze.Path1Tiles.TILE29
import com.example.codeMaze.Path1Tiles.TILE3
import com.example.codeMaze.Path1Tiles.TILE30
import com.example.codeMaze.Path1Tiles.TILE31
import com.example.codeMaze.Path1Tiles.TILE32
import com.example.codeMaze.Path1Tiles.TILE33
import com.example.codeMaze.Path1Tiles.TILE34
import com.example.codeMaze.Path1Tiles.TILE35
import com.example.codeMaze.Path1Tiles.TILE36
import com.example.codeMaze.Path1Tiles.TILE37
import com.example.codeMaze.Path1Tiles.TILE38
import com.example.codeMaze.Path1Tiles.TILE39
import com.example.codeMaze.Path1Tiles.TILE4
import com.example.codeMaze.Path1Tiles.TILE40
import com.example.codeMaze.Path1Tiles.TILE41
import com.example.codeMaze.Path1Tiles.TILE42
import com.example.codeMaze.Path1Tiles.TILE43
import com.example.codeMaze.Path1Tiles.TILE44
import com.example.codeMaze.Path1Tiles.TILE45
import com.example.codeMaze.Path1Tiles.TILE46
import com.example.codeMaze.Path1Tiles.TILE47
import com.example.codeMaze.Path1Tiles.TILE48
import com.example.codeMaze.Path1Tiles.TILE49
import com.example.codeMaze.Path1Tiles.TILE5
import com.example.codeMaze.Path1Tiles.TILE50
import com.example.codeMaze.Path1Tiles.TILE51
import com.example.codeMaze.Path1Tiles.TILE52
import com.example.codeMaze.Path1Tiles.TILE53
import com.example.codeMaze.Path1Tiles.TILE54
import com.example.codeMaze.Path1Tiles.TILE55
import com.example.codeMaze.Path1Tiles.TILE56
import com.example.codeMaze.Path1Tiles.TILE57
import com.example.codeMaze.Path1Tiles.TILE58
import com.example.codeMaze.Path1Tiles.TILE59
import com.example.codeMaze.Path1Tiles.TILE6
import com.example.codeMaze.Path1Tiles.TILE60
import com.example.codeMaze.Path1Tiles.TILE61
import com.example.codeMaze.Path1Tiles.TILE62
import com.example.codeMaze.Path1Tiles.TILE63
import com.example.codeMaze.Path1Tiles.TILE64
import com.example.codeMaze.Path1Tiles.TILE65
import com.example.codeMaze.Path1Tiles.TILE66
import com.example.codeMaze.Path1Tiles.TILE67
import com.example.codeMaze.Path1Tiles.TILE68
import com.example.codeMaze.Path1Tiles.TILE69
import com.example.codeMaze.Path1Tiles.TILE7
import com.example.codeMaze.Path1Tiles.TILE70
import com.example.codeMaze.Path1Tiles.TILE71
import com.example.codeMaze.Path1Tiles.TILE72
import com.example.codeMaze.Path1Tiles.TILE73
import com.example.codeMaze.Path1Tiles.TILE74
import com.example.codeMaze.Path1Tiles.TILE75
import com.example.codeMaze.Path1Tiles.TILE76
import com.example.codeMaze.Path1Tiles.TILE77
import com.example.codeMaze.Path1Tiles.TILE78
import com.example.codeMaze.Path1Tiles.TILE79
import com.example.codeMaze.Path1Tiles.TILE8
import com.example.codeMaze.Path1Tiles.TILE80
import com.example.codeMaze.Path1Tiles.TILE81
import com.example.codeMaze.Path1Tiles.TILE82
import com.example.codeMaze.Path1Tiles.TILE83
import com.example.codeMaze.Path1Tiles.TILE84
import com.example.codeMaze.Path1Tiles.TILE85
import com.example.codeMaze.Path1Tiles.TILE86
import com.example.codeMaze.Path1Tiles.TILE87
import com.example.codeMaze.Path1Tiles.TILE88
import com.example.codeMaze.Path1Tiles.TILE89
import com.example.codeMaze.Path1Tiles.TILE9
import com.example.codeMaze.Path1Tiles.TILE90
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.concurrent.thread

class MainActivity(visualGen: Boolean = false) : AppCompatActivity() {
    // 1 = classic; 2 = speed maze; 3 = speedrun;
    // 4 = glitch; 5 = pain mode; 6 = infinite;
    // 7 = sudden death; 8 = no maze; 9 = corruption

    private var loopTime = 1000
    private var playing: Boolean = true
    private var timerStarted: Boolean = false
    private var playerColor: Int = Color.WHITE
    private var hasLost: Boolean = false
    private var hasWon: Boolean = false
    private var stage: Int = 0
    /* */ private var mode: MainMenuActivity.Gamemode = MainMenuActivity.GameGm.gamemode // 1 = classic; 2 = speed maze; 3 = speedrun; 4 = glitch; 5 = pain mode; 6 = infinite; 7 = sudden death; 8 = no maze; 9 = corruption
    /* */ private var difficulty: Int = DifficultyActivity.Difficulty.difficulty //0 //(1..4).random() // 0 - baby | 1 - beginner | 2 - easy | 3 - medium | 4 - hard | 5 - harder | 6 - expert | 7 - impossible | 8 - impossible++
    private var foolsColors = emptyArray<Int>()
    private var foolsFixColor: Int = 0
    private var foolsPathColor: Int = 0
    private var foolsGlitchColor: Int = 0
    private var foolsErrorColor: Int = 0
    private var foolsWarningColor: Int = 0
    private var foolsCrashColor: Int = 0
    private var foolsBombColor: Int = 0
    private var alphaUp: Boolean = true
    private var alphaDown: Boolean = false
    private var playerShaking: Boolean = false
    private var optiFails: Int = 0
    private var fixFails: Int = 0
    private var fixFails2: Int = 0
    private var errorFails: Int = 0
    private var crashFails: Int = 0
    private var glitchFails: Int = 0
    private var finBlockGenerated: Boolean = false
    private lateinit var shared : SharedPreferences

    // ~ Stats: ~ \\
    private var issues: Int = 0
    /* */ private var level: Int = 1
    private var optimizers: Int = 0
    private var time: Double = 5.0 // 0.0
    private var maxTime: Double = 30.0 // change
    /* */ private var totalOptimizers: Int = 0
    private var optiGoal: Int = 25
    private var maxIssues = 10
    // ~ Stats ~ \\

    private lateinit var postGameText: TextView
    private lateinit var restartButton: Button
    private lateinit var menuButton: Button
    private lateinit var grid: GridLayout
    private lateinit var screen: ConstraintLayout
    private lateinit var issuesText: TextView
    private lateinit var optiText: TextView
    private lateinit var timeBar: ProgressBar
    private lateinit var player: ImageView

    private lateinit var tile1: FrameLayout
    private lateinit var tile0: FrameLayout
    private lateinit var tile2: FrameLayout
    private lateinit var tile3: FrameLayout
    private lateinit var tile4: FrameLayout
    private lateinit var tile5: FrameLayout
    private lateinit var tile6: FrameLayout
    private lateinit var tile7: FrameLayout
    private lateinit var tile8: FrameLayout
    private lateinit var tile9: FrameLayout
    private lateinit var tile10: FrameLayout
    private lateinit var tile11: FrameLayout
    private lateinit var tile12: FrameLayout
    private lateinit var tile13: FrameLayout
    private lateinit var tile14: FrameLayout
    private lateinit var tile15: FrameLayout
    private lateinit var tile16: FrameLayout
    private lateinit var tile17: FrameLayout
    private lateinit var tile18: FrameLayout
    private lateinit var tile19: FrameLayout
    private lateinit var tile20: FrameLayout
    private lateinit var tile21: FrameLayout
    private lateinit var tile22: FrameLayout
    private lateinit var tile23: FrameLayout
    private lateinit var tile24: FrameLayout
    private lateinit var tile25: FrameLayout
    private lateinit var tile26: FrameLayout
    private lateinit var tile27: FrameLayout
    private lateinit var tile28: FrameLayout
    private lateinit var tile29: FrameLayout
    private lateinit var tile30: FrameLayout
    private lateinit var tile31: FrameLayout
    private lateinit var tile32: FrameLayout
    private lateinit var tile33: FrameLayout
    private lateinit var tile34: FrameLayout
    private lateinit var tile35: FrameLayout
    private lateinit var tile36: FrameLayout
    private lateinit var tile37: FrameLayout
    private lateinit var tile38: FrameLayout
    private lateinit var tile39: FrameLayout
    private lateinit var tile40: FrameLayout
    private lateinit var tile41: FrameLayout
    private lateinit var tile42: FrameLayout
    private lateinit var tile43: FrameLayout
    private lateinit var tile44: FrameLayout
    private lateinit var tile45: FrameLayout
    private lateinit var tile46: FrameLayout
    private lateinit var tile47: FrameLayout
    private lateinit var tile48: FrameLayout
    private lateinit var tile49: FrameLayout
    private lateinit var tile50: FrameLayout
    private lateinit var tile51: FrameLayout
    private lateinit var tile52: FrameLayout
    private lateinit var tile53: FrameLayout
    private lateinit var tile54: FrameLayout
    private lateinit var tile55: FrameLayout
    private lateinit var tile56: FrameLayout
    private lateinit var tile57: FrameLayout
    private lateinit var tile58: FrameLayout
    private lateinit var tile59: FrameLayout
    private lateinit var tile60: FrameLayout
    private lateinit var tile61: FrameLayout
    private lateinit var tile62: FrameLayout
    private lateinit var tile63: FrameLayout
    private lateinit var tile64: FrameLayout
    private lateinit var tile65: FrameLayout
    private lateinit var tile66: FrameLayout
    private lateinit var tile67: FrameLayout
    private lateinit var tile68: FrameLayout
    private lateinit var tile69: FrameLayout
    private lateinit var tile70: FrameLayout
    private lateinit var tile71: FrameLayout
    private lateinit var tile72: FrameLayout
    private lateinit var tile73: FrameLayout
    private lateinit var tile74: FrameLayout
    private lateinit var tile75: FrameLayout
    private lateinit var tile76: FrameLayout
    private lateinit var tile77: FrameLayout
    private lateinit var tile78: FrameLayout
    private lateinit var tile79: FrameLayout
    private lateinit var tile80: FrameLayout
    private lateinit var tile81: FrameLayout
    private lateinit var tile82: FrameLayout
    private lateinit var tile83: FrameLayout
    private lateinit var tile84: FrameLayout
    private lateinit var tile85: FrameLayout
    private lateinit var tile86: FrameLayout
    private lateinit var tile87: FrameLayout
    private lateinit var tile88: FrameLayout
    private lateinit var tile89: FrameLayout
    private lateinit var tile90: FrameLayout
    private lateinit var allTiles: Array<FrameLayout>
    private var rainbowAttempts: Int = 0

    private var mainLayout: ViewGroup? = null
    private var xDelta = 0
    private var yDelta = 0

    private var rot1start =  0f
    private var rot1end =  (-5..5).random().toFloat()
    private var rot2start =  0f
    private var rot2end =  (-5..5).random().toFloat()
    private var rot3start =  0f
    private var rot3end =  (-5..5).random().toFloat()

    private var pRot1start =  0f
    private var pRot1end =  (-4..4).random().toFloat()
    private var pRot2start =  0f
    private var pRot2end =  (-4..4).random().toFloat()
    private var pRot3start =  0f
    private var pRot3end =  (-4..4).random().toFloat()

    @SuppressLint("ClickableViewAccessibility")
    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        shared = getSharedPreferences("CodeMinigameDB", Context.MODE_PRIVATE)

        postGameText = findViewById(R.id.pgtv)
        restartButton = findViewById(R.id.btn_restart)
        menuButton = findViewById(R.id.btn_goto_menu)
        grid = findViewById(R.id.grid)
        screen = findViewById(R.id.screen)
        issuesText = findViewById(R.id.textView2)
        optiText = findViewById(R.id.textView3)
        timeBar = findViewById(R.id.timeBar)
        player = findViewById(R.id.player)
        tile0 = findViewById(R.id.tile0)
        tile1 = findViewById(R.id.tile1)
        tile2 = findViewById(R.id.tile2)
        tile3 = findViewById(R.id.tile3)
        tile4 = findViewById(R.id.tile4)
        tile5 = findViewById(R.id.tile5)
        tile6 = findViewById(R.id.tile6)
        tile7 = findViewById(R.id.tile7)
        tile8 = findViewById(R.id.tile8)
        tile9 = findViewById(R.id.tile9)
        tile10 = findViewById(R.id.tile10)
        tile11 = findViewById(R.id.tile11)
        tile12 = findViewById(R.id.tile12)
        tile13 = findViewById(R.id.tile13)
        tile14 = findViewById(R.id.tile14)
        tile15 = findViewById(R.id.tile15)
        tile16 = findViewById(R.id.tile16)
        tile17 = findViewById(R.id.tile17)
        tile18 = findViewById(R.id.tile18)
        tile19 = findViewById(R.id.tile19)
        tile20 = findViewById(R.id.tile20)
        tile21 = findViewById(R.id.tile21)
        tile22 = findViewById(R.id.tile22)
        tile23 = findViewById(R.id.tile23)
        tile24 = findViewById(R.id.tile24)
        tile25 = findViewById(R.id.tile25)
        tile26 = findViewById(R.id.tile26)
        tile27 = findViewById(R.id.tile27)
        tile28 = findViewById(R.id.tile28)
        tile29 = findViewById(R.id.tile29)
        tile30 = findViewById(R.id.tile30)
        tile31 = findViewById(R.id.tile31)
        tile32 = findViewById(R.id.tile32)
        tile33 = findViewById(R.id.tile33)
        tile34 = findViewById(R.id.tile34)
        tile35 = findViewById(R.id.tile35)
        tile36 = findViewById(R.id.tile36)
        tile37 = findViewById(R.id.tile37)
        tile38 = findViewById(R.id.tile38)
        tile39 = findViewById(R.id.tile39)
        tile40 = findViewById(R.id.tile40)
        tile41 = findViewById(R.id.tile41)
        tile42 = findViewById(R.id.tile42)
        tile43 = findViewById(R.id.tile43)
        tile44 = findViewById(R.id.tile44)
        tile45 = findViewById(R.id.tile45)
        tile46 = findViewById(R.id.tile46)
        tile47 = findViewById(R.id.tile47)
        tile48 = findViewById(R.id.tile48)
        tile49 = findViewById(R.id.tile49)
        tile50 = findViewById(R.id.tile50)
        tile51 = findViewById(R.id.tile51)
        tile52 = findViewById(R.id.tile52)
        tile53 = findViewById(R.id.tile53)
        tile54 = findViewById(R.id.tile54)
        tile55 = findViewById(R.id.tile55)
        tile56 = findViewById(R.id.tile56)
        tile57 = findViewById(R.id.tile57)
        tile58 = findViewById(R.id.tile58)
        tile59 = findViewById(R.id.tile59)
        tile60 = findViewById(R.id.tile60)
        tile61 = findViewById(R.id.tile61)
        tile62 = findViewById(R.id.tile62)
        tile63 = findViewById(R.id.tile63)
        tile64 = findViewById(R.id.tile64)
        tile65 = findViewById(R.id.tile65)
        tile66 = findViewById(R.id.tile66)
        tile67 = findViewById(R.id.tile67)
        tile68 = findViewById(R.id.tile68)
        tile69 = findViewById(R.id.tile69)
        tile70 = findViewById(R.id.tile70)
        tile71 = findViewById(R.id.tile71)
        tile72 = findViewById(R.id.tile72)
        tile73 = findViewById(R.id.tile73)
        tile74 = findViewById(R.id.tile74)
        tile75 = findViewById(R.id.tile75)
        tile76 = findViewById(R.id.tile76)
        tile77 = findViewById(R.id.tile77)
        tile78 = findViewById(R.id.tile78)
        tile79 = findViewById(R.id.tile79)
        tile80 = findViewById(R.id.tile80)
        tile81 = findViewById(R.id.tile81)
        tile82 = findViewById(R.id.tile82)
        tile83 = findViewById(R.id.tile83)
        tile84 = findViewById(R.id.tile84)
        tile85 = findViewById(R.id.tile85)
        tile86 = findViewById(R.id.tile86)
        tile87 = findViewById(R.id.tile87)
        tile88 = findViewById(R.id.tile88)
        tile90 = findViewById(R.id.tile90)
        tile89 = findViewById(R.id.tile89)
        playerColor = getColor(R.color.glow_teal)
        foolsColors = arrayOf(
            getColor(R.color.glitch_block),
            getColor(R.color.fix_block),
            getColor(R.color.error_block),
            getColor(R.color.black),
            getColor(R.color.warning_block),
            getColor(R.color.tile_bomb_block),
            getColor(R.color.safe_block)
        )

        optiFails = 0
        fixFails = 0
        fixFails2 = 0
        errorFails = 0
        crashFails = 0

        allTiles = arrayOf(
            tile1,
            tile2,
            tile3,
            tile0,
            tile4,
            tile5,
            tile16,
            tile7,
            tile71,
            tile9,
            tile10,
            tile11,
            tile12,
            tile13,
            tile14,
            tile15,
            tile17,
            tile6,
            tile18,
            tile19,
            tile20,
            tile21,
            tile22,
            tile23,
            tile24,
            tile25,
            tile26,
            tile27,
            tile28,
            tile29,
            tile30,
            tile31,
            tile32,
            tile33,
            tile34,
            tile35,
            tile36,
            tile37,
            tile38,
            tile39,
            tile40,
            tile41,
            tile42,
            tile43,
            tile44,
            tile45,
            tile46,
            tile47,
            tile48,
            tile49,
            tile50,
            tile51,
            tile52,
            tile53,
            tile54,
            tile55,
            tile56,
            tile57,
            tile58,
            tile59,
            tile60,
            tile61,
            tile62,
            tile63,
            tile64,
            tile65,
            tile66,
            tile67,
            tile68,
            tile69,
            tile70,
            tile8,
            tile72,
            tile73,
            tile74,
            tile75,
            tile76,
            tile77,
            tile78,
            tile79,
            tile80,
            tile81,
            tile82,
            tile83,
            tile84,
            tile85,
            tile86,
            tile87,
            tile88,
            tile89,
            tile90
        )
        allTiles.shuffle()

//                val (height, width) = resources.displayMetrics.run { heightPixels/density to widthPixels/density }
//                val widthDp = resources.displayMetrics.run { widthPixels / density }
//                val heightDp = resources.displayMetrics.run { heightPixels / density }
        val widthPx = resources.displayMetrics.run { widthPixels }
        val heightPx = resources.displayMetrics.run { heightPixels }
//                val sizeDp = heightDp * widthDp

        val gridMaxWidth = widthPx * 0.9975F
        val gridMaxHeight = heightPx * 0.835F
        //ToDo: find a way for it to choose the correct one of these values, only one will be used
        // and the other size will be set to 0 dp.
        // for now, we will use gridMaxWidth.
        val tileSize = minOf(
            (gridMaxHeight / 13f),
            (gridMaxWidth / 7f)
        ) //ToDo: (maybe?) set dimens.xml resource value to this number + "dp"  and set all
          // tile sizes to this size. May require converting back to pixels tho.
        val playerSize = tileSize / 1.66F
//        resources.getDimension(R.dimen.tile_size) //= tileSizeDp.toString() //(R.string.issues, issues.toString(), maxIssues.toString())

        allTiles.forEach { tile: FrameLayout ->
            tile.updateLayoutParams {
                width = tileSize.toInt()
                height = tileSize.toInt()
            }
        }
        player.updateLayoutParams {
            width = playerSize.toInt()
            height = playerSize.toInt()
        }
        thread {
                if (mode == MainMenuActivity.Gamemode.Stages) {
                    stage = 1
                    mode = MainMenuActivity.Gamemode.Classic
                }

//        when(difficulty) {
//            0 -> optiGoal = 3    //testing goal     // baby
//            1 -> optiGoal = (5..10).random()      // beginner
//            2 -> optiGoal = (10..15).random()     // easy
//            3 -> optiGoal = (15..25).random()     // normal
//            4 -> optiGoal = (30..60).random()     // hard
//            5 -> optiGoal = (65..135).random()    // experienced
//            6 -> optiGoal = (145..275).random()   // expert
//            7 -> optiGoal = (300..425).random()   // master
//            8 -> optiGoal = (445..777).random()   // deity
//            9 -> optiGoal = (800..1500).random()  // impossible
//            10 -> optiGoal = (2000..5000).random()// impossible++
//        }
            when (difficulty) {
                -1 -> {         //* add for maxTime for time trials        // custom
                    maxIssues = CustomizeDifficultyActivity.CustomDifficulty.issuesMax
                    optiGoal = (CustomizeDifficultyActivity.CustomDifficulty.optiMin..CustomizeDifficultyActivity.CustomDifficulty.optiMax).random()
                }
                0 -> {
                    maxTime = 240.0
                    maxIssues = 35
                    optiGoal = 3   //  testing goal       // baby
                }
                1 -> {
                    maxTime = 50.0
                    maxIssues = 20
                    optiGoal = (5..10).random()      // beginner
                }
                2 -> {
                    maxTime = 25.0
                    maxIssues = 15
                    optiGoal = (10..15).random()     // easy
                }
                3 -> {
                    maxTime = 15.0
                    maxIssues = 10
                    optiGoal = (15..25).random()     // normal
                }
                4 -> {
                    maxTime = 10.0
                    maxIssues = 10
                    optiGoal = (30..60).random()     // hard
                }
                5 -> {
                    maxTime = 8.0
                    maxIssues = 9 // make 10 maybe?
                    optiGoal = (65..135).random()    // experienced
                }
                6 -> {
                    maxTime = 6.5
                    maxIssues = 8 // make 9 maybe?
                    optiGoal = (145..275).random()   // expert
                }
                7 -> {
                    maxTime = 3.5
                    maxIssues = 7
                    optiGoal = (300..425).random()   // master
                }
                8 -> {
                    maxTime = 2.5
                    maxIssues = 6
                    optiGoal = (444..777).random()   // deity
                }
                9 -> {
                    maxTime = 2.0
                    maxIssues = 5
                    optiGoal = (800..1500).random()  // impossible
                }
                10 -> {
                    maxTime = 1.5
                    maxIssues = 3
                    optiGoal = (2000..5000).random()// impossible++
                }
                else -> {
                    maxTime = 15.0; maxIssues = 10; optiGoal = 25
                    Toast.makeText(
                        this,
                        "Unknown difficulty loaded; setting makeshift difficulty.",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
            if (mode == MainMenuActivity.Gamemode.SpeedMaze) maxIssues = 5
            mainLayout = findViewById<View>(R.id.main) as ConstraintLayout
            player.setOnTouchListener(onTouchListener())

            if (mode == MainMenuActivity.Gamemode.SuddenDeath) screen.setBackgroundResource(R.drawable.death_gradient)

            if (mode == MainMenuActivity.Gamemode.TimeTrials) {
                time = maxTime
                timeTrialStart()
            } else time = 0.0

            window.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            )
            val windowInsetsController =
                WindowCompat.getInsetsController(window, window.decorView)
            windowInsetsController.systemBarsBehavior =
                WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
            windowInsetsController.hide(WindowInsetsCompat.Type.systemBars())
            windowInsetsController.hide(WindowInsetsCompat.Type.displayCutout())
        }

        if(mode == MainMenuActivity.Gamemode.Switcheroo) {
            foolsColors.shuffle()
            foolsFixColor = foolsColors[0]
            foolsPathColor = foolsColors[1]
            foolsGlitchColor = foolsColors[2]
            foolsErrorColor = foolsColors[3]
            foolsWarningColor = foolsColors[4]
            foolsCrashColor = foolsColors[5]
            foolsBombColor = foolsColors[6]
            if(foolsCrashColor == getColor(R.color.safe_block)) {
                when((0..6).random()) {
                    0 -> {
                        foolsCrashColor = foolsColors[0]
                        foolsFixColor = foolsColors[5]
                    }
                    1 -> {
                        foolsCrashColor = foolsColors[1]
                        foolsPathColor = foolsColors[5]
                    }
                    2 -> {
                        foolsCrashColor = foolsColors[2]
                        foolsGlitchColor = foolsColors[5]
                    }
                    3 -> {
                        foolsCrashColor = foolsColors[3]
                        foolsErrorColor = foolsColors[5]
                    }
                    4 -> {
                        foolsCrashColor = foolsColors[4]
                        foolsWarningColor = foolsColors[5]
                    }
                    6 -> {
                        foolsCrashColor = foolsColors[6]
                        foolsBombColor = foolsColors[5]
                    }
                    else -> {}
                }
            }
        }

        if (mode == MainMenuActivity.Gamemode.Stages || stage == 1) {
            Toast.makeText(this, "Stage 1: Classic", Toast.LENGTH_SHORT).show()
        }

        readData()
        updateStats()
        checkIssues()
        generateTiles()

//        println(level)

        thread {
            Handler(Looper.getMainLooper()).postDelayed({
                if (SettingsValues.rainbowCharacter) rainbow(
                    player,
                    0f,
                    24,
                    2.5f
                )
            }, (15).toLong())
        }
        if (mode == MainMenuActivity.Gamemode.Corruption ) {
            thread {
                allTiles.forEach { t: FrameLayout -> loopCorrupt(t) }
            }
        }

        if(mode == MainMenuActivity.Gamemode.PainMode) {
            screen.setRenderEffect(RenderEffect.createBlurEffect(22F, 13F, Shader.TileMode.DECAL))
                loopShake()

            alphaFluctuate()
        }

        thread {
        if(mode == MainMenuActivity.Gamemode.Apocalypse  || mode == MainMenuActivity.Gamemode.Stages || stage != 0) {
            if(mode == MainMenuActivity.Gamemode.Apocalypse) loopError()

            when(difficulty) {
                -1 -> loopTime = CustomizeDifficultyActivity.CustomDifficulty.apocLoopTime
                0 -> loopTime = 5000
                1 -> loopTime = 2500
                2 -> loopTime = 1500
                3 -> loopTime = 1000
                4 -> loopTime = 1000
                5 -> loopTime = 750
                6 -> loopTime = 750
                7 -> loopTime = 500
                8 -> loopTime = 500
                9 -> loopTime = 333
                10 -> loopTime = 250
            }
            }
        }

        if(mode == MainMenuActivity.Gamemode.SpeedMaze) optiText.text = getString(R.string.speed_score, time.toString())

        if (mode == MainMenuActivity.Gamemode.Glitch) {
            optiText.text = getString(R.string.glitch_score, optimizers.toString())
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                glitchUnspread()
            }, (3335).toLong())
        }

    }

    private fun nextStage() {
        stage ++
        when(stage) {
            1 -> {
                mode = MainMenuActivity.Gamemode.Classic
            }
            2 -> {
                mode = MainMenuActivity.Gamemode.Apocalypse
                optimizers = (optiGoal * 1/3 )
                issues = (issues * 1/2 )
                Toast.makeText(this, "Stage 2: Apocalypse", Toast.LENGTH_LONG).show()
                loopError()
            }
            3 -> {
                mode = MainMenuActivity.Gamemode.Corruption
                optimizers = (optiGoal * 2/3 )
                issues = (issues * 1/2 )
                Toast.makeText(this, "Stage 3: Corruption", Toast.LENGTH_LONG).show()
                thread {
                    allTiles.forEach { frm: FrameLayout -> loopCorrupt(frm) } // loopError() will still continue running. This is intentional.
                }
            }
            else -> {}
        }
        updateStats()
    }

    private fun timeTrialStart() {
        timeBar.visibility = View.VISIBLE
        timeBar.max = (maxTime * 10.0).toInt()
        startTimerTrial()
    }

    private fun startTimerTrial() {
        val strength = (((time * 85.0)-255.0)* -1.0).toInt()
        time -= 0.05

        if (time in 0.05..3.0) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) { //ToDo: fix crash here
                try {
                    screen.setRenderEffect(
                        RenderEffect.createBlurEffect(
                            strength / 5F,
                            strength / 5F,
                            Shader.TileMode.DECAL
                        )
                    )
                } catch (e: Exception) {
                    println("Error: $e\nTrying Again.")
                    try {
                        screen.setRenderEffect(
                            RenderEffect.createBlurEffect(
                                strength / 5F,
                                strength / 5F,
                                Shader.TileMode.DECAL
                            )
                        )
                    } catch (e: Exception) {
                        println("Error: $e")
                    }
                }
            }
            try {
                vibrate(50, strength)
            } catch (e: Exception) {
//                Toast.makeText(this, "error:"+e.message, Toast.LENGTH_LONG).show()
                try {
                    vibrate(50, strength + 1)
                } catch (e: Exception) {
//                    Toast.makeText(this, "error2:"+e.message, Toast.LENGTH_SHORT).show()
                    try {
                        vibrate(50, strength - 1)
                    } catch (e: Exception) {
//                        Toast.makeText(this, "error3:"+e.message, Toast.LENGTH_SHORT).show()
                        try {
                            vibrate(50)
                        } catch (e: Exception) {
                            Toast.makeText(this, "error: " + e.message, Toast.LENGTH_SHORT).show()
                            vibrate(50)
                        }
                    }
                }
            }
        } else if (time <= 0.0) {
            gameOver()
            time = 0.0
        } //vibrate(1500, strength)
        else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            screen.setRenderEffect(null)
        }

        val decimal = BigDecimal(time).setScale(2, RoundingMode.HALF_EVEN)
        val handler = Handler(Looper.getMainLooper())
        optiText.text = getString(R.string.speed_score, decimal.toString()) //*
        timeBar.progress = (time * 10.0).toInt()
        //setcolor etc
        handler.postDelayed({ //ToDo: fix crash here
            if(!hasWon && !hasLost)
                startTimerTrial()
        }, (50).toLong())
    }

    private fun loopCorrupt(thisTile: FrameLayout) {
        val handler = Handler(Looper.getMainLooper())
        if(thisTile.foreground == null && thisTile.tag != "finish" && !hasWon && !hasLost && playing) {
            when ((1..106).random()) {
                in 1..5 -> thisTile.setBackgroundColor(getColor(R.color.tile_bomb_block))
                in 6..30 -> thisTile.setBackgroundColor(getColor(R.color.safe_block))
                in 31..36 -> thisTile.setBackgroundColor(getColor(R.color.fix_block))
                in 36..70 -> thisTile.setBackgroundColor(getColor(R.color.warning_block))
                in 71..85 -> thisTile.setBackgroundColor(getColor(R.color.error_block))
                in 96..98 -> thisTile.setBackgroundColor(getColor(R.color.black))
                in 99..106 -> thisTile.setBackgroundColor(getColor(R.color.glitch_block))
            }
        }
        handler.postDelayed({
            if(!hasWon && !hasLost && playing) loopCorrupt(thisTile)
        }, (1000..7500).random().toLong())

    }

    private fun startTimer() {
        time += 0.05 //+

        val decimal = BigDecimal(time).setScale(2, RoundingMode.HALF_EVEN)
        println(decimal.toString())
        optiText.text = getString(R.string.speed_score, decimal.toString())
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            if (!hasWon && !hasLost)
                startTimer()
        }, (50).toLong())
    }

    private fun spin(target: View, time: Long, axis: String, startAngle: Float, goalAngle: Float = 45f) {
        var rotAxis = View.ROTATION
        when(axis) {
            "x" -> rotAxis = View.ROTATION_X
            "y" -> rotAxis = View.ROTATION_Y
            "z" -> rotAxis = View.ROTATION
        }
        val animator = ObjectAnimator.ofFloat(target, rotAxis, startAngle, goalAngle)
        animator.duration = time
        animator.start()
    }

    private fun loopError() {
        if(!hasLost && !hasWon) {
            apocalypseProgress()
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                loopError()
                when ((1..120).random()) {
                    11 -> {
                        repeat((3..8).random()) {
                            handler.postDelayed({
                                when ((1..11).random()) {
                                    in 1..3 -> highlightRandomTile(getColor(R.color.warning_block))
                                    in 4..6 -> highlightRandomTile(getColor(R.color.error_block))
                                    in 7..8 -> highlightRandomTile(getColor(R.color.black))
                                    9 -> highlightRandomTile(getColor(R.color.glitch_block))
                                    10 -> highlightRandomTile(getColor(R.color.tile_bomb_block))
                                    11 -> highlightRandomTile(getColor(R.color.safe_block))
                                }
                                vibrate(25)
                            }, ((10..400).random().toLong()))
                        }
                    }
                }
            }, (loopTime).toLong())
        }
    }

    private fun glitchUnspread() {
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            when ((1..24).random()) {
                in 16..24 -> {
                    val tile = selectRandomTile()
                    if (getBackgroundColor(tile) == getColor(R.color.glitch_block)) {
                        when((1..13).random()) {
                            1 -> tile.setBackgroundColor(getColor(R.color.black))
                            in 2..4 -> tile.setBackgroundColor(getColor(R.color.error_block))
                            in 5..8 -> tile.setBackgroundColor(getColor(R.color.safe_block))
                            in 9..13 -> tile.setBackgroundColor(getColor(R.color.warning_block))
                        }
                    }
                }
            }
            glitchUnspread()
        }, (5000).toLong())

    }

    private fun apocalypseProgress() {
        val selectedTile1 = selectRandomTile()
        val selectedTile2 = selectRandomTile()
        val selectedTile3 = selectRandomTile()
        val selectedTile4 = selectRandomTile()
        val selectedTile5 = selectRandomTile()

        when {
            getBackgroundColor(selectedTile1) == getColor(R.color.warning_block) -> selectedTile1.setBackgroundColor(getColor(R.color.error_block))
            getBackgroundColor(selectedTile1) == getColor(R.color.error_block) -> selectedTile1.setBackgroundColor(getColor(R.color.black))
            getBackgroundColor(selectedTile1) == getColor(R.color.black) -> {
                when ((0..5).random()) {
                    in (2..5) -> selectedTile1.setBackgroundColor(getColor(R.color.glitch_block))
                }
            }
            getBackgroundColor(selectedTile1) == getColor(R.color.safe_block) -> {
                when ((1..16).random()) {
                    2 -> selectedTile1.setBackgroundColor(getColor(R.color.warning_block))
                }
            }
            getBackgroundColor(selectedTile1) == getColor(R.color.fix_block) -> {
                when ((1..16).random()) {
                    2 -> selectedTile1.setBackgroundColor(getColor(R.color.warning_block))
                }
            }
            getBackgroundColor(selectedTile1) == getColor(R.color.glitch_block) -> {
                when ((0..6).random()) {
                    in (2..5) -> selectedTile1.setBackgroundColor(getColor(R.color.black))
                }
            }
        }
        when {
            getBackgroundColor(selectedTile2) == getColor(R.color.warning_block) -> selectedTile2.setBackgroundColor(getColor(R.color.error_block))
            getBackgroundColor(selectedTile2) == getColor(R.color.error_block) -> selectedTile2.setBackgroundColor(getColor(R.color.black))
            getBackgroundColor(selectedTile2) == getColor(R.color.black) -> {
                when ((0..5).random()) {
                    in (2..5) -> selectedTile2.setBackgroundColor(getColor(R.color.glitch_block))
                }
            }
            getBackgroundColor(selectedTile2) == getColor(R.color.safe_block) -> {
                when ((1..16).random()) {
                    2 -> selectedTile2.setBackgroundColor(getColor(R.color.warning_block))
                }
            }
            getBackgroundColor(selectedTile2) == getColor(R.color.fix_block) -> {
                when ((1..16).random()) {
                    2 -> selectedTile1.setBackgroundColor(getColor(R.color.warning_block))
                }
            }
            getBackgroundColor(selectedTile2) == getColor(R.color.glitch_block) -> {
                when ((0..6).random()) {
                    in (2..5) -> selectedTile2.setBackgroundColor(getColor(R.color.black))
                }
            }
        }

        when {
            getBackgroundColor(selectedTile3) == getColor(R.color.warning_block) -> selectedTile3.setBackgroundColor(getColor(R.color.error_block))
            getBackgroundColor(selectedTile3) == getColor(R.color.error_block) -> selectedTile3.setBackgroundColor(getColor(R.color.black))
            getBackgroundColor(selectedTile3) == getColor(R.color.black) -> {
                when ((0..5).random()) {
                    in (2..5) -> selectedTile3.setBackgroundColor(getColor(R.color.glitch_block))
                }
            }
            getBackgroundColor(selectedTile3) == getColor(R.color.safe_block) -> {
                when ((1..16).random()) {
                    2 -> selectedTile3.setBackgroundColor(getColor(R.color.warning_block))
                }
            }
            getBackgroundColor(selectedTile3) == getColor(R.color.fix_block) -> {
                when ((1..16).random()) {
                    2 -> selectedTile1.setBackgroundColor(getColor(R.color.warning_block))
                }
            }
            getBackgroundColor(selectedTile3) == getColor(R.color.glitch_block) -> {
                when ((0..6).random()) {
                    in (2..5) -> selectedTile3.setBackgroundColor(getColor(R.color.black))
                }
            }
        }

        when {
            getBackgroundColor(selectedTile4) == getColor(R.color.warning_block) -> selectedTile4.setBackgroundColor(getColor(R.color.error_block))
            getBackgroundColor(selectedTile4) == getColor(R.color.error_block) -> selectedTile4.setBackgroundColor(getColor(R.color.black))
            getBackgroundColor(selectedTile4) == getColor(R.color.black) -> {
                when ((0..5).random()) {
                    in (2..5) -> selectedTile4.setBackgroundColor(getColor(R.color.glitch_block))
                }
            }
            getBackgroundColor(selectedTile4) == getColor(R.color.safe_block) -> {
                when ((1..16).random()) {
                    2 -> selectedTile4.setBackgroundColor(getColor(R.color.warning_block))
                }
            }
            getBackgroundColor(selectedTile4) == getColor(R.color.fix_block) -> {
                when ((1..16).random()) {
                    2 -> selectedTile1.setBackgroundColor(getColor(R.color.warning_block))
                }
            }
            getBackgroundColor(selectedTile4) == getColor(R.color.glitch_block) -> {
                when ((0..6).random()) {
                    in (2..5) -> selectedTile4.setBackgroundColor(getColor(R.color.black))
                }
            }
        }

        when {
            getBackgroundColor(selectedTile5) == getColor(R.color.warning_block) -> selectedTile5.setBackgroundColor(getColor(R.color.error_block))
            getBackgroundColor(selectedTile5) == getColor(R.color.error_block) -> selectedTile5.setBackgroundColor(getColor(R.color.black))
            getBackgroundColor(selectedTile5) == getColor(R.color.black) -> {
                when ((0..5).random()) {
                    in (2..5) -> selectedTile5.setBackgroundColor(getColor(R.color.glitch_block))
                }
            }
            getBackgroundColor(selectedTile5) == getColor(R.color.safe_block) -> {
                when ((1..16).random()) {
                    2 -> selectedTile5.setBackgroundColor(getColor(R.color.warning_block))
                }
            }
            getBackgroundColor(selectedTile5) == getColor(R.color.fix_block) -> {
                when ((1..16).random()) {
                    2 -> selectedTile1.setBackgroundColor(getColor(R.color.warning_block))
                }
            }
            getBackgroundColor(selectedTile5) == getColor(R.color.glitch_block) -> {
                when ((0..6).random()) {
                    in (2..5) -> selectedTile5.setBackgroundColor(getColor(R.color.black))
                }
            }
        }

    }

    private fun alphaFluctuate() {
        if(playing) {
            when ((1..13001).random()) {
                1355 -> grid.alpha = 0.9f
                117 -> grid.alpha = 0.001f
            }
            if (grid.alpha in 0.05f..0.35f) {
                if (grid.alpha <= 0.05f) {
                    alphaUp = true
                    alphaDown = false
                }
                if (grid.alpha >= 0.35f) {
                    alphaUp = false
                    alphaDown = true
                }
                if (alphaUp) grid.alpha += 0.05f
                if (alphaDown) grid.alpha -= 0.05f
                val handler = Handler(Looper.getMainLooper())
                handler.postDelayed({
                    alphaFluctuate()
                }, (50).toLong())
            } else {
                grid.alpha = 0.05f
                alphaFluctuate()
            }
        }
    }

    private fun generateLayout1() {
        println("receiving tile data")
//        allTiles = arrayOf(
//            tile0,
//            tile1,
//            tile2,
//            tile3,
//            tile4,
//            tile5,
//            tile6,
//            tile7,
//            tile8,
//            tile9,
//            tile10,
//            tile11,
//            tile12,
//            tile13,
//            tile14,
//            tile15,
//            tile16,
//            tile17,
//            tile18,
//            tile19,
//            tile20,
//            tile21,
//            tile22,
//            tile23,
//            tile24,
//            tile25,
//            tile26,
//            tile27,
//            tile28,
//            tile29,
//            tile30,
//            tile31,
//            tile32,
//            tile33,
//            tile34,
//            tile35,
//            tile36,
//            tile37,
//            tile38,
//            tile39,
//            tile40,
//            tile41,
//            tile42,
//            tile43,
//            tile44,
//            tile45,
//            tile46,
//            tile47,
//            tile48,
//            tile49,
//            tile50,
//            tile51,
//            tile52,
//            tile53,
//            tile54,
//            tile55,
//            tile56,
//            tile57,
//            tile58,
//            tile59,
//            tile60,
//            tile61,
//            tile62,
//            tile63,
//            tile64,
//            tile65,
//            tile66,
//            tile67,
//            tile68,
//            tile69,
//            tile70,
//            tile71,
//            tile72,
//            tile73,
//            tile74,
//            tile75,
//            tile76,
//            tile77,
//            tile78,
//            tile79,
//            tile80,
//            tile81,
//            tile82,
//            tile83,
//            tile84,
//            tile85,
//            tile86,
//            tile87,
//            tile88,
//            tile89,
//            tile90
//        )
//        allTiles.forEach { frameLayout: FrameLayout ->
//            frameLayout.setBackgroundColor(getColor(R.color.warning_block))
//        }
//        for (i in 0..90)
//            allTiles[i].setBackgroundColor(getColor(if (ALL_TILES[i]) R.color.safe_block else R.color.warning_block))
//        allTiles.shuffle()
        if (TILE0) tile0.setBackgroundColor(getColor(R.color.safe_block))
        else tile0.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE1) tile1.setBackgroundColor(getColor(R.color.safe_block))
        else tile1.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE2) tile2.setBackgroundColor(getColor(R.color.safe_block))
        else tile2.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE3) tile3.setBackgroundColor(getColor(R.color.safe_block))
        else tile3.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE4) tile4.setBackgroundColor(getColor(R.color.safe_block))
        else tile4.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE5) tile5.setBackgroundColor(getColor(R.color.safe_block))
        else tile5.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE6) tile6.setBackgroundColor(getColor(R.color.safe_block))
        else tile6.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE7) tile7.setBackgroundColor(getColor(R.color.safe_block))
        else tile7.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE8) tile8.setBackgroundColor(getColor(R.color.safe_block))
        else tile8.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE9) tile9.setBackgroundColor(getColor(R.color.safe_block))
        else tile9.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE10) tile10.setBackgroundColor(getColor(R.color.safe_block))
        else tile10.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE11) tile11.setBackgroundColor(getColor(R.color.safe_block))
        else tile11.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE12) tile12.setBackgroundColor(getColor(R.color.safe_block))
        else tile12.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE13) tile13.setBackgroundColor(getColor(R.color.safe_block))
        else tile13.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE14) tile14.setBackgroundColor(getColor(R.color.safe_block))
        else tile14.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE15) tile15.setBackgroundColor(getColor(R.color.safe_block))
        else tile15.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE16) tile16.setBackgroundColor(getColor(R.color.safe_block))
        else tile16.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE17) tile17.setBackgroundColor(getColor(R.color.safe_block))
        else tile17.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE18) tile18.setBackgroundColor(getColor(R.color.safe_block))
        else tile18.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE19) tile19.setBackgroundColor(getColor(R.color.safe_block))
        else tile19.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE20) tile20.setBackgroundColor(getColor(R.color.safe_block))
        else tile20.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE21) tile21.setBackgroundColor(getColor(R.color.safe_block))
        else tile21.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE22) tile22.setBackgroundColor(getColor(R.color.safe_block))
        else tile22.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE23) tile23.setBackgroundColor(getColor(R.color.safe_block))
        else tile23.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE24) tile24.setBackgroundColor(getColor(R.color.safe_block))
        else tile24.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE25) tile25.setBackgroundColor(getColor(R.color.safe_block))
        else tile25.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE26) tile26.setBackgroundColor(getColor(R.color.safe_block))
        else tile26.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE27) tile27.setBackgroundColor(getColor(R.color.safe_block))
        else tile27.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE28) tile28.setBackgroundColor(getColor(R.color.safe_block))
        else tile28.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE29) tile29.setBackgroundColor(getColor(R.color.safe_block))
        else tile29.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE30) tile30.setBackgroundColor(getColor(R.color.safe_block))
        else tile30.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE31) tile31.setBackgroundColor(getColor(R.color.safe_block))
        else tile31.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE32) tile32.setBackgroundColor(getColor(R.color.safe_block))
        else tile32.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE33) tile33.setBackgroundColor(getColor(R.color.safe_block))
        else tile33.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE34) tile34.setBackgroundColor(getColor(R.color.safe_block))
        else tile34.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE35) tile35.setBackgroundColor(getColor(R.color.safe_block))
        else tile35.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE36) tile36.setBackgroundColor(getColor(R.color.safe_block))
        else tile36.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE37) tile37.setBackgroundColor(getColor(R.color.safe_block))
        else tile37.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE38) tile38.setBackgroundColor(getColor(R.color.safe_block))
        else tile38.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE39) tile39.setBackgroundColor(getColor(R.color.safe_block))
        else tile39.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE40) tile40.setBackgroundColor(getColor(R.color.safe_block))
        else tile40.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE41) tile41.setBackgroundColor(getColor(R.color.safe_block))
        else tile41.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE42) tile42.setBackgroundColor(getColor(R.color.safe_block))
        else tile42.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE43) tile43.setBackgroundColor(getColor(R.color.safe_block))
        else tile43.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE44) tile44.setBackgroundColor(getColor(R.color.safe_block))
        else tile44.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE45) tile45.setBackgroundColor(getColor(R.color.safe_block))
        else tile45.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE46) tile46.setBackgroundColor(getColor(R.color.safe_block))
        else tile46.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE47) tile47.setBackgroundColor(getColor(R.color.safe_block))
        else tile47.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE48) tile48.setBackgroundColor(getColor(R.color.safe_block))
        else tile48.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE49) tile49.setBackgroundColor(getColor(R.color.safe_block))
        else tile49.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE50) tile50.setBackgroundColor(getColor(R.color.safe_block))
        else tile50.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE51) tile51.setBackgroundColor(getColor(R.color.safe_block))
        else tile51.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE52) tile52.setBackgroundColor(getColor(R.color.safe_block))
        else tile52.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE53) tile53.setBackgroundColor(getColor(R.color.safe_block))
        else tile53.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE54) tile54.setBackgroundColor(getColor(R.color.safe_block))
        else tile54.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE55) tile55.setBackgroundColor(getColor(R.color.safe_block))
        else tile55.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE56) tile56.setBackgroundColor(getColor(R.color.safe_block))
        else tile56.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE57) tile57.setBackgroundColor(getColor(R.color.safe_block))
        else tile57.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE58) tile58.setBackgroundColor(getColor(R.color.safe_block))
        else tile58.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE59) tile59.setBackgroundColor(getColor(R.color.safe_block))
        else tile59.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE60) tile60.setBackgroundColor(getColor(R.color.safe_block))
        else tile60.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE61) tile61.setBackgroundColor(getColor(R.color.safe_block))
        else tile61.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE62) tile62.setBackgroundColor(getColor(R.color.safe_block))
        else tile62.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE63) tile63.setBackgroundColor(getColor(R.color.safe_block))
        else tile63.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE64) tile64.setBackgroundColor(getColor(R.color.safe_block))
        else tile64.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE65) tile65.setBackgroundColor(getColor(R.color.safe_block))
        else tile65.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE66) tile66.setBackgroundColor(getColor(R.color.safe_block))
        else tile66.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE67) tile67.setBackgroundColor(getColor(R.color.safe_block))
        else tile67.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE68) tile68.setBackgroundColor(getColor(R.color.safe_block))
        else tile68.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE69) tile69.setBackgroundColor(getColor(R.color.safe_block))
        else tile69.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE70) tile70.setBackgroundColor(getColor(R.color.safe_block))
        else tile70.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE71) tile71.setBackgroundColor(getColor(R.color.safe_block))
        else tile71.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE72) tile72.setBackgroundColor(getColor(R.color.safe_block))
        else tile72.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE73) tile73.setBackgroundColor(getColor(R.color.safe_block))
        else tile73.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE74) tile74.setBackgroundColor(getColor(R.color.safe_block))
        else tile74.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE75) tile75.setBackgroundColor(getColor(R.color.safe_block))
        else tile75.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE76) tile76.setBackgroundColor(getColor(R.color.safe_block))
        else tile76.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE77) tile77.setBackgroundColor(getColor(R.color.safe_block))
        else tile77.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE78) tile78.setBackgroundColor(getColor(R.color.safe_block))
        else tile78.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE79) tile79.setBackgroundColor(getColor(R.color.safe_block))
        else tile79.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE80) tile80.setBackgroundColor(getColor(R.color.safe_block))
        else tile80.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE81) tile81.setBackgroundColor(getColor(R.color.safe_block))
        else tile81.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE82) tile82.setBackgroundColor(getColor(R.color.safe_block))
        else tile82.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE83) tile83.setBackgroundColor(getColor(R.color.safe_block))
        else tile83.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE84) tile84.setBackgroundColor(getColor(R.color.safe_block))
        else tile84.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE85) tile85.setBackgroundColor(getColor(R.color.safe_block))
        else tile85.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE86) tile86.setBackgroundColor(getColor(R.color.safe_block))
        else tile86.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE87) tile87.setBackgroundColor(getColor(R.color.safe_block))
        else tile87.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE88) tile88.setBackgroundColor(getColor(R.color.safe_block))
        else tile88.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE89) tile89.setBackgroundColor(getColor(R.color.safe_block))
        else tile89.setBackgroundColor(getColor(R.color.warning_block))
        if (TILE90) tile90.setBackgroundColor(getColor(R.color.safe_block))
        else tile90.setBackgroundColor(getColor(R.color.warning_block))
    }

    private fun generateTiles() {
        /*if(mazeGenerationBeta) {
            autoGenerateMaze1()
            if(mode != MainMenuActivity.Gamemode.SpeedMaze) {
                generateFixes((6..10).random())
                if (mode != MainMenuActivity.Gamemode.Glitch) {
                    generateOptimizers(6)
                } else if (mode == MainMenuActivity.Gamemode.Glitch) highlightRandomTile(getColor(R.color.glitch_block))
            }
            generateErrors((21..25).random())
            generateCrashes((5..8).random())
        } else*/ if (mode != MainMenuActivity.Gamemode.NoMaze) {
            generateLayout1()
            if(mode != MainMenuActivity.Gamemode.SpeedMaze) {
                generateFixes((6..10).random())
                if (mode != MainMenuActivity.Gamemode.Glitch) {
                    generateOptimizers(6)
                } else if (mode == MainMenuActivity.Gamemode.Glitch) highlightRandomTile(getColor(R.color.glitch_block))
            }
            generateErrors((21..25).random())
            generateCrashes((5..8).random())
        } else if (mode == MainMenuActivity.Gamemode.NoMaze) {
            generateLayout2()
            generateFixes((14..21).random())
            if (mode != MainMenuActivity.Gamemode.Glitch) {
                generateOptimizers(3)
            } else if (mode == MainMenuActivity.Gamemode.Glitch) highlightRandomTile(getColor(R.color.glitch_block))
            generateErrors((15..23).random())
            generateCrashes((2..7).random())
        }
    }

    private fun generateLayout2() {
        allTiles.forEach { frameLayout: FrameLayout ->
            when((1..8).random()) {
                in 1..5 -> frameLayout.setBackgroundColor(getColor(R.color.safe_block))
                in 6..8 -> frameLayout.setBackgroundColor(getColor(R.color.warning_block))
            }
        }
    }

    private fun generateFixes(repeatNum: Int) {
        repeat(repeatNum) {
            generateFix()
        }
    }

//    var fixWait = 5L
    private fun generateFix() {
        println("generating fix tile")
        val tile = selectRandomTile()
        if (getBackgroundColor(tile) == getColor(R.color.safe_block)) {
//            fixWait += 40L
            tile.setBackgroundColor(getColor(R.color.fix_block))
            println("generated fix tile successfully")
        } else {
            fixFails++
            if(fixFails < 500) {
                generateFix()
            } else println("cannot find a spot to generate a new fix tile")
        }
    }

    private fun generateErrors(repeatNum: Int) {
        repeat(repeatNum) {
            generateError()
        }
    }

    private fun generateError() {
        val tile = selectRandomTile()
        if (getBackgroundColor(tile) == getColor(R.color.warning_block)) {
            tile.setBackgroundColor(getColor(R.color.error_block))
        } else {
            errorFails++
            if(errorFails < 600) {
                generateError()
            } else println("cannot find a spot to generate a new error tile")
        }
    }

    private fun generateCrashes(repeatNum: Int) {
        repeat(repeatNum) {
            generateCrash()
        }
    }

    private fun generateCrash() {
        val tile = selectRandomTile()
        if (getBackgroundColor(tile) == getColor(R.color.error_block)) {
            tile.setBackgroundColor(getColor(R.color.black))
        } else {
            crashFails++
            if(crashFails < 500) {
                generateCrash()
            } else println("cannot find a spot to generate a new crash tile")
        }
    }

//    private fun identifyPath(): Array<FrameLayout> {
//
//        var safeTiles: Array<FrameLayout> = arrayOf()
//        allTiles.onEach { frameLayout: FrameLayout ->
//            if(getBackgroundColor(frameLayout) == getColor(R.color.safe_block)) {
// //                safeTiles = append(safeTiles, frameLayout)
//                safeTiles += frameLayout
//            }
//        }
//        return safeTiles
//    }

    private fun updateStats() {
        updateIssues()
        updateOptimizers()
        saveStats()
    }

    private fun selectRandomTile(): FrameLayout {
        return allTiles.random()
    }

    private fun highlightRandomTile(highlightColor: Int) {
        selectRandomTile().setBackgroundColor(highlightColor)
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun onTouchListener(): View.OnTouchListener {
        return View.OnTouchListener { view, event ->
            val x = event.rawX.toInt()
            val y = event.rawY.toInt()
            checkHitboxes()
            when (event.action and MotionEvent.ACTION_MASK) {
                MotionEvent.ACTION_DOWN -> {
                    val lParams = view.layoutParams as ConstraintLayout.LayoutParams
                    xDelta = x - lParams.leftMargin
                    (y - lParams.topMargin).also { yDelta = it }
                }

                MotionEvent.ACTION_MOVE -> {
                    val layoutParams = view
                        .layoutParams as ConstraintLayout.LayoutParams
                    layoutParams.leftMargin = x - xDelta
                    layoutParams.topMargin = y - yDelta
                    layoutParams.rightMargin =  xDelta - x// + 995
                    layoutParams.bottomMargin = yDelta - y// + 2225
                    view.layoutParams = layoutParams
                }
            }
            mainLayout!!.invalidate()
            true
        }
    }

    private fun checkIssues() {
        if (issues >= maxIssues) {
                issues = 0
                gameOver()
        }
        updateIssues()
    }

    private fun updateIssues() {
        val stage1: Int = if(maxIssues*0.215 >= 1.0) (maxIssues*0.215).toInt() else 1 // >= st1 = green
        val stage2: Int = if(maxIssues*(1f/3f) >= (stage1+1)) (maxIssues*(1f/3f)).toInt() else (stage1+1)// >= st2 = orange
        val st3: Int = if((maxIssues*0.8).toInt() <= (maxIssues - 2)) (maxIssues*0.8).toInt() else (maxIssues - 2) // >= st3 = red
            val stage3: Int = if(st3 >= (maxIssues - 5)) st3 else (maxIssues - 5)
        issuesText.text = getString(R.string.issues, issues.toString(), maxIssues.toString())

        if(!SettingsValues.rainbowCharacter) {
            if (issues != (maxIssues - 1)) {
                if (issues !in 0..stage1) {
                    if (issues !in stage3..(maxIssues - 2)) {
                        when (issues) {
                            in stage1..stage2 -> {
                                playerColor = getColor(R.color.player_color_green)
                                player.setColorFilter(playerColor) //green
                                playerShaking = false
                            }
                            in stage2..stage3 -> {
                                playerColor = getColor(R.color.player_color_orange)
                                player.setColorFilter(playerColor) //orange
                                playerShaking = false
                            }
                        }
                    } else {
                        playerColor = getColor(R.color.player_color_red)
                        player.setColorFilter(playerColor) //red
                        playerShaking = false
                    }
                } else {
                    playerColor = getColor(R.color.glow_teal)
                    player.colorFilter = null
                    playerShaking = false
                }
            } else {
                playerColor = getColor(R.color.player_color_dark_red)
                player.setColorFilter(playerColor) // dark red & shake
                if (!playerShaking) loopShakePlayer()
            }
        }
//        when(issues) {
//            in 0..(if (ic * 0.125 >= 1.0) (ic * 0.125) else 1).toInt() -> {
//                playerColor = getColor(R.color.glow_teal)
//                player.colorFilter = null
//                playerShaking = false
//            }
//            (maxIssues - 1) -> {
//                playerColor = getColor(R.color.player_color_dark_red)
//                player.setColorFilter(playerColor) // dark red & shake
//                if (!playerShaking) loopShakePlayer()
//
//            }
//            in (if (maxIssues - 2 < ic * 0.65.toInt()) maxIssues - 2 else if (ic * 0.65.toInt() >= 3) ic * 0.65 else 3).toInt()..(maxIssues - 2) -> {
//                playerColor = getColor(R.color.player_color_red)
//                player.setColorFilter(playerColor) //red
//                playerShaking = false
//            }
//            in (if (ic * 0.355 >= 2) ic * 0.355 else 2).toInt()..(if (ic * 0.65 >= 3) ic * 0.65 else 3).toInt() -> {
//                playerColor = getColor(R.color.player_color_orange)
//                player.setColorFilter(playerColor) //orange
//                playerShaking = false
//            }
//            in (if (ic * 0.125 >= 1) ic * 0.125 else 1).toInt()..(if (ic * 0.355 >= 2) ic * 0.355 else 2).toInt() -> {
//                playerColor = getColor(R.color.player_color_green)
//                player.setColorFilter(playerColor) //green
//                playerShaking = false
//            }
//            maxIssues -> {
//                playerColor = getColor(R.color.glow_teal)
//                player.setColorFilter(playerColor) //glowTeal
//                shakePlayer()
//                playerShaking = false
//            }
//            (maxIssues + 1) -> {
//                playerColor = getColor(R.color.blue)
//                player.setColorFilter(playerColor) // blue
//                shakePlayer()
//                playerShaking = false
//            }
//        }
    }

    private fun updateOptimizers() {
        val decimal = BigDecimal(time).setScale(2, RoundingMode.HALF_EVEN)
        optiText.text = when (mode) {
            MainMenuActivity.Gamemode.Glitch -> getString(R.string.glitch_score, optimizers.toString())
            MainMenuActivity.Gamemode.Inf -> getString(R.string.optimizers, optimizers.toString())
            MainMenuActivity.Gamemode.SpeedMaze -> getString(R.string.speed_score, decimal.toString())
            else -> getString(R.string.optimizers_and_goal, optimizers.toString(), optiGoal.toString())
        }
    }

    private fun generateOptimizers(repeatNum: Int) {
        thread {
            repeat(repeatNum) {
                generateOptimizer()
            }
        }
    }

    private fun generateOptimizer() {
        val tile = selectRandomTile()
        if((getBackgroundColor(tile) == getColor(R.color.safe_block) || getBackgroundColor(tile) == getColor(R.color.fix_block)) && tile.foreground == null) {
            tile.foreground = AppCompatResources.getDrawable(this, R.drawable.ic_baseline_extension_24)//.toDrawable()
        } else {
            optiFails++
            if(optiFails < 500) {
                generateOptimizer()
            } else println("cannot find a spot to generate a new optimizer tile")
        }
    }

    private fun optimizerCollect(tile: FrameLayout) {
        vibrate(10)
        tile.foreground = null
        if(mode == MainMenuActivity.Gamemode.TimeTrials) {
            time += when (difficulty) {
                0 -> 15.0
                1 -> 10.0
                2 -> 5.0
                3 -> 3.0
                4 -> 2.5
                5 -> 2.25
                6 -> 2.0
                7 -> 1.75
                8 -> 1.5
                9 -> 1.25
                10 -> 1.0
                else -> 10.0
            }
        }

        optimizers++
        totalOptimizers++
        allTiles.shuffle()

        when((1..4).random()) {
            1 -> {
                generateFixBlock()
            }
        }
        when((1..5).random()) {
            1 -> {
                if(issues != 0) issues -= 1
            }
        }
        if(optimizers >= optiGoal && !finBlockGenerated && mode != MainMenuActivity.Gamemode.Inf) {
            if(stage != 0 && stage < 3) {
                nextStage()
            } else {
                generateFinishBlock()
                finBlockGenerated = true
            }
        }
        updateStats()
//        saveStats()
        if(SettingsValues.keepGeneratingOptis || !finBlockGenerated) generateOptimizer()
    }

    private fun generateFinishBlock() {
        val newTile = selectRandomTile()
        if (!finBlockGenerated) { // attempt to fix occasional bug
            if (getBackgroundColor(newTile) == getColor(R.color.safe_block)) {
                newTile.setBackgroundColor(getColor(R.color.white))
                newTile.tag = "finish"
                rainbow(newTile, 0f, 9, 2f, false)
                newTile.alpha = 0.75f
                if (newTile.foreground != null) {
//                    newTile.foreground = null
                    optimizerCollect(newTile)
                }
            } else {
                generateFinishBlock()
            }
        }
    }

    private fun generateFixBlock() {
        val newTile = selectRandomTile()
        if (getBackgroundColor(newTile) == getColor(R.color.safe_block)) {
            newTile.setBackgroundColor(getColor(R.color.fix_block))
        } else {
            fixFails2++
            if(fixFails2 < 2000) {
                generateFix()
            }
        }
    }

    private fun fixBlockHit(tile: FrameLayout) {
        if (issues != 0) {
            issues -= 1
        } else if(/*issues == 0 &&*/ mode == MainMenuActivity.Gamemode.TimeTrials) time += 0.25

        updateStats()
        tile.setBackgroundColor(if(mode == MainMenuActivity.Gamemode.Switcheroo) foolsPathColor else getColor(R.color.safe_block))

        when((1..4).random()) {
            1 -> generateFixBlock()
        }
    }

    private fun warningBlockHit() {
        vibrate(25)
        issues += 1
        checkIssues()
        updateStats()
        val handler1 = Handler(Looper.getMainLooper())
        player.setColorFilter(getColor(R.color.warning_block))
        handler1.postDelayed({
            if(playerColor != getColor(R.color.glow_teal)) {
                player.setColorFilter(playerColor) //sus250x
            } else player.colorFilter = null
        }, (150).toLong())
    }

    private fun errorBlockHit() {
        vibrate(75)
        val selectedTile1 = selectRandomTile()
        val selectedTile2 = selectRandomTile()
        val selectedTile3 = selectRandomTile()
        val selectedTile4 = selectRandomTile()
        val handler1 = Handler(Looper.getMainLooper())

        issues += (2..3).random()
        checkIssues()
        updateStats()
        player.setColorFilter(getColor(R.color.error_block))
        handler1.postDelayed({
            if(playerColor != getColor(R.color.glow_teal)) {
                player.setColorFilter(playerColor) //sus250x
            } else player.colorFilter = null
        }, (200).toLong())

        when {
            getBackgroundColor(selectedTile1) == getColor(R.color.warning_block) -> selectedTile1.setBackgroundColor(getColor(R.color.error_block))
            getBackgroundColor(selectedTile1) == getColor(R.color.error_block) -> {
                when((1..2).random()) {
                    1 -> selectedTile1.setBackgroundColor(getColor(R.color.tile_bomb_block))
                    2 -> selectedTile1.setBackgroundColor(getColor(R.color.black))
                }
            }
            getBackgroundColor(selectedTile1) == getColor(R.color.black) -> {
                when ((1..4).random()) {
                    in (2..4) -> selectedTile1.setBackgroundColor(getColor(R.color.glitch_block))
                }
            }
            else -> println("WIP code")
        }
        when {
            getBackgroundColor(selectedTile2) == getColor(R.color.warning_block) -> selectedTile2.setBackgroundColor(getColor(R.color.error_block))
            getBackgroundColor(selectedTile2) == getColor(R.color.error_block) -> {
                when((1..2).random()) {
                    1 -> selectedTile2.setBackgroundColor(getColor(R.color.tile_bomb_block))
                    2 -> selectedTile2.setBackgroundColor(getColor(R.color.black))
                }
            }
            getBackgroundColor(selectedTile2) == getColor(R.color.black) -> {
                when ((1..4).random()) {
                    in (2..4) -> selectedTile2.setBackgroundColor(getColor(R.color.glitch_block))
                }
            }
        else -> println("WIP code")
    }

            when {
        getBackgroundColor(selectedTile3) == getColor(R.color.warning_block) -> selectedTile3.setBackgroundColor(getColor(R.color.error_block))
        getBackgroundColor(selectedTile3) == getColor(R.color.error_block) -> {
            when((1..2).random()) {
                1 -> selectedTile3.setBackgroundColor(getColor(R.color.tile_bomb_block))
                2 -> selectedTile3.setBackgroundColor(getColor(R.color.black))
            }
        }
        getBackgroundColor(selectedTile3) == getColor(R.color.black) -> {
            when ((1..4).random()) {
                in (2..4) -> selectedTile3.setBackgroundColor(getColor(R.color.glitch_block))
            }
        }
        else -> println("WIP code") //don't remember what would've gone here, if anything
    }

    when {
        getBackgroundColor(selectedTile4) == getColor(R.color.warning_block) -> selectedTile4.setBackgroundColor(getColor(R.color.error_block))
        getBackgroundColor(selectedTile4) == getColor(R.color.error_block) -> {
            when((1..2).random()) {
                1 -> selectedTile4.setBackgroundColor(getColor(R.color.tile_bomb_block))
                2 -> selectedTile4.setBackgroundColor(getColor(R.color.black))
            }
        }
        getBackgroundColor(selectedTile4) == getColor(R.color.black) -> {
        when ((1..4).random()) {
            in (2..4) -> selectedTile4.setBackgroundColor(getColor(R.color.glitch_block))
        }
    }
        else -> println("WIP code")
         }
    }

    private fun crashBlockHit() {
        gameOver()
        updateStats()
    }

    @SuppressLint("RestrictedApi", "SetTextI18n")
    private fun gameOver() {
        if(!hasLost) {
            hasLost = true
            player.setColorFilter(getColor(R.color.error_block))
            val handler1 = Handler(Looper.getMainLooper())
            restartButton.visibility = View.VISIBLE
            menuButton.visibility = View.VISIBLE

            player.setOnTouchListener(null)
            screen.setBackgroundResource(R.drawable.death_gradient)

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                val r = if(mode != MainMenuActivity.Gamemode.PainMode) 4F else 14f
                screen.setRenderEffect(RenderEffect.createBlurEffect(r, r, Shader.TileMode.DECAL))
            }
            postGameText.visibility = View.VISIBLE
            postGameText.text = "Game Over."

            if (hasLost && hasWon) {
                postGameText.text = "You managed to win and loose simultaneously!"
                rainbow(grid, 90f, 1, 10f, true)
            }

            vibrate(250)

            shakeScreen()
            handler1.postDelayed({
                shakeScreen()
                handler1.postDelayed({
                    shakeScreen()
                    handler1.postDelayed({
                        shakeScreen()
                        handler1.postDelayed({
                            val animator = ObjectAnimator.ofFloat(grid, View.ROTATION, rot1end, 0f)
                            animator.duration = ((74..76).random()).toLong()
                            animator.start()

                            val animator2 =
                                ObjectAnimator.ofFloat(grid, View.ROTATION_X, rot2end, 0f)
                            animator2.duration = ((74..76).random()).toLong()
                            animator2.start()

                            val animator3 =
                                ObjectAnimator.ofFloat(grid, View.ROTATION_Y, rot3end, 0f)
                            animator3.duration = ((74..76).random()).toLong()
                            animator3.start()

                            if(mode == MainMenuActivity.Gamemode.Switcheroo) {
                                if((1..9000).random() == 7) startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/pyoURHR-g4U")))
                            }

                        }, 75)
                    }, 75)
                }, 75)
            }, 75)
            var repeatNum = 91
            if (finBlockGenerated) repeatNum = 90
            val handler = Handler(Looper.getMainLooper())
            var repeated = 0
            var repTime1 = 20
            var repTime2 = 805

            repeat(repeatNum) { //add hasDied var
                handler.postDelayed({
                    repeated++
                    if (repeated in 50..74) {
                        repTime1 = 25
                        repTime2 = 1056
                    }
                    if (repeated >= 75) {
                        repTime1 = 45
                        repTime2 = 1405
                    }
                    redAll()
                }, ((repTime1..repTime2).random()).toLong())
            }

            handler1.postDelayed({
                player.colorFilter = null
                saveStats()

                handler1.postDelayed({
                    player.setColorFilter(getColor(R.color.error_block))
                    handler1.postDelayed({
                        player.colorFilter = null
                        handler1.postDelayed({
                            player.setColorFilter(getColor(R.color.error_block))
                            handler1.postDelayed({
                                player.colorFilter = null
                                handler1.postDelayed({
                                    player.setColorFilter(getColor(R.color.error_block))
                                    handler1.postDelayed({
                                        player.colorFilter = null
                                        handler.postDelayed({
                                            val animator = ObjectAnimator.ofFloat(player, View.ALPHA, 1f, 0f)
                                            animator.duration = (1250).toLong()
                                            animator.start()
                                            handler.postDelayed({
                                                player.visibility = View.GONE
                                                if(hasLost && !hasWon) {
                                                    allTiles.forEach { frameLayout: FrameLayout ->
                                                        val animator2 = ObjectAnimator.ofFloat(frameLayout, View.ALPHA, 0.55f, 0.01f)
                                                        animator2.duration = (2777).toLong()
                                                        animator2.start()
                                                    }
                                                } else if(hasLost && hasWon) { // keeping hasWon to avoid confusion
                                                    val animator2 = ObjectAnimator.ofFloat(grid, View.ALPHA, 0.955f, 0.3555f)
                                                    animator2.duration = (2777).toLong()
                                                    animator2.start()
                                                    allTiles.forEach { frameLayout: FrameLayout ->
                                                        frameLayout.alpha = 0.71f
                                                    }
                                                }
                                            }, (1300).toLong())
                                        }, (333).toLong())
                                    }, (750).toLong())
                                }, (250).toLong())
                            }, (250).toLong())
                        }, (250).toLong())
                    }, (250).toLong())
                }, (250).toLong())
            }, (300).toLong())
        }
    }

    private fun redAll() {
        val tile = allTiles.random()
        if(tile.tag != "red" && tile.tag != "finish" ) {
            tile.tag = "red"
            tile.setBackgroundColor(Color.RED)
            if(tile.foreground != null) tile.foreground = null
        } else redAll()
    }

    private fun levelWin() {
        if(!hasWon) {
            var repeatNum = 90
            if(mode == MainMenuActivity.Gamemode.Glitch || mode == MainMenuActivity.Gamemode.SpeedMaze)
                repeatNum = 91
            hasWon = true
            println("win!")
            vibrate(75)
            player.setOnTouchListener(null)
            spin(player, 400, "z", 0f, 360f)
            val handler = Handler(Looper.getMainLooper())
            repeat(repeatNum) {
                handler.postDelayed({
                    rainbowAll()
                }, ((95..3505).random()).toLong())
            }
//            level++
            issues = 0
//        totalOptimizers += optimizers
            optimizers = 0
            saveStats()
//        loadNextLevel()
//            Toast.makeText(applicationContext, "You Win!", Toast.LENGTH_LONG).show()
            postGameText.visibility = View.VISIBLE
//            postGameText.text = "You won!\nTap your character to play again, or tap and hold to go to the main menu."
            postGameText.text = "You win!"

                restartButton.visibility = View.VISIBLE
                menuButton.visibility = View.VISIBLE
            // wins++
            if (hasLost && hasWon) {
                postGameText.text = "You managed to win and loose simultaneously!" //as String
                issues++ //I think this was done because it's technically an issue if user has won and lost at the same time, so the game adds 1 issue, just as a hidden joke.
                updateIssues()
                rainbow(grid, 350f, 1, 10f, true)
            }
        }
    }

    private fun rainbowAll() {
            val tile = allTiles.random()
            if(tile.tag != "rainbow" && tile.tag != "finish") {
                tile.tag = "rainbow"
                tile.alpha = 0.75f
                vibrate(10)
                if(tile.foreground != null) tile.foreground = null
                rainbow(tile, 0f, 9, 2f, false)
            } else {
                if(rainbowAttempts <= 950) {
                    rainbowAttempts++
                    rainbowAll()
                }
            }
    }
//    private fun loadNextLevel() { //leave this here because it's been here unused for so long, just as a memory
//        //xx = level
//        //load this level
//        //or... randomize game board
//    }
    private fun shakeScreen() {
        rot1end = (-1..1).random().toFloat()
        rot2end = (-1..1).random().toFloat()
        rot3end = (-1..1).random().toFloat()

        rot1start = (-1..1).random().toFloat()
        rot2start = (-1..1).random().toFloat()
        rot3start = (-1..1).random().toFloat()
        val animator = ObjectAnimator.ofFloat(grid, View.ROTATION, (rot1end / 3), (rot1start / 3))
        animator.duration = ((74..76).random()).toLong()
        animator.start()

        val animator2 = ObjectAnimator.ofFloat(grid, View.ROTATION_X, (rot2end / 3), (rot2start / 3))
        animator2.duration = ((74..76).random()).toLong()
        animator2.start()

        val animator3 = ObjectAnimator.ofFloat(grid, View.ROTATION_Y, (rot3end / 3), (rot3start / 3))
        animator3.duration = ((74..76).random()).toLong()
        animator3.start()
    }

    private fun loopShake() {
        shakeScreen()
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            loopShake()
        }, 80)
    }

    private fun shakePlayer() {
        pRot1end = (-4..4).random().toFloat()
        pRot2end = (-4..4).random().toFloat()
        pRot3end = (-4..4).random().toFloat()

        pRot1start = (-4..4).random().toFloat()
        pRot2start = (-4..4).random().toFloat()
        pRot3start = (-4..4).random().toFloat()
        val animator = ObjectAnimator.ofFloat(player, View.ROTATION, (pRot1end), (pRot1start))
        animator.duration = ((54..56).random()).toLong()
        animator.start()

        val animator2 = ObjectAnimator.ofFloat(player, View.ROTATION_X, (pRot2end), (pRot2start))
        animator2.duration = ((54..56).random()).toLong()
        animator2.start()

        val animator3 = ObjectAnimator.ofFloat(player, View.ROTATION_Y, (pRot3end), (pRot3start))
        animator3.duration = ((54..56).random()).toLong()
        animator3.start()
    }

    private fun loopShakePlayer() {
        if (playing) {
            playerShaking = true
            shakePlayer()
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                if (issues == (maxIssues - 1)) loopShakePlayer()
                else {
                    val animator =
                        ObjectAnimator.ofFloat(player, View.ROTATION, (player.rotation), (0f))
                    animator.duration = ((54..56).random()).toLong()
                    animator.start()

                    val animator2 =
                        ObjectAnimator.ofFloat(player, View.ROTATION_X, (player.rotationX), (0f))
                    animator2.duration = ((54..56).random()).toLong()
                    animator2.start()

                    val animator3 =
                        ObjectAnimator.ofFloat(player, View.ROTATION_Y, (player.rotationY), (0f))
                    animator3.duration = ((54..56).random()).toLong()
                    animator3.start()
                }
            }, 55)
        }
    }

    private fun getBackgroundColor(selectedTile: FrameLayout): Int {
        val background = selectedTile.background
        return if (background is ColorDrawable) background.color
        else {
            println("could not find requested color, returning transparent")
            Color.TRANSPARENT
        }
    }

    private fun checkHitboxes() {
        val glitchColor =  if(mode == MainMenuActivity.Gamemode.Switcheroo) {foolsGlitchColor}  else getColor(R.color.glitch_block)
        val errorColor =   if(mode == MainMenuActivity.Gamemode.Switcheroo) {foolsErrorColor}   else getColor(R.color.error_block)
        val warningColor = if(mode == MainMenuActivity.Gamemode.Switcheroo) {foolsWarningColor} else getColor(R.color.warning_block)
        val fixColor =     if(mode == MainMenuActivity.Gamemode.Switcheroo) {foolsFixColor}     else getColor(R.color.fix_block)
        val crashColor =   if(mode == MainMenuActivity.Gamemode.Switcheroo) {foolsCrashColor}   else getColor(R.color.black)
        val bombColor =    if(mode == MainMenuActivity.Gamemode.Switcheroo) {foolsBombColor}    else getColor(R.color.tile_bomb_block)
        val playerX = player.x
        val playerY = player.y
        allTiles.onEach { frameLayout: FrameLayout ->
            val tileX = frameLayout.x
            val tileY = frameLayout.y
            /*
            if(playerX <= (tileX + 165f)) { // up = left | left | Johnathan phone: +115 | Austin phone before: same | me before: + 165f | me: 165 | Xavier: 165f
                if(playerX >= (tileX - 90f)) { // up = left (remember number is negative rn) | right | Johnathan phone: -70 | Austin phone before: same | me before: - 80f | me: -90 | Xavier: -90f
//                    println("X collision detected.")
//                    println("player's X is $playerX and tile's X is $tileX")
                    if(playerY >= (tileY + 102f)) { // up = up | bottom | Johnathan phone: -25 | Austin phone before: 102f | me before: + 65f | me: 102 | Xavier: +85f
                        if(playerY <= (tileY + 310f)) { // up = up | top | Johnathan phone: +120 | Austin phone before: 303f | me before + 270f | me: 310 | Xavier: +285f
//                            println("Y collision detected.")
            */
            val playerTop = playerY
            val playerBottom = playerY + player.height
            val playerLeft = playerX
            val playerRight = playerX + player.width
            val tileTop = tileY + grid.y
            val tileBottom = tileY + frameLayout.height + grid.y
            val tileLeft =   tileX + grid.x
            val tileRight =  tileX + frameLayout.width + grid.x

            if(playerLeft <= (tileRight + (frameLayout.width / 19.75f ))) { // Player Left - Tile Right hitbox. Negative leeway added because of weird shape & size of player | Remember, X coords are bigger when farther right on screen
                if(playerRight >= (tileLeft - (frameLayout.width / 19.75f))) { // Player Right - Tile Left hitbox. Negative leeway added because of weird shape & size of player | Remember, X coords are bigger when farther right on screen
//                    println("X collision detected.")
                    if(playerBottom >= (tileTop + (frameLayout.height / 5.9f ))) { //     Player Bottom - Tile Top hitbox. Leeway added. Remember, Y coords are bigger when LOWER on screen
                        if(playerTop <= (tileBottom - (frameLayout.height / 8.5f ))) { // Player Top - Tile Bottom hitbox. Leeway added. Remember, Y coords are bigger when LOWER on screen
//                            println("Y collision detected.")
                            if(frameLayout.alpha == 0.55f) {
                                frameLayout.alpha = 0.6f
                                if(mode == MainMenuActivity.Gamemode.PainMode) {
                                    vibrate((150..1000).random().toLong())
                                    when((1..573).random()) {
                                        in 1..52 -> frameLayout.setBackgroundColor(Color.TRANSPARENT)
                                        in 256..258 -> frameLayout.setBackgroundColor(getColor(R.color.error_block))
                                    }
                                }

                                if (frameLayout.foreground != null) optimizerCollect(frameLayout) // Note: change this if/when other tile items are added (like tile bomb as an item instead of tile type/color)

                                when {
                                    getBackgroundColor(frameLayout) == warningColor -> {
                                        if(mode == MainMenuActivity.Gamemode.SuddenDeath) gameOver()
                                        else warningBlockHit()
                                    }
                                    getBackgroundColor(frameLayout) == errorColor -> {
                                        if(mode == MainMenuActivity.Gamemode.SuddenDeath) gameOver()
                                        else errorBlockHit()
                                    }
                                    getBackgroundColor(frameLayout) == crashColor -> crashBlockHit()
                                    getBackgroundColor(frameLayout) == bombColor -> tileBombBlockHit(frameLayout)
                                    getBackgroundColor(frameLayout) == fixColor -> {
                                        fixBlockHit(frameLayout)
                                        if(mode == MainMenuActivity.Gamemode.TimeTrials) time += 1.0
                                    }
                                    getBackgroundColor(frameLayout) == glitchColor -> {
                                        if(mode == MainMenuActivity.Gamemode.SuddenDeath) gameOver()
                                        else glitchBlockHit()
                                    }

                                }
                            } else if(frameLayout.alpha == 0.75f && frameLayout.tag == "finish") levelWin()
                        } else if(frameLayout.alpha == 0.6f) frameLayout.alpha = 0.55f
                    } else if(frameLayout.alpha == 0.6f) frameLayout.alpha = 0.55f
                } else if(frameLayout.alpha == 0.6f) frameLayout.alpha = 0.55f
            } else if(frameLayout.alpha == 0.6f) frameLayout.alpha = 0.55f
        }
        if(playerY <= (grid.y - (player.height * 1.1F)) && mode == MainMenuActivity.Gamemode.SpeedMaze) levelWin()
        if(mode == MainMenuActivity.Gamemode.SpeedMaze && !timerStarted) {
            timerStarted = true
            startTimer()
        }
    }

    private fun tileBombBlockHit(thisTile: FrameLayout) {
        thisTile.setBackgroundColor(if(mode == MainMenuActivity.Gamemode.Switcheroo) foolsWarningColor else getColor(R.color.warning_block))
        vibrate(230)
        repeat((5..10).random()) {
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                when((1..11).random()) {
                    in 1..3 -> highlightRandomTile(if(mode == MainMenuActivity.Gamemode.Switcheroo) foolsWarningColor else getColor(R.color.warning_block))
                    in 4..6 -> highlightRandomTile(if(mode == MainMenuActivity.Gamemode.Switcheroo) foolsErrorColor else getColor(R.color.error_block))
                    in 7..8 -> highlightRandomTile(if(mode == MainMenuActivity.Gamemode.Switcheroo) foolsCrashColor else getColor(R.color.black))
                    9 -> highlightRandomTile(if(mode == MainMenuActivity.Gamemode.Switcheroo) foolsGlitchColor else getColor(R.color.glitch_block))
                    10 -> highlightRandomTile(if(mode == MainMenuActivity.Gamemode.Switcheroo) foolsBombColor else getColor(R.color.tile_bomb_block))
                    11 -> highlightRandomTile(if(mode == MainMenuActivity.Gamemode.Switcheroo) foolsPathColor else getColor(R.color.safe_block))
                }
                vibrate(55)
            }, ((15..450).random().toLong()))
        }
    }

    private fun glitchBlockHit() {
        vibrate(20)
        val handler1 = Handler(Looper.getMainLooper())
        player.setColorFilter(getColor(R.color.glitch_block))
        handler1.postDelayed({
            if(playerColor != getColor(R.color.glow_teal)) {
                player.setColorFilter(playerColor) //sus250x
            } else player.colorFilter = null
        }, (150).toLong())
        if (mode != MainMenuActivity.Gamemode.Glitch) {
            when ((1..20).random()) {
                in (1..2) -> {
                    issues += (1..3).random()
                    repeat((0..2).random()) {
                        highlightRandomTile(if(mode == MainMenuActivity.Gamemode.Switcheroo) arrayOf(getColor(R.color.glitch_block), foolsGlitchColor, foolsGlitchColor).random() else getColor(R.color.glitch_block))
                    }
                }
                in (3..19) -> {
                    issues += (0..3).random()
                    repeat((2..6).random()) {
                        highlightRandomTile(if(mode == MainMenuActivity.Gamemode.Switcheroo) arrayOf(getColor(R.color.glitch_block), foolsGlitchColor, foolsGlitchColor).random() else getColor(R.color.glitch_block))
                    }
                }
                20 -> {
                    repeat((2..6).random()) {
                        highlightRandomTile(if(mode == MainMenuActivity.Gamemode.Switcheroo) arrayOf(getColor(R.color.glitch_block), foolsGlitchColor, foolsGlitchColor).random() else getColor(R.color.glitch_block))
                    }
                    issues += (maxIssues - 1)
                }
            }
        } else if (mode == MainMenuActivity.Gamemode.Glitch) {
            when ((1..24).random()) {
                1 -> {
                    issues += (1..3).random()
                    repeat((2..7).random()) {
                        highlightRandomTile(getColor(R.color.glitch_block))
                        optimizers++
                        when((1..6).random()) {
                            5 -> generateFixBlock()
                        }
                    }
                }

                in (2..24) -> {
                    issues += (0..2).random()
                    repeat((3..6).random()) {
                        glitchSpread()
                    }

                    when((1..8).random()) {
                        in 1..7 -> generateFixBlock()
                    }
                }
            }
//            repeat((2..6).random()) {
//                highlightRandomTile(getColor(R.color.glitch_block))
//                optimizers++
//            }
        }
        checkIssues()
        updateStats()
    }

    private fun glitchSpread() {
        var glitchScore = 0
        if(optimizers < 91) {
            val tile = selectRandomTile()
            if (getBackgroundColor(tile) != getColor(R.color.glitch_block)) {
                tile.setBackgroundColor(getColor(R.color.glitch_block))
            } else if(glitchFails <= 2000) {
                glitchFails++
                glitchSpread()
            }
        }
        allTiles.forEach { frameLayout: FrameLayout ->
            if(getBackgroundColor(frameLayout) == getColor(R.color.glitch_block)) glitchScore++
        }
        optimizers = glitchScore
        updateOptimizers()
        if (glitchScore >= 91) levelWin()
    }

    private fun readData() {
//        issues = shared.getInt("issues", issues)
//        level = shared.getInt("level", level)
//        optimizers = shared.getInt("optimizers", optimizers)
        totalOptimizers = shared.getInt("totalOptimizers", totalOptimizers)
        difficulty = DifficultyActivity.Difficulty.difficulty

        SettingsValues.vibrationsAllowed   = shared.getBoolean("vibrations",    SettingsValues.vibrationsAllowed )
        SettingsValues.visualMazeGen       = shared.getBoolean("visualMazeGen", SettingsValues.visualMazeGen )
        SettingsValues.keepGeneratingOptis = shared.getBoolean("keepGenOptis",  SettingsValues.keepGeneratingOptis)
        SettingsValues.rainbowCharacter    = shared.getBoolean("rainbowCharacter",  SettingsValues.rainbowCharacter)
    }

    private fun saveStats() {
        val edit = shared.edit()
//        edit.putInt("issues" , issues )
//        edit.putInt("level" , level )
//        edit.putInt("optimizers" , optimizers )
        edit.putInt("totalOptimizers" , totalOptimizers )

        //                     --Settings--                     \\
        edit.putBoolean("vibrations" , SettingsValues.vibrationsAllowed)
        edit.putBoolean("visualMazeGen" , SettingsValues.visualMazeGen)
        edit.putBoolean("keepGenOptis" , SettingsValues.keepGeneratingOptis)
        edit.putBoolean("rainbowCharacter" , SettingsValues.rainbowCharacter)
        edit.apply()
    }
    private fun vibrate(time: Long, strength: Int = -1) {
        val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        if (SettingsValues.vibrationsAllowed && vibrator.hasVibrator()) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                vibrator.vibrate(VibrationEffect.createOneShot( time, strength)) // New vibrate method for API Level 26 or higher
            } else {
                vibrator.vibrate(time) // Vibrate method for below API Level 26
            }
        }
    }

    private fun rainbow(target: View, hue: Float, speed: Long, strength: Float, ignoreHasLost: Boolean = false) {
        if ((playing && !hasLost) || (playing && ignoreHasLost)) {
            var h = hue

            if (h >= 360f)
                h -= 360f

            if (target == player && target is ImageView)
                target.setColorFilter(Color.HSVToColor(floatArrayOf(h, 100f, 100f)))
            else
                target.setBackgroundColor(Color.HSVToColor(floatArrayOf(h, 100f, 100f)))

            Handler(Looper.getMainLooper()).postDelayed({
                rainbow(target, (h + strength), speed, strength, ignoreHasLost)
            }, (speed))
        }
    }

    fun goToMenu(view: View) {
        resetTileData()
        vibrate(4)
        val intent = Intent(this@MainActivity, MainMenuActivity::class.java)
        playing = false
        startActivity(intent)
        finish()
    }

    private fun resetTileData() {
        val newArray = BooleanArray(91) { false }
        ALL_TILES = newArray
    }

    fun restart(view: View) {
//        if(stage != 0) {
//            mode = MainMenuActivity.Gamemode.Stages
//            stage = 0
//        }
        issues = 0
        optimizers = 0
        resetTileData()
        vibrate(5)
        val intent = Intent(this@MainActivity, StartActivity::class.java)
        playing = false
        startActivity(intent)
        finish()
    }

//    class Tile(val x: Int, val y: Int)

}
// Green: Safe block
// Orange: Warning Block; adds 1 issue to the user's "code"
// Red: Error Block; adds 2 to 3 issues to the user's "code" and creates more unsafe blocks. Chosen orange blocks become red and chosen red blocks become black, and some chosen black blocks can become magenta
// Black: Crash Blocks; hitting one of these is an instant game over.
// Teal: Fix Blocks; fixes 1 issue and small chance of adding another fix block over a green safe block.
// Magenta: Glitch Blocks; Let the spread of the glitch apocalypse begin. ;) (can spread, add issues, or kill)
// Goal: get to the other side without dying, and collect items on the way (items not implemented yet)

/* ~FEATURE IDEAS~
*  Hitting an Error Block makes the phone vibrate and screen shake via 3D rotation -- already implemented (final feature modified slightly from this)
*  Idea: White Blocks: Ad Blocks; gives the user a frikin' ad -- idea scrapped | Note: May be worth looking into again. Could make an entire gamemode about this!
*  Story Mode -- idk
*  Sound effects
*  Color mode(?): tell user color, user navigates to tile of this color before time runs out
*
* April Fools mode: Game board generates like normal classic game, but the functions of each color are randomized each game. If there's time, there will also be a rickroll tile that appears. -- done
*  More Ideas in a note on my phone.
*
* 563 | 4849 -> 746 ~ 2179 ~ 6/21/23: 2476 ~ _/__/2_: ____ */ // Total number of lines over time (including this line?)TEST%d
