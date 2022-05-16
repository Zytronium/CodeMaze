package com.example.minigame

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.*
import android.view.*
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.graphics.toColorInt
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.gridlayout.widget.GridLayout
import com.example.minigame.Path1Activity.Path1Tiles.TILE0
import com.example.minigame.Path1Activity.Path1Tiles.TILE1
import com.example.minigame.Path1Activity.Path1Tiles.TILE10
import com.example.minigame.Path1Activity.Path1Tiles.TILE11
import com.example.minigame.Path1Activity.Path1Tiles.TILE12
import com.example.minigame.Path1Activity.Path1Tiles.TILE13
import com.example.minigame.Path1Activity.Path1Tiles.TILE14
import com.example.minigame.Path1Activity.Path1Tiles.TILE15
import com.example.minigame.Path1Activity.Path1Tiles.TILE16
import com.example.minigame.Path1Activity.Path1Tiles.TILE17
import com.example.minigame.Path1Activity.Path1Tiles.TILE18
import com.example.minigame.Path1Activity.Path1Tiles.TILE19
import com.example.minigame.Path1Activity.Path1Tiles.TILE2
import com.example.minigame.Path1Activity.Path1Tiles.TILE20
import com.example.minigame.Path1Activity.Path1Tiles.TILE21
import com.example.minigame.Path1Activity.Path1Tiles.TILE22
import com.example.minigame.Path1Activity.Path1Tiles.TILE23
import com.example.minigame.Path1Activity.Path1Tiles.TILE24
import com.example.minigame.Path1Activity.Path1Tiles.TILE25
import com.example.minigame.Path1Activity.Path1Tiles.TILE26
import com.example.minigame.Path1Activity.Path1Tiles.TILE27
import com.example.minigame.Path1Activity.Path1Tiles.TILE28
import com.example.minigame.Path1Activity.Path1Tiles.TILE29
import com.example.minigame.Path1Activity.Path1Tiles.TILE3
import com.example.minigame.Path1Activity.Path1Tiles.TILE30
import com.example.minigame.Path1Activity.Path1Tiles.TILE31
import com.example.minigame.Path1Activity.Path1Tiles.TILE32
import com.example.minigame.Path1Activity.Path1Tiles.TILE33
import com.example.minigame.Path1Activity.Path1Tiles.TILE34
import com.example.minigame.Path1Activity.Path1Tiles.TILE35
import com.example.minigame.Path1Activity.Path1Tiles.TILE36
import com.example.minigame.Path1Activity.Path1Tiles.TILE37
import com.example.minigame.Path1Activity.Path1Tiles.TILE38
import com.example.minigame.Path1Activity.Path1Tiles.TILE39
import com.example.minigame.Path1Activity.Path1Tiles.TILE4
import com.example.minigame.Path1Activity.Path1Tiles.TILE40
import com.example.minigame.Path1Activity.Path1Tiles.TILE41
import com.example.minigame.Path1Activity.Path1Tiles.TILE42
import com.example.minigame.Path1Activity.Path1Tiles.TILE43
import com.example.minigame.Path1Activity.Path1Tiles.TILE44
import com.example.minigame.Path1Activity.Path1Tiles.TILE45
import com.example.minigame.Path1Activity.Path1Tiles.TILE46
import com.example.minigame.Path1Activity.Path1Tiles.TILE47
import com.example.minigame.Path1Activity.Path1Tiles.TILE48
import com.example.minigame.Path1Activity.Path1Tiles.TILE49
import com.example.minigame.Path1Activity.Path1Tiles.TILE5
import com.example.minigame.Path1Activity.Path1Tiles.TILE50
import com.example.minigame.Path1Activity.Path1Tiles.TILE51
import com.example.minigame.Path1Activity.Path1Tiles.TILE52
import com.example.minigame.Path1Activity.Path1Tiles.TILE53
import com.example.minigame.Path1Activity.Path1Tiles.TILE54
import com.example.minigame.Path1Activity.Path1Tiles.TILE55
import com.example.minigame.Path1Activity.Path1Tiles.TILE56
import com.example.minigame.Path1Activity.Path1Tiles.TILE57
import com.example.minigame.Path1Activity.Path1Tiles.TILE58
import com.example.minigame.Path1Activity.Path1Tiles.TILE59
import com.example.minigame.Path1Activity.Path1Tiles.TILE6
import com.example.minigame.Path1Activity.Path1Tiles.TILE60
import com.example.minigame.Path1Activity.Path1Tiles.TILE61
import com.example.minigame.Path1Activity.Path1Tiles.TILE62
import com.example.minigame.Path1Activity.Path1Tiles.TILE63
import com.example.minigame.Path1Activity.Path1Tiles.TILE64
import com.example.minigame.Path1Activity.Path1Tiles.TILE65
import com.example.minigame.Path1Activity.Path1Tiles.TILE66
import com.example.minigame.Path1Activity.Path1Tiles.TILE67
import com.example.minigame.Path1Activity.Path1Tiles.TILE68
import com.example.minigame.Path1Activity.Path1Tiles.TILE69
import com.example.minigame.Path1Activity.Path1Tiles.TILE7
import com.example.minigame.Path1Activity.Path1Tiles.TILE70
import com.example.minigame.Path1Activity.Path1Tiles.TILE71
import com.example.minigame.Path1Activity.Path1Tiles.TILE72
import com.example.minigame.Path1Activity.Path1Tiles.TILE73
import com.example.minigame.Path1Activity.Path1Tiles.TILE74
import com.example.minigame.Path1Activity.Path1Tiles.TILE75
import com.example.minigame.Path1Activity.Path1Tiles.TILE76
import com.example.minigame.Path1Activity.Path1Tiles.TILE77
import com.example.minigame.Path1Activity.Path1Tiles.TILE78
import com.example.minigame.Path1Activity.Path1Tiles.TILE79
import com.example.minigame.Path1Activity.Path1Tiles.TILE8
import com.example.minigame.Path1Activity.Path1Tiles.TILE80
import com.example.minigame.Path1Activity.Path1Tiles.TILE81
import com.example.minigame.Path1Activity.Path1Tiles.TILE82
import com.example.minigame.Path1Activity.Path1Tiles.TILE83
import com.example.minigame.Path1Activity.Path1Tiles.TILE84
import com.example.minigame.Path1Activity.Path1Tiles.TILE85
import com.example.minigame.Path1Activity.Path1Tiles.TILE86
import com.example.minigame.Path1Activity.Path1Tiles.TILE87
import com.example.minigame.Path1Activity.Path1Tiles.TILE88
import com.example.minigame.Path1Activity.Path1Tiles.TILE89
import com.example.minigame.Path1Activity.Path1Tiles.TILE9
import com.example.minigame.Path1Activity.Path1Tiles.TILE90

class MainActivity : AppCompatActivity() {
    private var mode: Int = MainMenuActivity.GameMode.gamemode // 1 = classic; 2 = speed maze; 3 = speedrun; 4 = glitch; 5 = pain mode; 6 = infinite; 7 = sudden death;
    private var alphaUp: Boolean = true
    private var alphaDown: Boolean = false
    private var optiFails: Int = 0
    private var fixFails: Int = 0
    private var errorFails: Int = 0
    private var crashFails: Int = 0

    // ~ Stats: ~
    private var issues: Int = 0
    private var level: Int = 1
    private var optimizers: Int = 0
    private var totalOptimizers: Int = 0
    private var optiGoal: Int = 25
    private var difficulty: Int = DifficultyActivity.Difficulty.difficulty //0 //(1..4).random() // 0 - baby | 1 - beginner | 2 - easy | 3 - medium | 4 - hard | 5 - harder | 6 - expert | 7 - impossible | 8 - impossible++
    private var finBlockGenerated: Boolean = false
    private lateinit var shared : SharedPreferences
    // ~ Stats ~

    private lateinit var postGameText: TextView
    private lateinit var grid: GridLayout
    private lateinit var screen: ConstraintLayout
    private lateinit var issuesText: TextView
    private lateinit var optiText: TextView
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
    private lateinit var path1: Array<FrameLayout>

    private var mainLayout: ViewGroup? = null
    private var xDelta = 0
    private var yDelta = 0

    private var rot1start =  0f
    private var rot1end =  (-5..5).random().toFloat()
    private var rot2start =  0f
    private var rot2end =  (-5..5).random().toFloat()
    private var rot3start =  0f
    private var rot3end =  (-5..5).random().toFloat()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        shared = getSharedPreferences("CodeMinigameDB", Context.MODE_PRIVATE)

        postGameText = findViewById(R.id.pgtv)
        grid = findViewById(R.id.grid)
        screen = findViewById(R.id.screen)
        issuesText = findViewById(R.id.textView2)
        optiText = findViewById(R.id.textView3)
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
        tile89 = findViewById(R.id.tile89)
        tile90 = findViewById(R.id.tile90)

        optiFails = 0
        fixFails = 0
        errorFails = 0
        crashFails = 0

        allTiles = arrayOf(tile1, tile2, tile3, tile0, tile4, tile5, tile16, tile7, tile71, tile9, tile10, tile11, tile12, tile13, tile14, tile15, tile17, tile6, tile18, tile19, tile20, tile21, tile22, tile23, tile24, tile25, tile26, tile27, tile28, tile29, tile30, tile31, tile32, tile33, tile34, tile35, tile36, tile37, tile38, tile39, tile40, tile41, tile42, tile43, tile44, tile45, tile46, tile47, tile48, tile49, tile50, tile51, tile52, tile53, tile54, tile55, tile56, tile57, tile58, tile59, tile60, tile61, tile62, tile63, tile64, tile65, tile66, tile67, tile68, tile69, tile70, tile8, tile72, tile73, tile74, tile75, tile76, tile77, tile78, tile79, tile80, tile81, tile82, tile83, tile84, tile85, tile86, tile87, tile88, tile89, tile90)
        allTiles.shuffle()
        path1 = arrayOf(tile84, tile56, tile54, tile42, tile38, tile50, tile78, tile23, tile29, tile15, tile46, tile75, tile17, tile55, tile1, tile58, tile25, tile72, tile70, tile39, tile30, tile20, tile34, tile10, tile19, tile32, tile68, tile12, tile87, tile89, tile62, tile47, tile44, tile37, tile85, tile82, tile24, tile7, tile8, tile28, tile21, tile60, tile33, tile3, tile52)
        when(difficulty) {
            0 -> optiGoal = 5 //testing goal // baby
            1 -> optiGoal = (15..30).random() // beginner
            2 -> optiGoal = (30..50).random()  // easy
            3 -> optiGoal = (50..100).random() // medium
            4 -> optiGoal = (100..170).random() // hard
            5 -> optiGoal = (175..275).random() // harder
            6 -> optiGoal = (300..550).random() // expert
            7 -> optiGoal = (700..1500).random() // impossible
            8 -> optiGoal = (2500..4000).random() // impossible++
        }
        mainLayout = findViewById<View>(R.id.main) as RelativeLayout
        player.setOnTouchListener(onTouchListener())

        if(mode == 7) screen.setBackgroundResource(R.drawable.death_gradient)

        val w: Window = window
        w.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

    val windowInsetsController =
            ViewCompat.getWindowInsetsController(window.decorView) ?: return
        windowInsetsController.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        windowInsetsController.hide(WindowInsetsCompat.Type.systemBars())

        readData()
        updateStats()
        checkIssues()
        generateTiles()

        if(mode == 5) {
            loopShake()
            alphaFluctuate()
        }

        if(mode == 3) {
            loopError()
        }

        if (mode == 4) {
            optiText.text = getString(R.string.glitch_score, optimizers.toString())
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                glitchUnspread()
            }, (3335).toLong())
        }

    }


    private fun loopError() {
        apocalypseProgress()
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            loopError()
        }, (750).toLong())
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
        when((1..13001).random()) {
            1355 -> grid.alpha = 0.9f
            117 -> grid.alpha = 0.001f
        }
        if(grid.alpha in 0.05f..0.35f) {
            if(grid.alpha <= 0.05f) {
                alphaUp = true
                alphaDown = false
            }
            if(grid.alpha >= 0.35f) {
                alphaUp = false
                alphaDown = true
            }
            if(alphaUp) grid.alpha += 0.05f
            if(alphaDown) grid.alpha -= 0.05f
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                alphaFluctuate()
            }, (50).toLong())
        } else {
            grid.alpha = 0.05f
            alphaFluctuate()
        }
    }

    private fun generateLayout1() {
        println(TILE0.toString())
        println(TILE1.toString())
        println(TILE2.toString())
        println(TILE3.toString())
        println(TILE4.toString())
        println(TILE5.toString())
        println(TILE6.toString())
        println(TILE7.toString())
        println(TILE8.toString())
        println(TILE9.toString())
        println(TILE10.toString())
        println(TILE11.toString())
        println(TILE12.toString())
        println(TILE13.toString())
        println(TILE14.toString())
        println(TILE15.toString())
        println(TILE16.toString())
        println(TILE17.toString())
        println(TILE18.toString())
        println(TILE19.toString())
        println(TILE20.toString())
        println(TILE21.toString())
        println(TILE22.toString())
        println(TILE23.toString())
        println(TILE24.toString())
        println(TILE25.toString())
        println(TILE26.toString())
        println(TILE27.toString())
        println(TILE28.toString())
        println(TILE29.toString())
        println(TILE30.toString())
        println(TILE31.toString())
        println(TILE32.toString())
        println(TILE33.toString())
        println(TILE34.toString())
        println(TILE35.toString())
        println(TILE36.toString())
        println(TILE37.toString())
        println(TILE38.toString())
        println(TILE39.toString())
        println(TILE40.toString())
        println(TILE41.toString())
        println(TILE42.toString())
        println(TILE43.toString())
        println(TILE44.toString())
        println(TILE45.toString())
        println(TILE46.toString())
        println(TILE47.toString())
        println(TILE48.toString())
        println(TILE49.toString())
        println(TILE50.toString())
        println(TILE51.toString())
        println(TILE52.toString())
        println(TILE53.toString())
        println(TILE54.toString())
        println(TILE55.toString())
        println(TILE56.toString())
        println(TILE57.toString())
        println(TILE58.toString())
        println(TILE59.toString())
        println(TILE60.toString())
        println(TILE61.toString())
        println(TILE62.toString())
        println(TILE63.toString())
        println(TILE64.toString())
        println(TILE65.toString())
        println(TILE66.toString())
        println(TILE67.toString())
        println(TILE68.toString())
        println(TILE69.toString())
        println(TILE70.toString())
        println(TILE71.toString())
        println(TILE72.toString())
        println(TILE73.toString())
        println(TILE74.toString())
        println(TILE75.toString())
        println(TILE76.toString())
        println(TILE77.toString())
        println(TILE78.toString())
        println(TILE79.toString())
        println(TILE80.toString())
        println(TILE81.toString())
        println(TILE82.toString())
        println(TILE83.toString())
        println(TILE84.toString())
        println(TILE85.toString())
        println(TILE86.toString())
        println(TILE87.toString())
        println(TILE88.toString())
        println(TILE89.toString())
        println(TILE90.toString())
        allTiles.forEach { frameLayout: FrameLayout ->
            frameLayout.setBackgroundColor(getColor(R.color.warning_block))
        }
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
        generateLayout1()
        generateFixes((6..10).random())
        if(mode != 4) {
            generateOptimizers(6)
        }
        generateErrors((20..25).random())
        generateCrashes((5..7).random())
        if(mode == 4) highlightRandomTile(getColor(R.color.glitch_block))
    }

    private fun generateFixes(repeatNum: Int) {
        repeat(repeatNum) {
            generateFix()
        }
    }

    private fun generateFix() {
        println("generating fix tile")
        val tile = selectRandomTile()
        if (getBackgroundColor(tile) == getColor(R.color.safe_block)) {
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
                    val lParams = view.layoutParams as RelativeLayout.LayoutParams
                    xDelta = x - lParams.leftMargin
                    (y - lParams.topMargin).also { yDelta = it }
                }

                MotionEvent.ACTION_MOVE -> {
                    val layoutParams = view
                        .layoutParams as RelativeLayout.LayoutParams
                    layoutParams.leftMargin = x - xDelta
                    layoutParams.topMargin = y - yDelta
                    layoutParams.rightMargin =  xDelta - x + 995
                    layoutParams.bottomMargin = yDelta - y + 2225
                    view.layoutParams = layoutParams
                }
            }
            mainLayout!!.invalidate()
            true
        }
    }

    private fun checkIssues() {
        if (issues >= 10) {
            issues = 0
            gameOver()
        }
    }

    private fun updateIssues() {
        issuesText.text = getString(R.string.issues, issues.toString())
    }

    private fun updateOptimizers() {
        if(mode !=4 && mode != 6) optiText.text = getString(R.string.optimizers_and_goal, optimizers.toString(), optiGoal.toString())
        else if (mode == 4) optiText.text = getString(R.string.glitch_score, optimizers.toString())
        else if (mode == 6) optiText.text = getString(R.string.optimizers, optimizers.toString())
    }

    private fun generateOptimizers(repeatNum: Int) {
        repeat(repeatNum) {
            generateOptimizer()
        }
    }

    private fun generateOptimizer() {
        val tile = selectRandomTile()
        if(getBackgroundColor(tile) == getColor(R.color.safe_block)) {
//            tile.foreground = (R.drawable.ic_baseline_extension_24).toDrawable()
//            tile.setBackgroundColor(getColor(R.color.safe_block))
            tile.setBackgroundColor(getColor(R.color.optimizer_piece))
        } else {
            optiFails++
            if(optiFails < 500) {
                generateOptimizer()
            } else println("cannot find a spot to generate a new optimizer tile")
        }
    }

    private fun optimizerCollect(tile: FrameLayout) {
        tile.setBackgroundColor(getColor(R.color.safe_block))
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
        if(optimizers >= optiGoal && !finBlockGenerated && mode !=6) {
            generateFinishBlock()
            finBlockGenerated = true
        }
        updateStats()
//        saveStats()
        //if(optimizers <= x) {below code}
        generateOptimizer()
    }

    private fun generateFinishBlock() {
        val newTile = selectRandomTile()
        if(getBackgroundColor(newTile) == getColor(R.color.safe_block)) {
              newTile.setBackgroundColor(getColor(R.color.white))
            newTile.tag = "finish"
            rainbowEffect(newTile)
            newTile.alpha = 0.75f
        } else {
            generateFinishBlock()
        }
    }

    private fun generateFixBlock() {
        val newTile = selectRandomTile()
        if(getBackgroundColor(newTile) == getColor(R.color.safe_block)) {
            newTile.setBackgroundColor(getColor(R.color.fix_block))
        } else {
            generateFixBlock()
        }
    }

    private fun fixBlockHit(tile: FrameLayout) {
        if (issues != 0) {
            issues -= 1
        }

        updateStats()
        tile.setBackgroundColor(getColor(R.color.safe_block))

        when((1..4).random()) {
            1 -> generateFixBlock()
        }
    }

    private fun warningBlockHit() {
        issues += 1
        checkIssues()
        updateStats()
        val handler1 = Handler(Looper.getMainLooper())
        player.setColorFilter(getColor(R.color.warning_block))
        handler1.postDelayed({
            player.colorFilter = null
        }, (150).toLong())
    }

    private fun errorBlockHit() {
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
            player.colorFilter = null
        }, (200).toLong())

        when {
            getBackgroundColor(selectedTile1) == getColor(R.color.warning_block) -> selectedTile1.setBackgroundColor(getColor(R.color.error_block))
            getBackgroundColor(selectedTile1) == getColor(R.color.error_block) -> selectedTile1.setBackgroundColor(getColor(R.color.black))
            getBackgroundColor(selectedTile1) == getColor(R.color.black) -> {
                when ((1..3).random()) {
                    in (2..3) -> selectedTile1.setBackgroundColor(getColor(R.color.glitch_block))
                }
            }
            else -> println("WIP code")
        }
        when {
            getBackgroundColor(selectedTile2) == getColor(R.color.warning_block) -> selectedTile2.setBackgroundColor(getColor(R.color.error_block))
            getBackgroundColor(selectedTile2) == getColor(R.color.error_block) -> selectedTile2.setBackgroundColor(getColor(R.color.black))
            getBackgroundColor(selectedTile2) == getColor(R.color.black) -> {
                when ((1..3).random()) {
                    in (2..3) -> selectedTile2.setBackgroundColor(getColor(R.color.glitch_block))
                }
            }
        else -> println("WIP code")
    }

            when {
        getBackgroundColor(selectedTile3) == getColor(R.color.warning_block) -> selectedTile3.setBackgroundColor(getColor(R.color.error_block))
        getBackgroundColor(selectedTile3) == getColor(R.color.error_block) -> selectedTile3.setBackgroundColor(getColor(R.color.black))
        getBackgroundColor(selectedTile3) == getColor(R.color.black) -> {
            when ((1..3).random()) {
                in (2..3) -> selectedTile3.setBackgroundColor(getColor(R.color.glitch_block))
            }
        }
        else -> println("WIP code")
    }

    when {
        getBackgroundColor(selectedTile4) == getColor(R.color.warning_block) -> selectedTile4.setBackgroundColor(getColor(R.color.error_block))
        getBackgroundColor(selectedTile4) == getColor(R.color.error_block) -> selectedTile4.setBackgroundColor(getColor(R.color.black))
        getBackgroundColor(selectedTile4) == getColor(R.color.black) -> {
        when ((1..3).random()) {
            in (2..3) -> selectedTile4.setBackgroundColor(getColor(R.color.glitch_block))
        }
    }
        else -> println("WIP code")
         }
    }

    private fun crashBlockHit() {
        gameOver()
        updateStats()
    }

    @SuppressLint("RestrictedApi")
    private fun gameOver() {
        player.setColorFilter(getColor(R.color.error_block))
        val handler1 = Handler(Looper.getMainLooper())

        player.setOnTouchListener(null)
        Toast.makeText(applicationContext, "You Lost.", Toast.LENGTH_LONG).show()
        postGameText.visibility = View.VISIBLE
        postGameText.text = "Game Over.\nTap your character to play again, or tap and hold to go to the main menu."

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

                        val animator2 = ObjectAnimator.ofFloat(grid, View.ROTATION_X, rot2end, 0f)
                        animator2.duration = ((74..76).random()).toLong()
                        animator2.start()

                        val animator3 = ObjectAnimator.ofFloat(grid, View.ROTATION_Y, rot3end, 0f)
                        animator3.duration = ((74..76).random()).toLong()
                        animator3.start()
                    }, 75)
                }, 75)
            }, 75)
        }, 75)

        repeat(500) {
            handler1.postDelayed({
                highlightRandomTile(Color.RED)

            }, ((25..1505).random()).toLong())
        }
        handler1.postDelayed({
            player.colorFilter = null

            saveStats()
            player.setOnClickListener {
                issues = 0
                optimizers = 0
                TILE0 = false
                TILE1 = false
                TILE2 = false
                TILE3 = false
                TILE4 = false
                TILE5 = false
                TILE6 = false
                TILE7 = false
                TILE8 = false
                TILE9 = false
                TILE10 = false
                TILE11 = false
                TILE12 = false
                TILE13 = false
                TILE14 = false
                TILE15 = false
                TILE16 = false
                TILE17 = false
                TILE18 = false
                TILE19 = false
                TILE20 = false
                TILE21 = false
                TILE22 = false
                TILE23 = false
                TILE24 = false
                TILE25 = false
                TILE26 = false
                TILE27 = false
                TILE28 = false
                TILE29 = false
                TILE30 = false
                TILE31 = false
                TILE32 = false
                TILE33 = false
                TILE34 = false
                TILE35 = false
                TILE36 = false
                TILE37 = false
                TILE38 = false
                TILE39 = false
                TILE40 = false
                TILE41 = false
                TILE42 = false
                TILE43 = false
                TILE44 = false
                TILE45 = false
                TILE46 = false
                TILE47 = false
                TILE48 = false
                TILE49 = false
                TILE50 = false
                TILE51 = false
                TILE52 = false
                TILE53 = false
                TILE54 = false
                TILE55 = false
                TILE56 = false
                TILE57 = false
                TILE58 = false
                TILE59 = false
                TILE60 = false
                TILE61 = false
                TILE62 = false
                TILE63 = false
                TILE64 = false
                TILE65 = false
                TILE66 = false
                TILE67 = false
                TILE68 = false
                TILE69 = false
                TILE70 = false
                TILE71 = false
                TILE72 = false
                TILE73 = false
                TILE74 = false
                TILE75 = false
                TILE76 = false
                TILE77 = false
                TILE78 = false
                TILE79 = false
                TILE80 = false
                TILE81 = false
                TILE82 = false
                TILE83 = false
                TILE84 = false
                TILE85 = false
                TILE86 = false
                TILE87 = false
                TILE88 = false
                TILE89 = false
                TILE90 = false
                val intent = Intent(this@MainActivity, StartActivity::class.java)
                startActivity(intent)
                finish()
            }

            player.setOnLongClickListener {
                TILE0 = false
                TILE1 = false
                TILE2 = false
                TILE3 = false
                TILE4 = false
                TILE5 = false
                TILE6 = false
                TILE7 = false
                TILE8 = false
                TILE9 = false
                TILE10 = false
                TILE11 = false
                TILE12 = false
                TILE13 = false
                TILE14 = false
                TILE15 = false
                TILE16 = false
                TILE17 = false
                TILE18 = false
                TILE19 = false
                TILE20 = false
                TILE21 = false
                TILE22 = false
                TILE23 = false
                TILE24 = false
                TILE25 = false
                TILE26 = false
                TILE27 = false
                TILE28 = false
                TILE29 = false
                TILE30 = false
                TILE31 = false
                TILE32 = false
                TILE33 = false
                TILE34 = false
                TILE35 = false
                TILE36 = false
                TILE37 = false
                TILE38 = false
                TILE39 = false
                TILE40 = false
                TILE41 = false
                TILE42 = false
                TILE43 = false
                TILE44 = false
                TILE45 = false
                TILE46 = false
                TILE47 = false
                TILE48 = false
                TILE49 = false
                TILE50 = false
                TILE51 = false
                TILE52 = false
                TILE53 = false
                TILE54 = false
                TILE55 = false
                TILE56 = false
                TILE57 = false
                TILE58 = false
                TILE59 = false
                TILE60 = false
                TILE61 = false
                TILE62 = false
                TILE63 = false
                TILE64 = false
                TILE65 = false
                TILE66 = false
                TILE67 = false
                TILE68 = false
                TILE69 = false
                TILE70 = false
                TILE71 = false
                TILE72 = false
                TILE73 = false
                TILE74 = false
                TILE75 = false
                TILE76 = false
                TILE77 = false
                TILE78 = false
                TILE79 = false
                TILE80 = false
                TILE81 = false
                TILE82 = false
                TILE83 = false
                TILE84 = false
                TILE85 = false
                TILE86 = false
                TILE87 = false
                TILE88 = false
                TILE89 = false
                TILE90 = false
                vibrate(10)
                val intent = Intent(this@MainActivity, MainMenuActivity::class.java)
                startActivity(intent)
                finish()
                true
            }
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
                                }, (750).toLong())
                            }, (250).toLong())
                        }, (250).toLong())
                    }, (250).toLong())
                }, (250).toLong())
            }, (250).toLong())
        }, (300).toLong())
    }

    private fun levelWin() {
        vibrate(75)
        player.setOnTouchListener(null)
        val handler = Handler(Looper.getMainLooper())
        repeat(90) {
            handler.postDelayed({
                rainbowAll()
            }, ((95..3505).random()).toLong())
        }
        level++
        issues = 0
//        totalOptimizers += optimizers
        optimizers = 0
        saveStats()
//        loadNextLevel()
//        recreate()
        Toast.makeText(applicationContext, "You Win!", Toast.LENGTH_LONG).show()
        postGameText.visibility = View.VISIBLE
        postGameText.text = "You won!\nTap your character to play again, or tap and hold to go to the main menu."

        handler.postDelayed({
            player.setOnClickListener {
                TILE0 = false
                TILE1 = false
                TILE2 = false
                TILE3 = false
                TILE4 = false
                TILE5 = false
                TILE6 = false
                TILE7 = false
                TILE8 = false
                TILE9 = false
                TILE10 = false
                TILE11 = false
                TILE12 = false
                TILE13 = false
                TILE14 = false
                TILE15 = false
                TILE16 = false
                TILE17 = false
                TILE18 = false
                TILE19 = false
                TILE20 = false
                TILE21 = false
                TILE22 = false
                TILE23 = false
                TILE24 = false
                TILE25 = false
                TILE26 = false
                TILE27 = false
                TILE28 = false
                TILE29 = false
                TILE30 = false
                TILE31 = false
                TILE32 = false
                TILE33 = false
                TILE34 = false
                TILE35 = false
                TILE36 = false
                TILE37 = false
                TILE38 = false
                TILE39 = false
                TILE40 = false
                TILE41 = false
                TILE42 = false
                TILE43 = false
                TILE44 = false
                TILE45 = false
                TILE46 = false
                TILE47 = false
                TILE48 = false
                TILE49 = false
                TILE50 = false
                TILE51 = false
                TILE52 = false
                TILE53 = false
                TILE54 = false
                TILE55 = false
                TILE56 = false
                TILE57 = false
                TILE58 = false
                TILE59 = false
                TILE60 = false
                TILE61 = false
                TILE62 = false
                TILE63 = false
                TILE64 = false
                TILE65 = false
                TILE66 = false
                TILE67 = false
                TILE68 = false
                TILE69 = false
                TILE70 = false
                TILE71 = false
                TILE72 = false
                TILE73 = false
                TILE74 = false
                TILE75 = false
                TILE76 = false
                TILE77 = false
                TILE78 = false
                TILE79 = false
                TILE80 = false
                TILE81 = false
                TILE82 = false
                TILE83 = false
                TILE84 = false
                TILE85 = false
                TILE86 = false
                TILE87 = false
                TILE88 = false
                TILE89 = false
                TILE90 = false
                val intent = Intent(this@MainActivity, StartActivity::class.java)
                startActivity(intent)
                finish()
            }

            player.setOnLongClickListener {
                TILE0 = false
                TILE1 = false
                TILE2 = false
                TILE3 = false
                TILE4 = false
                TILE5 = false
                TILE6 = false
                TILE7 = false
                TILE8 = false
                TILE9 = false
                TILE10 = false
                TILE11 = false
                TILE12 = false
                TILE13 = false
                TILE14 = false
                TILE15 = false
                TILE16 = false
                TILE17 = false
                TILE18 = false
                TILE19 = false
                TILE20 = false
                TILE21 = false
                TILE22 = false
                TILE23 = false
                TILE24 = false
                TILE25 = false
                TILE26 = false
                TILE27 = false
                TILE28 = false
                TILE29 = false
                TILE30 = false
                TILE31 = false
                TILE32 = false
                TILE33 = false
                TILE34 = false
                TILE35 = false
                TILE36 = false
                TILE37 = false
                TILE38 = false
                TILE39 = false
                TILE40 = false
                TILE41 = false
                TILE42 = false
                TILE43 = false
                TILE44 = false
                TILE45 = false
                TILE46 = false
                TILE47 = false
                TILE48 = false
                TILE49 = false
                TILE50 = false
                TILE51 = false
                TILE52 = false
                TILE53 = false
                TILE54 = false
                TILE55 = false
                TILE56 = false
                TILE57 = false
                TILE58 = false
                TILE59 = false
                TILE60 = false
                TILE61 = false
                TILE62 = false
                TILE63 = false
                TILE64 = false
                TILE65 = false
                TILE66 = false
                TILE67 = false
                TILE68 = false
                TILE69 = false
                TILE70 = false
                TILE71 = false
                TILE72 = false
                TILE73 = false
                TILE74 = false
                TILE75 = false
                TILE76 = false
                TILE77 = false
                TILE78 = false
                TILE79 = false
                TILE80 = false
                TILE81 = false
                TILE82 = false
                TILE83 = false
                TILE84 = false
                TILE85 = false
                TILE86 = false
                TILE87 = false
                TILE88 = false
                TILE89 = false
                TILE90 = false
                vibrate(10)
                val intent = Intent(this@MainActivity, MainMenuActivity::class.java)
                startActivity(intent)
                finish()
                true
            }
        }, (500).toLong())
        // wins++
    }

    private fun rainbowAll() {
            val tile = allTiles.random()
            if(tile.tag != "rainbow" && tile.tag != "finish" ) {
                tile.tag = "rainbow"
                tile.alpha = 0.75f
                vibrate(10)
                rainbowEffect(tile)
            } else rainbowAll()

    }

    private fun loadNextLevel() {
        //xx = level
        //load this level

        //or... randomize game board
    }

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

    private fun getBackgroundColor(selectedTile: FrameLayout): Int {
        val background = selectedTile.background
        return if (background is ColorDrawable) background.color
        else {
            println("could not find requested color, returning transparent")
            Color.TRANSPARENT
        }
    }

    private fun checkHitboxes() {
            val glitchColor = getColor(R.color.glitch_block)
            val errorColor = getColor(R.color.error_block)
            val warningColor = getColor(R.color.warning_block)
            val fixColor = getColor(R.color.fix_block)
            val crashColor = getColor(R.color.black)
            val optiColor = getColor(R.color.optimizer_piece)
        allTiles.onEach { frameLayout: FrameLayout ->

            val playerX = player.x
            val playerY = player.y
            val tileX = frameLayout.x
            val tileY = frameLayout.y
            if(playerX <= (tileX + 155f)) {
                if(playerX >= (tileX - 85f)) {
                    println("X collision detected.")
                    println("player's X is $playerX and tile's X is $tileX")
                    if(playerY >= (tileY + 75f)) {
                        if(playerY <= (tileY + 275f)) {
                            println("Y collision detected.")
                            println("player's Y is $playerY and tile's Y is $tileY")

                            if(frameLayout.alpha == 0.55f) {
                                frameLayout.alpha = 0.6f
                                if(mode == 5) {
                                    vibrate((150..1000).random().toLong())
                                    when((1..573).random()) {
                                        in 1..52 -> frameLayout.setBackgroundColor(Color.TRANSPARENT)
                                        in 256..258 -> frameLayout.setBackgroundColor(getColor(R.color.error_block))
                                    }
                                }

                                when {
                                    getBackgroundColor(frameLayout) == warningColor -> {
                                        if(mode == 7) gameOver()
                                        else warningBlockHit()
                                    }
                                    getBackgroundColor(frameLayout) == errorColor -> {
                                        if(mode == 7) gameOver()
                                        else errorBlockHit()
                                    }
                                    getBackgroundColor(frameLayout) == crashColor -> crashBlockHit()
                                    getBackgroundColor(frameLayout) == fixColor -> fixBlockHit(frameLayout)
                                    getBackgroundColor(frameLayout) == glitchColor -> {
                                        if(mode == 7) gameOver()
                                        else glitchBlockHit()
                                    }
                                    getBackgroundColor(frameLayout) == optiColor -> optimizerCollect(frameLayout)
                                }
                            } else if(frameLayout.alpha == 0.75f && frameLayout.tag == "finish") levelWin()
                        } else if(frameLayout.alpha == 0.6f) frameLayout.alpha = 0.55f
                    } else if(frameLayout.alpha == 0.6f) frameLayout.alpha = 0.55f
                } else if(frameLayout.alpha == 0.6f) frameLayout.alpha = 0.55f
            } else if(frameLayout.alpha == 0.6f) frameLayout.alpha = 0.55f
        }
    }

    private fun glitchBlockHit() {
        val handler1 = Handler(Looper.getMainLooper())
        player.setColorFilter(getColor(R.color.glitch_block))
        handler1.postDelayed({
            player.colorFilter = null
        }, (150).toLong())
        if (mode != 4) {
            when ((1..20).random()) {
                in (1..2) -> {
                    issues += (1..3).random()
                    repeat((0..2).random()) {
                        highlightRandomTile(getColor(R.color.glitch_block))
                    }
                }
                in (3..19) -> {
                    issues += (0..3).random()
                    repeat((2..6).random()) {
                        highlightRandomTile(getColor(R.color.glitch_block))
                    }
                }
                20 -> {
                    repeat((2..6).random()) {
                        highlightRandomTile(getColor(R.color.glitch_block))
                    }
                    issues += 9
                }
            }
        } else if (mode == 4) {
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
                        highlightRandomTile(getColor(R.color.glitch_block))
                        optimizers++
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

    private fun readData() {
//        issues = shared.getInt("issues", issues)
        level = shared.getInt("level", level)
//        optimizers = shared.getInt("optimizers", optimizers)
        totalOptimizers = shared.getInt("totalOptimizers", totalOptimizers)
//        raidPTS1 = shared.getInt("raidPTS", raidPTS1)
//        pingVol = shared.getFloat("pingVol", pingVol)
//        musicVol = shared.getFloat("musicVol", musicVol)
//        pingPoints.text = getString(R.string.balance, pings1.toString())
    }

    private fun saveStats() {
        val edit = shared.edit()
//        edit.putInt("issues" , issues )
        edit.putInt("level" , level )
//        edit.putInt("optimizers" , optimizers )
        edit.putInt("totalOptimizers" , totalOptimizers )
//        edit.putInt("raidPTS", raidPTS1 )
//        edit.putFloat("pingVol", pingVol )
//        edit.putFloat("musicVol", musicVol )
        edit.apply()
    }
         private fun vibrate(time: Long) {

        val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        if (vibrator.hasVibrator()) { // Vibrator availability checking
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

                vibrator.vibrate(VibrationEffect.createOneShot(time, VibrationEffect.DEFAULT_AMPLITUDE)) // New vibrate method for API Level 26 or higher
            } else {
                vibrator.vibrate(time) // Vibrate method for below API Level 26
            }
        }
    }

    private fun rainbowEffect(theScreen: FrameLayout) {

        val rainbow0 = "#FF0000"
        val rainbow5 = "#ff1500"
        val rainbow10 = "#ff2a00"
        val rainbow15 = "#ff4000"
        val rainbow20 = "#ff5500"
        val rainbow25 = "#ff6a00"
        val rainbow30 = "#ff8000"
        val rainbow35 = "#ff9500"
        val rainbow40 = "#ffaa00"
        val rainbow45 = "#ffbf00"
        val rainbow50 = "#ffd500"// Fiftey
        val rainbow55 = "#ffea00"
        val rainbow60 = "#ffff00"
        val rainbow65 = "#eaff00"
        val rainbow70 = "#d4ff00"
        val rainbow75 = "#bfff00"
        val rainbow80 = "#aaff00"
        val rainbow85 = "#95ff00"
        val rainbow90 = "#80ff00"
        val rainbow95 = "#6aff00"
        val rainbow100 = "#55ff00"
        val rainbow105 = "#40ff00"
        val rainbow110 = "#2bff00"
        val rainbow115 = "#15ff00"
        val rainbow120 = "#00ff00"
        val rainbow125 = "#00ff15"
        val rainbow130 = "#00ff2a"
        val rainbow135 = "#00ff40"
        val rainbow140 = "#00ff55"
        val rainbow145 = "#00ff6a"
        val rainbow150 = "#00ff80"
        val rainbow155 = "#00ff95"
        val rainbow160 = "#00ffaa"
        val rainbow165 = "#00ffbf"
        val rainbow170 = "#00ffd5"
        val rainbow175 = "#00ffea"
        val rainbow180 = "#00ffff"
        val rainbow185 = "#00eaff"
        val rainbow190 = "#00d4ff"
        val rainbow195 = "#00bfff"
        val rainbow200 = "#00aaff"
        val rainbow205 = "#0095ff"
        val rainbow210 = "#0080ff"
        val rainbow215 = "#006aff"
        val rainbow220 = "#0055ff"
        val rainbow225 = "#0040ff"
        val rainbow230 = "#002aff"
        val rainbow235 = "#0015ff"
        val rainbow240 = "#0000ff"
        val rainbow245 = "#1500ff"
        val rainbow250 = "#2b00ff"//no crying until 2:50
        val rainbow255 = "#4000ff"
        val rainbow260 = "#5500ff"
        val rainbow265 = "#6a00ff"
        val rainbow270 = "#8000ff"
        val rainbow275 = "#9500ff"
        val rainbow280 = "#aa00ff"
        val rainbow285 = "#bf00ff"
        val rainbow290 = "#d400ff"
        val rainbow295 = "#ea00ff"
        val rainbow300 = "#ff00ff"
        val rainbow305 = "#ff00ea"
        val rainbow310 = "#ff00d4"
        val rainbow315 = "#ff00bf"
        val rainbow320 = "#ff00aa"
        val rainbow325 = "#ff0095"
        val rainbow330 = "#ff0080"
        val rainbow335 = "#ff006a"
        val rainbow340 = "#ff0055"
        val rainbow345 = "#ff0040"
        val rainbow350 = "#ff002b"
        val rainbow355 = "#ff0015"

        theScreen.setBackgroundColor(rainbow0.toColorInt())

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            theScreen.setBackgroundColor(rainbow5.toColorInt())
            handler.postDelayed({
                theScreen.setBackgroundColor(rainbow10.toColorInt())
                handler.postDelayed({
                    theScreen.setBackgroundColor(rainbow15.toColorInt())
                    handler.postDelayed({
                        theScreen.setBackgroundColor(rainbow15.toColorInt())
                        handler.postDelayed({
                            theScreen.setBackgroundColor(rainbow20.toColorInt())
                            handler.postDelayed({
                                theScreen.setBackgroundColor(rainbow25.toColorInt())
                                handler.postDelayed({
                                    theScreen.setBackgroundColor(rainbow30.toColorInt())
                                    handler.postDelayed({
                                        theScreen.setBackgroundColor(rainbow35.toColorInt())
                                        handler.postDelayed({
                                            theScreen.setBackgroundColor(rainbow40.toColorInt())
                                            handler.postDelayed({
                                                theScreen.setBackgroundColor(rainbow45.toColorInt())
                                                handler.postDelayed({
                                                    theScreen.setBackgroundColor(rainbow50.toColorInt())
                                                    handler.postDelayed({
                                                        theScreen.setBackgroundColor(rainbow55.toColorInt())
                                                        handler.postDelayed({
                                                            theScreen.setBackgroundColor(rainbow60.toColorInt())
                                                            handler.postDelayed({
                                                                theScreen.setBackgroundColor(rainbow65.toColorInt())
                                                                handler.postDelayed({
                                                                    theScreen.setBackgroundColor(rainbow70.toColorInt())
                                                                    handler.postDelayed({
                                                                        theScreen.setBackgroundColor(rainbow75.toColorInt())
                                                                        handler.postDelayed({
                                                                            theScreen.setBackgroundColor(rainbow80.toColorInt())
                                                                            handler.postDelayed({
                                                                                theScreen.setBackgroundColor(rainbow85.toColorInt())
                                                                                handler.postDelayed({
                                                                                    theScreen.setBackgroundColor(rainbow90.toColorInt())
                                                                                    handler.postDelayed({
                                                                                        theScreen.setBackgroundColor(rainbow95.toColorInt())
                                                                                        handler.postDelayed({
                                                                                            theScreen.setBackgroundColor(rainbow100.toColorInt())
                                                                                            handler.postDelayed({
                                                                                                theScreen.setBackgroundColor(rainbow105.toColorInt())
                                                                                                handler.postDelayed({
                                                                                                    theScreen.setBackgroundColor(rainbow110.toColorInt())
                                                                                                    handler.postDelayed({
                                                                                                        theScreen.setBackgroundColor(rainbow115.toColorInt())
                                                                                                        handler.postDelayed({
                                                                                                            theScreen.setBackgroundColor(rainbow120.toColorInt())
                                                                                                            handler.postDelayed({
                                                                                                                theScreen.setBackgroundColor(rainbow125.toColorInt())
                                                                                                                handler.postDelayed({
                                                                                                                    theScreen.setBackgroundColor(rainbow130.toColorInt())
                                                                                                                    handler.postDelayed({
                                                                                                                        theScreen.setBackgroundColor(rainbow135.toColorInt())
                                                                                                                        handler.postDelayed({
                                                                                                                            theScreen.setBackgroundColor(rainbow140.toColorInt())
                                                                                                                            handler.postDelayed({
                                                                                                                                theScreen.setBackgroundColor(rainbow145.toColorInt())
                                                                                                                                handler.postDelayed({
                                                                                                                                    theScreen.setBackgroundColor(rainbow150.toColorInt())
                                                                                                                                    handler.postDelayed({
                                                                                                                                        theScreen.setBackgroundColor(rainbow155.toColorInt())
                                                                                                                                        handler.postDelayed({
                                                                                                                                            theScreen.setBackgroundColor(rainbow160.toColorInt())
                                                                                                                                            handler.postDelayed({
                                                                                                                                                theScreen.setBackgroundColor(rainbow165.toColorInt())
                                                                                                                                                handler.postDelayed({
                                                                                                                                                    theScreen.setBackgroundColor(rainbow170.toColorInt())
                                                                                                                                                    handler.postDelayed({
                                                                                                                                                        theScreen.setBackgroundColor(rainbow175.toColorInt())
                                                                                                                                                        handler.postDelayed({
                                                                                                                                                            theScreen.setBackgroundColor(rainbow180.toColorInt())
                                                                                                                                                            handler.postDelayed({
                                                                                                                                                                theScreen.setBackgroundColor(rainbow185.toColorInt())
                                                                                                                                                                handler.postDelayed({
                                                                                                                                                                    theScreen.setBackgroundColor(rainbow190.toColorInt())
                                                                                                                                                                    handler.postDelayed({
                                                                                                                                                                        theScreen.setBackgroundColor(rainbow195.toColorInt())
                                                                                                                                                                        handler.postDelayed({
                                                                                                                                                                            theScreen.setBackgroundColor(rainbow200.toColorInt())
                                                                                                                                                                            handler.postDelayed({
                                                                                                                                                                                theScreen.setBackgroundColor(rainbow205.toColorInt())
                                                                                                                                                                                handler.postDelayed({
                                                                                                                                                                                    theScreen.setBackgroundColor(rainbow210.toColorInt())
                                                                                                                                                                                    handler.postDelayed({
                                                                                                                                                                                        theScreen.setBackgroundColor(rainbow215.toColorInt())
                                                                                                                                                                                        handler.postDelayed({
                                                                                                                                                                                            theScreen.setBackgroundColor(rainbow220.toColorInt())
                                                                                                                                                                                            handler.postDelayed({
                                                                                                                                                                                                theScreen.setBackgroundColor(rainbow225.toColorInt())
                                                                                                                                                                                                handler.postDelayed({
                                                                                                                                                                                                    theScreen.setBackgroundColor(rainbow230.toColorInt())
                                                                                                                                                                                                    handler.postDelayed({
                                                                                                                                                                                                        theScreen.setBackgroundColor(rainbow235.toColorInt())
                                                                                                                                                                                                        handler.postDelayed({
                                                                                                                                                                                                            theScreen.setBackgroundColor(rainbow240.toColorInt())
                                                                                                                                                                                                            handler.postDelayed({
                                                                                                                                                                                                                theScreen.setBackgroundColor(rainbow245.toColorInt())
                                                                                                                                                                                                                handler.postDelayed({
                                                                                                                                                                                                                    theScreen.setBackgroundColor(rainbow250.toColorInt())// K its 2:50 U can cry now.
                                                                                                                                                                                                                    handler.postDelayed({
                                                                                                                                                                                                                        theScreen.setBackgroundColor(rainbow255.toColorInt())
                                                                                                                                                                                                                        handler.postDelayed({
                                                                                                                                                                                                                            theScreen.setBackgroundColor(rainbow260.toColorInt())
                                                                                                                                                                                                                            handler.postDelayed({
                                                                                                                                                                                                                                theScreen.setBackgroundColor(rainbow265.toColorInt())
                                                                                                                                                                                                                                handler.postDelayed({
                                                                                                                                                                                                                                    theScreen.setBackgroundColor(rainbow270.toColorInt())
                                                                                                                                                                                                                                    handler.postDelayed({
                                                                                                                                                                                                                                        theScreen.setBackgroundColor(rainbow275.toColorInt())
                                                                                                                                                                                                                                        handler.postDelayed({
                                                                                                                                                                                                                                            theScreen.setBackgroundColor(rainbow280.toColorInt())
                                                                                                                                                                                                                                            handler.postDelayed({
                                                                                                                                                                                                                                                theScreen.setBackgroundColor(rainbow285.toColorInt())
                                                                                                                                                                                                                                                handler.postDelayed({
                                                                                                                                                                                                                                                    theScreen.setBackgroundColor(rainbow290.toColorInt())
                                                                                                                                                                                                                                                    handler.postDelayed({
                                                                                                                                                                                                                                                        theScreen.setBackgroundColor(rainbow295.toColorInt())
                                                                                                                                                                                                                                                        handler.postDelayed({
                                                                                                                                                                                                                                                            theScreen.setBackgroundColor(rainbow300.toColorInt())
                                                                                                                                                                                                                                                            handler.postDelayed({
                                                                                                                                                                                                                                                                theScreen.setBackgroundColor(rainbow305.toColorInt())
                                                                                                                                                                                                                                                                handler.postDelayed({
                                                                                                                                                                                                                                                                    theScreen.setBackgroundColor(rainbow310.toColorInt())
                                                                                                                                                                                                                                                                    handler.postDelayed({
                                                                                                                                                                                                                                                                        theScreen.setBackgroundColor(rainbow315.toColorInt())
                                                                                                                                                                                                                                                                        handler.postDelayed({
                                                                                                                                                                                                                                                                            theScreen.setBackgroundColor(rainbow320.toColorInt())
                                                                                                                                                                                                                                                                            handler.postDelayed({
                                                                                                                                                                                                                                                                                theScreen.setBackgroundColor(rainbow325.toColorInt())
                                                                                                                                                                                                                                                                                handler.postDelayed({
                                                                                                                                                                                                                                                                                    theScreen.setBackgroundColor(rainbow330.toColorInt())
                                                                                                                                                                                                                                                                                    handler.postDelayed({
                                                                                                                                                                                                                                                                                        theScreen.setBackgroundColor(rainbow330.toColorInt())
                                                                                                                                                                                                                                                                                        handler.postDelayed({
                                                                                                                                                                                                                                                                                            theScreen.setBackgroundColor(rainbow335.toColorInt())
                                                                                                                                                                                                                                                                                            handler.postDelayed({
                                                                                                                                                                                                                                                                                                theScreen.setBackgroundColor(rainbow340.toColorInt())
                                                                                                                                                                                                                                                                                                handler.postDelayed({
                                                                                                                                                                                                                                                                                                    theScreen.setBackgroundColor(rainbow345.toColorInt())
                                                                                                                                                                                                                                                                                                    handler.postDelayed({
                                                                                                                                                                                                                                                                                                        theScreen.setBackgroundColor(rainbow350.toColorInt())
                                                                                                                                                                                                                                                                                                        handler.postDelayed({
                                                                                                                                                                                                                                                                                                            theScreen.setBackgroundColor(rainbow355.toColorInt())
                                                                                                                                                                                                                                                                                                            handler.postDelayed({
                                                                                                                                                                                                                                                                                                                rainbowEffect(theScreen)
                                                                                                                                                                                                                                                                                                            }, 35)
                                                                                                                                                                                                                                                                                                        }, 35)
                                                                                                                                                                                                                                                                                                    }, 35)
                                                                                                                                                                                                                                                                                                }, 35)
                                                                                                                                                                                                                                                                                            }, 35)
                                                                                                                                                                                                                                                                                        }, 35)
                                                                                                                                                                                                                                                                                    }, 35)
                                                                                                                                                                                                                                                                                }, 35)
                                                                                                                                                                                                                                                                            }, 35)
                                                                                                                                                                                                                                                                        }, 35)
                                                                                                                                                                                                                                                                    }, 35)
                                                                                                                                                                                                                                                                }, 35)
                                                                                                                                                                                                                                                            }, 35)
                                                                                                                                                                                                                                                        }, 35)
                                                                                                                                                                                                                                                    }, 35)
                                                                                                                                                                                                                                                }, 35)
                                                                                                                                                                                                                                            }, 35)
                                                                                                                                                                                                                                        }, 35)
                                                                                                                                                                                                                                    }, 35)
                                                                                                                                                                                                                                }, 35)
                                                                                                                                                                                                                            }, 35)
                                                                                                                                                                                                                        }, 35)
                                                                                                                                                                                                                    }, 35)
                                                                                                                                                                                                                }, 35)
                                                                                                                                                                                                            }, 35)
                                                                                                                                                                                                        }, 35)
                                                                                                                                                                                                    }, 35)
                                                                                                                                                                                                }, 35)
                                                                                                                                                                                            }, 35)
                                                                                                                                                                                        }, 35)
                                                                                                                                                                                    }, 35)
                                                                                                                                                                                }, 35)
                                                                                                                                                                            }, 35)
                                                                                                                                                                        }, 35)
                                                                                                                                                                    }, 35)
                                                                                                                                                                }, 35)
                                                                                                                                                            }, 35)
                                                                                                                                                        }, 35)
                                                                                                                                                    }, 35)
                                                                                                                                                }, 35)
                                                                                                                                            }, 35)
                                                                                                                                        }, 35)
                                                                                                                                    }, 35)
                                                                                                                                }, 35)
                                                                                                                            }, 35)
                                                                                                                        }, 35)
                                                                                                                    }, 35)
                                                                                                                }, 35)
                                                                                                            }, 35)
                                                                                                        }, 35)
                                                                                                    }, 35)
                                                                                                }, 35)
                                                                                            }, 35)
                                                                                        }, 35)
                                                                                    }, 35)
                                                                                }, 35)
                                                                            }, 35)
                                                                        }, 35)
                                                                    }, 35)
                                                                }, 35)
                                                            }, 35)
                                                        }, 35)
                                                    }, 35)
                                                }, 35)
                                            }, 35)
                                        }, 35)
                                    }, 35)
                                }, 35)
                            }, 35)
                        }, 35)
                    }, 35)
                }, 35)
            }, 35)
        }, 35)
    }

}
// Green: Safe block
// Orange: Warning Block; adds 1 issue to the user's "code"
// Red: Error Block; adds 2 to 3 issues to the user's "code" and creates more unsafe blocks. Chosen orange blocks become red and chosen red blocks become black, and some chosen black blocks can become magenta
// Black: Crash Blocks; hitting one of these is an instant game over.
// Teal: Fix Blocks; fixes 1 issue and small chance of adding another fix block over a green safe block.
// Magenta: Glitch Blocks; Let the spread of the glitch apocalypse begin. ;) (can spread, add issues, or kill)
// Goal: get to the other side without dying, and collect items on the way (items not implemented yet)

/* ~FEATURE IDEAS~
*  Hitting an Error Block makes the phone vibrate and screen shake via 3D rotation
*  Idea: White Blocks: Ad Blocks; gives the user a frikin' ad
*
*
*
* 563 | 4849 -> 746 */