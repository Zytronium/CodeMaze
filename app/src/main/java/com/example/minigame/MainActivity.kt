package com.example.minigame

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.*
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.gridlayout.widget.GridLayout
import kotlin.properties.Delegates


class MainActivity : AppCompatActivity() {
    // ~Stats:~
    private var issues: Int = 0
    private var level: Int = 1
    private var optimizers: Int = 0
    private var totalOptimizers: Int = 0
    private lateinit var shared : SharedPreferences
    // ~Stats ~

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

//        saveStats()
//
//        issues = shared.getInt("issues", issues)
//        level = shared.getInt("level", level)
//        optimizers = shared.getInt("optimizers", optimizers)
//        totalOptimizers = shared.getInt("totalOptimizers", totalOptimizers)

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

        allTiles = arrayOf(tile1, tile2, tile3, tile0, tile4, tile5, tile16, tile7, tile71, tile9, tile10, tile11, tile12, tile13, tile14, tile15, tile17, tile6, tile18, tile19, tile20, tile21, tile22, tile23, tile24, tile25, tile26, tile27, tile28, tile29, tile30, tile31, tile32, tile33, tile34, tile35, tile36, tile37, tile38, tile39, tile40, tile41, tile42, tile43, tile44, tile45, tile46, tile47, tile48, tile49, tile50, tile51, tile52, tile53, tile54, tile55, tile56, tile57, tile58, tile59, tile60, tile61, tile62, tile63, tile64, tile65, tile66, tile67, tile68, tile69, tile70, tile8, tile72, tile73, tile74, tile75, tile76, tile77, tile78, tile79, tile80, tile81, tile82, tile83, tile84, tile85, tile86, tile87, tile88, tile89, tile90)
        allTiles.shuffle()
        path1 = arrayOf(tile84, tile56, tile42, tile38, tile50, tile78, tile23, tile29, tile15, tile46, tile75, tile17, tile55, tile1, tile58, tile25, tile72, tile70, tile39, tile30, tile20, tile34, tile10, tile19, tile32, tile68, tile12, tile87, tile89, tile62, tile47, tile44, tile37, tile85, tile82, tile24, tile7, tile8, tile28, tile21, tile60, tile33, tile3, tile52)
        mainLayout = findViewById<View>(R.id.main) as RelativeLayout
        player.setOnTouchListener(onTouchListener())

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
//        identifyPath().onEach { frameLayout: FrameLayout -> frameLayout.setBackgroundColor(getColor(R.color.white)) }
//    path1.onEach { frameLayout: FrameLayout -> frameLayout.setBackgroundColor(getColor(R.color.white)) }

    }

        private fun generateTiles() {
        generateFixes((6..10).random())
        generateOptimizers(6)
        generateErrors((22..28).random())
        generateCrashes((7..9).random())
    }

    private fun generateFixes(repeatNum: Int) {
        repeat(repeatNum) {
            generateFix()
        }
    }

    private fun generateFix() {
        val tile = selectRandomTile()
        if (getBackgroundColor(tile) == getColor(R.color.safe_block)) {
            tile.setBackgroundColor(getColor(R.color.fix_block))
        } else {
            generateFix()
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
            generateError()
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
            generateCrash()
        }
    }

    private fun identifyPath(): Array<FrameLayout> {

        var safeTiles: Array<FrameLayout> = arrayOf()
        allTiles.onEach { frameLayout: FrameLayout ->
            if(getBackgroundColor(frameLayout) == getColor(R.color.safe_block)) {
//                safeTiles = append(safeTiles, frameLayout)
                safeTiles += frameLayout
            }
        }
        return safeTiles
    }

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
//    private fun testAction() {
//        player.listener
//    }

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
        optiText.text = getString(R.string.optimizers, optimizers.toString())
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
            generateOptimizer()
        }
    }

    private fun optimizerCollect(tile: FrameLayout) {
        tile.setBackgroundColor(getColor(R.color.safe_block))
        optimizers++
        allTiles.shuffle()
        when((1..5).random()) {
            1 -> {
                if(issues != 0) issues -= 1
                generateFixBlock()
            }
        }
        updateStats()
//        saveStats()
        //if(optimizers <= x) {below code}
        generateOptimizer()
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

            }, ((25..1505).random()).toLong()) }
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
                                        handler1.postDelayed({
                                            player.setColorFilter(getColor(R.color.error_block))
                                            handler1.postDelayed({
                                                player.colorFilter = null
                                                handler1.postDelayed({
                                                    //game over stuff here
                                                    issues = 0
                                                    optimizers = 0
                                                    saveStats()
                                                    recreate()
                                                }, (50).toLong())
                                            }, (750).toLong())
                                        }, (250).toLong())
                                    }, (250).toLong())
                                }, (250).toLong())
                            }, (250).toLong())
                        }, (250).toLong())
                    }, (300).toLong())
        //reset game board | randomization: x warning tiles; x error tiles; 5 crash tiles. hardcode safe path tiles and fix tiles presets if needed or randomize if time is available.
        }

    private fun levelWin() {
        level++
        issues = 0
        totalOptimizers += optimizers
        optimizers = 0
        saveStats()
        loadNextLevel()
        recreate()
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
            if(frameLayout.tag == null) {
                frameLayout.tag = "no"
            }
//            var activated = false
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
                            if(frameLayout.tag == "no") {
                                frameLayout.tag = "yes"
                                when {
                                    getBackgroundColor(frameLayout) == warningColor -> warningBlockHit()
                                    getBackgroundColor(frameLayout) == errorColor -> errorBlockHit()
                                    getBackgroundColor(frameLayout) == crashColor -> crashBlockHit()
                                    getBackgroundColor(frameLayout) == fixColor -> fixBlockHit(frameLayout)
                                    getBackgroundColor(frameLayout) == glitchColor -> glitchBlockHit()
                                    getBackgroundColor(frameLayout) == optiColor -> optimizerCollect(frameLayout)
                                }
                                if(frameLayout.tag == "finish")  levelWin()
                            }
                        } else frameLayout.tag = "no"
                    } else frameLayout.tag = "no"
                } else frameLayout.tag = "no"
            } else frameLayout.tag = "no"
        }
    }

    private fun glitchBlockHit() {
        val handler1 = Handler(Looper.getMainLooper())

        player.setColorFilter(getColor(R.color.glitch_block))
        handler1.postDelayed({
            player.colorFilter = null
        }, (150).toLong())
        when((1..16).random()) {
            in (1..2) -> issues += (1..3).random()
            in (3..15) -> {
                issues += (0..3).random()
                repeat((2..6).random()) {
                    highlightRandomTile(getColor(R.color.glitch_block))
                }
            }
            16 -> {
                repeat((2..6).random()) {
                highlightRandomTile(getColor(R.color.glitch_block))
            }
                gameOver()
            }
        }
        checkIssues()
        updateStats()
    }

    private fun readData() {
        issues = shared.getInt("issues", issues)
        level = shared.getInt("level", level)
        optimizers = shared.getInt("optimizers", optimizers)
        totalOptimizers = shared.getInt("totalOptimizers", totalOptimizers)
//        raidPTS1 = shared.getInt("raidPTS", raidPTS1)
//        pingVol = shared.getFloat("pingVol", pingVol)
//        musicVol = shared.getFloat("musicVol", musicVol)
//        pingPoints.text = getString(R.string.balance, pings1.toString())
    }

    private fun saveStats() {
        val edit = shared.edit()
        edit.putInt("issues" , issues )
        edit.putInt("level" , level )
        edit.putInt("optimizers" , optimizers )
        edit.putInt("totalOptimizers" , totalOptimizers )
//        edit.putInt("raidPTS", raidPTS1 )
//        edit.putFloat("pingVol", pingVol )
//        edit.putFloat("musicVol", musicVol )
        edit.apply()
    }

}
// Green: Safe block
// Orange: Warning Block; adds 1 issue to the user's "code"
// Red: Error Block; adds 2 to 3 issues to the user's "code" and creates more unsafe blocks. Chosen orange blocks become red and chosen red blocks become black, and some chosen black blocks can become magenta
// Black: Crash Blocks; hitting one of these is an instant game over.
// Teal: Fix Blocks; fixes 1 issue and small chance of adding another fix block over a green safe block.
// Magenta: Glitch Blocks; Let the spread of the glitch apocalypse begin. ;) (can spread, add issues, or kill)
// goal: get to the other side without dying, and collect items on the way (items not implemented yet)

/* ~FEATURE IDEAS~
*  Hitting an Error Block makes the phone vibrate and screen shake via 3D rotation
*  Idea: White Blocks: Ad Blocks; gives the user a frikin' ad
*
*
*
* 563 | 4849 > 746 */
