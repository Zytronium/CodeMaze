package com.example.minigame

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.toColorInt
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : AppCompatActivity() {
    // ~Stats:~
    private var issues = 0
    // ~Stats ~

    var activated0 = false
    var activated1 = false
    var activated2 = false
    var activated3 = false
    var activated4 = false
    var activated5 = false
    var activated6 = false
    var activated7 = false
    var activated8 = false
    var activated9 = false
    var activated10 = false
    var activated11 = false
    var activated12 = false
    var activated13 = false
    var activated14 = false
    var activated15 = false
    var activated16 = false
    var activated17 = false
    var activated18 = false
    var activated19 = false
    var activated20 = false
    var activated21 = false
    var activated22 = false
    var activated23 = false
    var activated24 = false
    var activated25 = false
    var activated26 = false
    var activated27 = false
    var activated28 = false
    var activated29 = false
    var activated30 = false
    var activated31 = false
    var activated32 = false
    var activated33 = false
    var activated34 = false
    var activated35 = false
    var activated36 = false
    var activated37 = false
    var activated38 = false
    var activated39 = false
    var activated40 = false
    var activated41 = false
    var activated42 = false
    var activated43 = false
    var activated44 = false
    var activated45 = false
    var activated46 = false
    var activated47 = false
    var activated48 = false
    var activated49 = false
    var activated50 = false
    var activated51 = false
    var activated52 = false
    var activated53 = false
    var activated54 = false
    var activated55 = false
    var activated56 = false
    var activated57 = false
    var activated58 = false
    var activated59 = false
    var activated60 = false
    var activated61 = false
    var activated62 = false
    var activated63 = false
    var activated64 = false
    var activated65 = false
    var activated66 = false
    var activated67 = false
    var activated68 = false
    var activated69 = false
    var activated70 = false
    var activated71 = false
    var activated72 = false
    var activated73 = false
    var activated74 = false
    var activated75 = false
    var activated76 = false
    var activated77 = false
    var activated78 = false
    var activated79 = false
    var activated80 = false
    var activated81 = false
    var activated82 = false
    var activated83 = false
    var activated84 = false
    var activated85 = false
    var activated86 = false
    var activated87 = false
    var activated88 = false
    var activated89 = false
    var activated90 = false
    lateinit var issuesText: TextView
    lateinit var player: ImageView
    lateinit var tile1: FrameLayout
    lateinit var tile0: FrameLayout
    lateinit var tile2: FrameLayout
    lateinit var tile3: FrameLayout
    lateinit var tile4: FrameLayout
    lateinit var tile5: FrameLayout
    lateinit var tile6: FrameLayout
    lateinit var tile7: FrameLayout
    lateinit var tile8: FrameLayout
    lateinit var tile9: FrameLayout
    lateinit var tile10: FrameLayout
    lateinit var tile11: FrameLayout
    lateinit var tile12: FrameLayout
    lateinit var tile13: FrameLayout
    lateinit var tile14: FrameLayout
    lateinit var tile15: FrameLayout
    lateinit var tile16: FrameLayout
    lateinit var tile17: FrameLayout
    lateinit var tile18: FrameLayout
    lateinit var tile19: FrameLayout
    lateinit var tile20: FrameLayout
    lateinit var tile21: FrameLayout
    lateinit var tile22: FrameLayout
    lateinit var tile23: FrameLayout
    lateinit var tile24: FrameLayout
    lateinit var tile25: FrameLayout
    lateinit var tile26: FrameLayout
    lateinit var tile27: FrameLayout
    lateinit var tile28: FrameLayout
    lateinit var tile29: FrameLayout
    lateinit var tile30: FrameLayout
    lateinit var tile31: FrameLayout
    lateinit var tile32: FrameLayout
    lateinit var tile33: FrameLayout
    lateinit var tile34: FrameLayout
    lateinit var tile35: FrameLayout
    lateinit var tile36: FrameLayout
    lateinit var tile37: FrameLayout
    lateinit var tile38: FrameLayout
    lateinit var tile39: FrameLayout
    lateinit var tile40: FrameLayout
    lateinit var tile41: FrameLayout
    lateinit var tile42: FrameLayout
    lateinit var tile43: FrameLayout
    lateinit var tile44: FrameLayout
    lateinit var tile45: FrameLayout
    lateinit var tile46: FrameLayout
    lateinit var tile47: FrameLayout
    lateinit var tile48: FrameLayout
    lateinit var tile49: FrameLayout
    lateinit var tile50: FrameLayout
    lateinit var tile51: FrameLayout
    lateinit var tile52: FrameLayout
    lateinit var tile53: FrameLayout
    lateinit var tile54: FrameLayout
    lateinit var tile55: FrameLayout
    lateinit var tile56: FrameLayout
    lateinit var tile57: FrameLayout
    lateinit var tile58: FrameLayout
    lateinit var tile59: FrameLayout
    lateinit var tile60: FrameLayout
    lateinit var tile61: FrameLayout
    lateinit var tile62: FrameLayout
    lateinit var tile63: FrameLayout
    lateinit var tile64: FrameLayout
    lateinit var tile65: FrameLayout
    lateinit var tile66: FrameLayout
    lateinit var tile67: FrameLayout
    lateinit var tile68: FrameLayout
    lateinit var tile69: FrameLayout
    lateinit var tile70: FrameLayout
    lateinit var tile71: FrameLayout
    lateinit var tile72: FrameLayout
    lateinit var tile73: FrameLayout
    lateinit var tile74: FrameLayout
    lateinit var tile75: FrameLayout
    lateinit var tile76: FrameLayout
    lateinit var tile77: FrameLayout
    lateinit var tile78: FrameLayout
    lateinit var tile79: FrameLayout
    lateinit var tile80: FrameLayout
    lateinit var tile81: FrameLayout
    lateinit var tile82: FrameLayout
    lateinit var tile83: FrameLayout
    lateinit var tile84: FrameLayout
    lateinit var tile85: FrameLayout
    lateinit var tile86: FrameLayout
    lateinit var tile87: FrameLayout
    lateinit var tile88: FrameLayout
    lateinit var tile89: FrameLayout
    lateinit var tile90: FrameLayout

    lateinit var allTiles: Array<FrameLayout>

    private var mainLayout: ViewGroup? = null
    private var image: ImageView? = null
    private var xDelta = 0
    private var yDelta = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        issuesText = findViewById(R.id.textView2)
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

        allTiles = arrayOf(tile1, tile0, tile2, tile3, tile4, tile5, tile6, tile7, tile71, tile9, tile10, tile11, tile12, tile13, tile14, tile15, tile16, tile17, tile18, tile19, tile20, tile21, tile22, tile23, tile24, tile25, tile26, tile27, tile28, tile29, tile30, tile31, tile32, tile33, tile34, tile35, tile36, tile37, tile38, tile39, tile40, tile41, tile42, tile43, tile44, tile45, tile46, tile47, tile48, tile49, tile50, tile51, tile52, tile53, tile54, tile55, tile56, tile57, tile58, tile59, tile60, tile61, tile62, tile63, tile64, tile65, tile66, tile67, tile68, tile69, tile70, tile8, tile72, tile73, tile74, tile75, tile76, tile77, tile78, tile79, tile80, tile81, tile82, tile83, tile84, tile85, tile86, tile87, tile88, tile89, tile90)

        mainLayout = findViewById<View>(R.id.main) as RelativeLayout
        image = findViewById<View>(R.id.player) as ImageView
        image!!.setOnTouchListener(onTouchListener())
        val windowInsetsController =

            ViewCompat.getWindowInsetsController(window.decorView) ?: return
        windowInsetsController.systemBarsBehavior =
            WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        windowInsetsController.hide(WindowInsetsCompat.Type.systemBars())
        checkIssues()
    }

    private fun selectRandomTile(): FrameLayout {
        val randTile = allTiles.random()
        return randTile
    }

    private fun highlightRandomTile() {
        val randTile = allTiles.random()
        val randTile2 = allTiles.random()
        val randTile3 = allTiles.random()
        val randTile4 = allTiles.random()
        val randTile5 = allTiles.random()
        val randTile6 = allTiles.random()
        val randTile7 = allTiles.random()
        val randomRando = arrayOf(randTile, randTile2, randTile3, randTile4, randTile5, randTile6, randTile7)
        val ranRand = randomRando.random()
        when ((1..8).random()) {
            2 -> {
                 randTile.setBackgroundColor(getColor(R.color.glitch_block))
            }
            1 -> {
                randTile2.setBackgroundColor(getColor(R.color.glitch_block))
            }
            3 -> {
                randTile3.setBackgroundColor(getColor(R.color.glitch_block))
            }
            4 -> {
                randTile4.setBackgroundColor(getColor(R.color.glitch_block))
            }
            5 -> {
                randTile7.setBackgroundColor(getColor(R.color.glitch_block))
            }
            6 -> {
                randTile6.setBackgroundColor(getColor(R.color.glitch_block))
            }
            7 -> {
                randTile5.setBackgroundColor(getColor(R.color.glitch_block))
            }
            8 -> {
                  ranRand.setBackgroundColor(getColor(R.color.glitch_block))
            }
        }
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
            gameOver()
        }
        val handler1 = Handler(Looper.getMainLooper())
        handler1.postDelayed({
            checkIssues()
            issuesText.text = getString(R.string.issues, issues.toString())
        }, (150).toLong())
    }

    fun fixBlockHit() {
        if (issues != 0) {
            issues -= 1
        }
        //make this fix block a safe block
        //25% chance that another fix block appears
    }

    fun warningBlockHit() {
        issues += 1

        val handler1 = Handler(Looper.getMainLooper())

        player.setColorFilter(getColor(R.color.warning_block))
        handler1.postDelayed({
            player.setColorFilter(getColor(R.color.white))
        }, (150).toLong())
    }

    fun errorBlockHit() {
        val selectedTile1 = selectRandomTile()
        val selectedTile2 = selectRandomTile()
        val selectedTile3 = selectRandomTile()
        val selectedTile4 = selectRandomTile()
        val handler1 = Handler(Looper.getMainLooper())

        issues += (2..3).random()
        player.setColorFilter(getColor(R.color.error_block))
        handler1.postDelayed({
            player.setColorFilter(getColor(R.color.white))
        }, (200).toLong())

        var color: Int = Color.TRANSPARENT

        val background = selectedTile1.background
        if (background is ColorDrawable) color = background.color
        if (color == getColor(R.color.warning_block)) {
            selectedTile1.setBackgroundColor(getColor(R.color.error_block))
        } else if(color == getColor(R.color.error_block)) {
            selectedTile1.setBackgroundColor(getColor(R.color.black))
        } else println("WIP code")//*******
        if(getBackgroundColor(selectedTile1) == getColor(R.color.warning_block)) selectedTile1.setBackgroundColor(getColor(R.color.error_block))
        else if(getBackgroundColor(selectedTile1) == getColor(R.color.error_block)) selectedTile1.setBackgroundColor(getColor(R.color.black))
        else if(getBackgroundColor(selectedTile1) == getColor(R.color.black)) {
            when((1..3).random()) {
                in (2..3) -> selectedTile1.setBackgroundColor(getColor(R.color.glitch_block))
            }
        } else println("WIP code")//*******
        val background2 = selectedTile2.background
        if (background2 is ColorDrawable) color = background2.color
        if (color == getColor(R.color.warning_block)) {
            selectedTile2.setBackgroundColor(getColor(R.color.error_block))
        } else if(color == getColor(R.color.error_block)) {
            selectedTile2.setBackgroundColor(getColor(R.color.black))
        } else println("WIP code")//******** *

        val background3 = selectedTile3.background
        if (background3 is ColorDrawable) color = background3.color
        if (color == getColor(R.color.warning_block)) {
            selectedTile3.setBackgroundColor(getColor(R.color.error_block))
        } else if(color == getColor(R.color.error_block)) {
            selectedTile3.setBackgroundColor(getColor(R.color.black))
        } else println("WIP code")//******** *

        val background4 = selectedTile4.background
        if (background4 is ColorDrawable) color = background4.color
        if (color == getColor(R.color.warning_block)) {
            selectedTile4.setBackgroundColor(getColor(R.color.error_block))
        } else if(color == getColor(R.color.error_block)) {
            selectedTile4.setBackgroundColor(getColor(R.color.black))
        } else println("WIP code")//*******

        //increase amount of red and black blocks. some random blocks will be chosen randomly, chosen orange blocks become red and chosen red blocks become black
    }

    fun crashBlockHit() {
        gameOver()
    }

    fun gameOver() {
        player.setColorFilter(getColor(R.color.error_block))

        val handler1 = Handler(Looper.getMainLooper())
        handler1.postDelayed({
            player.setColorFilter(getColor(R.color.white))
        }, (750).toLong())
        issues = 0
        TODO("to be impelemted laterGater, so will crashmfor nowhqiut hugiqwhAAAAAAAAAAAAAAAA")
        //reset game board | randomization: x warning tiles; x error tiles; 5 crash tiles. hardcode safe path tiles and fix tiles if needed or randomize if time is available.
        //reset character placement
        // shake screen and vibrate device
        }

    private fun checkHitboxes() {
        collideDetect0()
        collideDetect1()
        collideDetect2()
        collideDetect3()
        collideDetect4()
        collideDetect5()
        collideDetect6()
        collideDetect7()
        collideDetect8()
        collideDetect9()
        collideDetect10()
        collideDetect11()
        collideDetect12()
        collideDetect13()
        collideDetect14()
        collideDetect15()
        collideDetect16()
        collideDetect17()
        collideDetect18()
        collideDetect19()
        collideDetect20()
        collideDetect21()
        collideDetect22()
        collideDetect23()
        collideDetect24()
        collideDetect25()
        collideDetect26()
        collideDetect27()
        collideDetect28()
        collideDetect29()
        collideDetect30()
        collideDetect31()
        collideDetect32()
        collideDetect33()
        collideDetect34()
        collideDetect35()
        collideDetect36()
        collideDetect37()
        collideDetect38()
        collideDetect39()
        collideDetect40()
        collideDetect41()
        collideDetect42()
        collideDetect43()
        collideDetect44()
        collideDetect45()
        collideDetect46()
        collideDetect47()
        collideDetect48()
        collideDetect49()
        collideDetect50()
        collideDetect51()
        collideDetect52()
        collideDetect53()
        collideDetect54()
        collideDetect55()
        collideDetect56()
        collideDetect57()
        collideDetect58()
        collideDetect59()
        collideDetect60()
        collideDetect61()
        collideDetect62()
        collideDetect63()
        collideDetect64()
        collideDetect65()
        collideDetect66()
        collideDetect67()
        collideDetect68()
        collideDetect69()
        collideDetect70()
        collideDetect71()
        collideDetect72()
        collideDetect73()
        collideDetect74()
        collideDetect75()
        collideDetect76()
        collideDetect77()
        collideDetect78()
        collideDetect79()
        collideDetect80()
        collideDetect81()
        collideDetect82()
        collideDetect83()
        collideDetect84()
        collideDetect85()
        collideDetect86()
        collideDetect87()
        collideDetect88()
        collideDetect89()
        collideDetect90()
    }

    private fun getBackgroundColor(selectedTile: FrameLayout): Int {
        val background = selectedTile.background
        return if (background is ColorDrawable) background.color
        else {
            println("could not find requested color, returning transparent")
            Color.TRANSPARENT
        }
    }

    private fun collideDetect0() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile0

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated0) {
                            activated0 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated0 = false
                }
                else  activated0 = false
            }
            else activated0 = false
        }
        else activated0 = false
    }

    private fun collideDetect1() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile1

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated1) {
                            activated1 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated1 = false
                }
                else  activated1 = false
            }
            else activated1 = false
        }
        else activated1 = false
    }

    private fun collideDetect2() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile2

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated2) {
                            activated2 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated2 = false
                }
                else  activated2 = false
            }
            else activated2 = false
        }
        else activated2 = false
    }

    private fun collideDetect3() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile3

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated3) {
                            activated3 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated3 = false
                }
                else  activated3 = false
            }
            else activated3 = false
        }
        else activated3 = false
    }

    private fun collideDetect4() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile4

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated4) {
                            activated4 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated4 = false
                }
                else  activated4 = false
            }
            else activated4 = false
        }
        else activated4 = false
    }

    private fun collideDetect5() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile5

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated5) {
                            activated5 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated5 = false
                }
                else  activated5 = false
            }
            else activated5 = false
        }
        else activated5 = false
    }

    private fun collideDetect6() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile6

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated6) {
                            activated6 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated6 = false
                }
                else  activated6 = false
            }
            else activated6 = false
        }
        else activated6 = false
    }

    private fun collideDetect7() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile7

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated7) {
                            activated7 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated7 = false
                }
                else  activated7 = false
            }
            else activated7 = false
        }
        else activated7 = false
    }

    private fun collideDetect8() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile8

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated8) {
                            activated8 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated8 = false
                }
                else  activated8 = false
            }
            else activated8 = false
        }
        else activated8 = false
    }

    private fun collideDetect9() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile9

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated9) {
                            activated9 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated9 = false
                }
                else  activated9 = false
            }
            else activated9 = false
        }
        else activated9 = false
    }

    private fun collideDetect10() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile10

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated10) {
                            activated10 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated10 = false
                }
                else  activated10 = false
            }
            else activated10 = false
        }
        else activated10 = false
    }

    private fun collideDetect11() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile11

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated11) {
                            activated11 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated11 = false
                }
                else  activated11 = false
            }
            else activated11 = false
        }
        else activated11 = false
    }

    private fun collideDetect12() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile12

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated12) {
                            activated12 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated12 = false
                }
                else  activated12 = false
            }
            else activated12 = false
        }
        else activated12 = false
    }

    private fun collideDetect13() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile13

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated13) {
                            activated13 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated13 = false
                }
                else  activated13 = false
            }
            else activated13 = false
        }
        else activated13 = false
    }

    private fun collideDetect14() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile14

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated14) {
                            activated14 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated14 = false
                }
                else  activated14 = false
            }
            else activated14 = false
        }
        else activated14 = false
    }

    private fun collideDetect15() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile15

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated15) {
                            activated15 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated15 = false
                }
                else  activated15 = false
            }
            else activated15 = false
        }
        else activated15 = false
    }

    private fun collideDetect16() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile16

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated16) {
                            activated16 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated16 = false
                }
                else  activated16 = false
            }
            else activated16 = false
        }
        else activated16 = false
    }

    private fun collideDetect17() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile17

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated17) {
                            activated17 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated17 = false
                }
                else  activated17 = false
            }
            else activated17 = false
        }
        else activated17 = false
    }

    private fun collideDetect18() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile18

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated18) {
                            activated18 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated18 = false
                }
                else  activated18 = false
            }
            else activated18 = false
        }
        else activated18 = false
    }

    private fun collideDetect19() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile19

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated19) {
                            activated19 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated19 = false
                }
                else  activated19 = false
            }
            else activated19 = false
        }
        else activated19 = false
    }

    private fun collideDetect20() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile20

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated20) {
                            activated20 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated20 = false
                }
                else  activated20 = false
            }
            else activated20 = false
        }
        else activated20 = false
    }

    private fun collideDetect21() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile21

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated21) {
                            activated21 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated21 = false
                }
                else  activated21 = false
            }
            else activated21 = false
        }
        else activated21 = false
    }

    private fun collideDetect22() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile22

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated22) {
                            activated22 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated22 = false
                }
                else  activated22 = false
            }
            else activated22 = false
        }
        else activated22 = false
    }

    private fun collideDetect23() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile23

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated23) {
                            activated23 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated23 = false
                }
                else  activated23 = false
            }
            else activated23 = false
        }
        else activated23 = false
    }

    private fun collideDetect24() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile24

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated24) {
                            activated24 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated24 = false
                }
                else  activated24 = false
            }
            else activated24 = false
        }
        else activated24 = false
    }

    private fun collideDetect25() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile25

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated25) {
                            activated25 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated25 = false
                }
                else  activated25 = false
            }
            else activated25 = false
        }
        else activated25 = false
    }

    private fun collideDetect26() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile26

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated26) {
                            activated26 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated26 = false
                }
                else  activated26 = false
            }
            else activated26 = false
        }
        else activated26 = false
    }

    private fun collideDetect27() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile27

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated27) {
                            activated27 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated27 = false
                }
                else  activated27 = false
            }
            else activated27 = false
        }
        else activated27 = false
    }

    private fun collideDetect28() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile28

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated28) {
                            activated28 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated28 = false
                }
                else  activated28 = false
            }
            else activated28 = false
        }
        else activated28 = false
    }

    private fun collideDetect29() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile29

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated29) {
                            activated29 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated29 = false
                }
                else  activated29 = false
            }
            else activated29 = false
        }
        else activated29 = false
    }

    private fun collideDetect30() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile30

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated30) {
                            activated30 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated30 = false
                }
                else  activated30 = false
            }
            else activated30 = false
        }
        else activated30 = false
    }

    private fun collideDetect31() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile31

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated31) {
                            activated31 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated31 = false
                }
                else  activated31 = false
            }
            else activated31 = false
        }
        else activated31 = false
    }

    private fun collideDetect32() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile32

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated32) {
                            activated32 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated32 = false
                }
                else  activated32 = false
            }
            else activated32 = false
        }
        else activated32 = false
    }

    private fun collideDetect33() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile33

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated33) {
                            activated33 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated33 = false
                }
                else  activated33 = false
            }
            else activated33 = false
        }
        else activated33 = false
    }

    private fun collideDetect34() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile34

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated34) {
                            activated34 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated34 = false
                }
                else  activated34 = false
            }
            else activated34 = false
        }
        else activated34 = false
    }

    private fun collideDetect35() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile35

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated35) {
                            activated35 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated35 = false
                }
                else  activated35 = false
            }
            else activated35 = false
        }
        else activated35 = false
    }

    private fun collideDetect36() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile36

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated36) {
                            activated36 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated36 = false
                }
                else  activated36 = false
            }
            else activated36 = false
        }
        else activated36 = false
    }

    private fun collideDetect37() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile37

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated37) {
                            activated37 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated37 = false
                }
                else  activated37 = false
            }
            else activated37 = false
        }
        else activated37 = false
    }

    private fun collideDetect38() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile38

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated38) {
                            activated38 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated38 = false
                }
                else  activated38 = false
            }
            else activated38 = false
        }
        else activated38 = false
    }

    private fun collideDetect39() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile39

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated39) {
                            activated39 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated39 = false
                }
                else  activated39 = false
            }
            else activated39 = false
        }
        else activated39 = false
    }

    private fun collideDetect40() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile40

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated40) {
                            activated40 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated40 = false
                }
                else  activated40 = false
            }
            else activated40 = false
        }
        else activated40 = false
    }

    private fun collideDetect41() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile41

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated41) {
                            activated41 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated41 = false
                }
                else  activated41 = false
            }
            else activated41 = false
        }
        else activated41 = false
    }

    private fun collideDetect42() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile42

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated42) {
                            activated42 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated42 = false
                }
                else  activated42 = false
            }
            else activated42 = false
        }
        else activated42 = false
    }

    private fun collideDetect43() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile43

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated43) {
                            activated43 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated43 = false
                }
                else  activated43 = false
            }
            else activated43 = false
        }
        else activated43 = false
    }

    private fun collideDetect44() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile44

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated44) {
                            activated44 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated44 = false
                }
                else  activated44 = false
            }
            else activated44 = false
        }
        else activated44 = false
    }

    private fun collideDetect45() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile45

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated45) {
                            activated45 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated45 = false
                }
                else  activated45 = false
            }
            else activated45 = false
        }
        else activated45 = false
    }

    private fun collideDetect46() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile46

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated46) {
                            activated46 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated46 = false
                }
                else  activated46 = false
            }
            else activated46 = false
        }
        else activated46 = false
    }

    private fun collideDetect47() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile47

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated47) {
                            activated47 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated47 = false
                }
                else  activated47 = false
            }
            else activated47 = false
        }
        else activated47 = false
    }

    private fun collideDetect48() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile48

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated48) {
                            activated48 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated48 = false
                }
                else  activated48 = false
            }
            else activated48 = false
        }
        else activated48 = false
    }

    private fun collideDetect49() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile49

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated49) {
                            activated49 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated49 = false
                }
                else  activated49 = false
            }
            else activated49 = false
        }
        else activated49 = false
    }

    private fun collideDetect50() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile50

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated50) {
                            activated50 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated50 = false
                }
                else  activated50 = false
            }
            else activated50 = false
        }
        else activated50 = false
    }

    private fun collideDetect51() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile51

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated51) {
                            activated51 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated51 = false
                }
                else  activated51 = false
            }
            else activated51 = false
        }
        else activated51 = false
    }

    private fun collideDetect52() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile52

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated52) {
                            activated52 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated52 = false
                }
                else  activated52 = false
            }
            else activated52 = false
        }
        else activated52 = false
    }

    private fun collideDetect53() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile53

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated53) {
                            activated53 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated53 = false
                }
                else  activated53 = false
            }
            else activated53 = false
        }
        else activated53 = false
    }

    private fun collideDetect54() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile54

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated54) {
                            activated54 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated54 = false
                }
                else  activated54 = false
            }
            else activated54 = false
        }
        else activated54 = false
    }

    private fun collideDetect55() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile55

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated55) {
                            activated55 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated55 = false
                }
                else  activated55 = false
            }
            else activated55 = false
        }
        else activated55 = false
    }

    private fun collideDetect56() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile56

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated56) {
                            activated56 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated56 = false
                }
                else  activated56 = false
            }
            else activated56 = false
        }
        else activated56 = false
    }

    private fun collideDetect57() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile57

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated57) {
                            activated57 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated57 = false
                }
                else  activated57 = false
            }
            else activated57 = false
        }
        else activated57 = false
    }

    private fun collideDetect58() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile58

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated58) {
                            activated58 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated58 = false
                }
                else  activated58 = false
            }
            else activated58 = false
        }
        else activated58 = false
    }

    private fun collideDetect59() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile59

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated59) {
                            activated59 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated59 = false
                }
                else  activated59 = false
            }
            else activated59 = false
        }
        else activated59 = false
    }

    private fun collideDetect60() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile60

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated60) {
                            activated60 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated60 = false
                }
                else  activated60 = false
            }
            else activated60 = false
        }
        else activated60 = false
    }

    private fun collideDetect61() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile61

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated61) {
                            activated61 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated61 = false
                }
                else  activated61 = false
            }
            else activated61 = false
        }
        else activated61 = false
    }

    private fun collideDetect62() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile62

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated62) {
                            activated62 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated62 = false
                }
                else  activated62 = false
            }
            else activated62 = false
        }
        else activated62 = false
    }

    private fun collideDetect63() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile63

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated63) {
                            activated63 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated63 = false
                }
                else  activated63 = false
            }
            else activated63 = false
        }
        else activated63 = false
    }

    private fun collideDetect64() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile64

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated64) {
                            activated64 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated64 = false
                }
                else  activated64 = false
            }
            else activated64 = false
        }
        else activated64 = false
    }

    private fun collideDetect65() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile65

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated65) {
                            activated65 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated65 = false
                }
                else  activated65 = false
            }
            else activated65 = false
        }
        else activated65 = false
    }

    private fun collideDetect66() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile66

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated66) {
                            activated66 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated66 = false
                }
                else  activated66 = false
            }
            else activated66 = false
        }
        else activated66 = false
    }

    private fun collideDetect67() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile67

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated67) {
                            activated67 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated67 = false
                }
                else  activated67 = false
            }
            else activated67 = false
        }
        else activated67 = false
    }

    private fun collideDetect68() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile68

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated68) {
                            activated68 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated68 = false
                }
                else  activated68 = false
            }
            else activated68 = false
        }
        else activated68 = false
    }

    private fun collideDetect69() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile69

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated69) {
                            activated69 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated69 = false
                }
                else  activated69 = false
            }
            else activated69 = false
        }
        else activated69 = false
    }

    private fun collideDetect70() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile70

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated70) {
                            activated70 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated70 = false
                }
                else  activated70 = false
            }
            else activated70 = false
        }
        else activated70 = false
    }

    private fun collideDetect71() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile71

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated71) {
                            activated71 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated71 = false
                }
                else  activated71 = false
            }
            else activated71 = false
        }
        else activated71 = false
    }

    private fun collideDetect72() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile72

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated72) {
                            activated72 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated72 = false
                }
                else  activated72 = false
            }
            else activated72 = false
        }
        else activated72 = false
    }

    private fun collideDetect73() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile73

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated73) {
                            activated73 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated73 = false
                }
                else  activated73 = false
            }
            else activated73 = false
        }
        else activated73 = false
    }

    private fun collideDetect74() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile74

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated74) {
                            activated74 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated74 = false
                }
                else  activated74 = false
            }
            else activated74 = false
        }
        else activated74 = false
    }

    private fun collideDetect75() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile75

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated75) {
                            activated75 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated75 = false
                }
                else  activated75 = false
            }
            else activated75 = false
        }
        else activated75 = false
    }

    private fun collideDetect76() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile76

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated76) {
                            activated76 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated76 = false
                }
                else  activated76 = false
            }
            else activated76 = false
        }
        else activated76 = false
    }

    private fun collideDetect77() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile77

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated77) {
                            activated77 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated77 = false
                }
                else  activated77 = false
            }
            else activated77 = false
        }
        else activated77 = false
    }

    private fun collideDetect78() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile78

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated78) {
                            activated78 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated78 = false
                }
                else  activated78 = false
            }
            else activated78 = false
        }
        else activated78 = false
    }

    private fun collideDetect79() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile79

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated79) {
                            activated79 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated79 = false
                }
                else  activated79 = false
            }
            else activated79 = false
        }
        else activated79 = false
    }

    private fun collideDetect80() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile80

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated80) {
                            activated80 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated80 = false
                }
                else  activated80 = false
            }
            else activated80 = false
        }
        else activated80 = false
    }

    private fun collideDetect81() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile81

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated81) {
                            activated81 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated81 = false
                }
                else  activated81 = false
            }
            else activated81 = false
        }
        else activated81 = false
    }

    private fun collideDetect82() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile82

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated82) {
                            activated82 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated82 = false
                }
                else  activated82 = false
            }
            else activated82 = false
        }
        else activated82 = false
    }

    private fun collideDetect83() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile83

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated83) {
                            activated83 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated83 = false
                }
                else  activated83 = false
            }
            else activated83 = false
        }
        else activated83 = false
    }

    private fun collideDetect84() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile84

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated84) {
                            activated84 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated84 = false
                }
                else  activated84 = false
            }
            else activated84 = false
        }
        else activated84 = false
    }

    private fun collideDetect85() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile85

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated85) {
                            activated85 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated85 = false
                }
                else  activated85 = false
            }
            else activated85 = false
        }
        else activated85 = false
    }

    private fun collideDetect86() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile86

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated86) {
                            activated86 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated86 = false
                }
                else  activated86 = false
            }
            else activated86 = false
        }
        else activated86 = false
    }

    private fun collideDetect87() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile87

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated87) {
                            activated87 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated87 = false
                }
                else  activated87 = false
            }
            else activated87 = false
        }
        else activated87 = false
    }

    private fun collideDetect88() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile88

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated88) {
                            activated88 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated88 = false
                }
                else  activated88 = false
            }
            else activated88 = false
        }
        else activated88 = false
    }

    private fun collideDetect89() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile89

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated89) {
                            activated89 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated89 = false
                }
                else  activated89 = false
            }
            else activated89 = false
        }
        else activated89 = false
    }

    private fun collideDetect90() {
        val glitchColor = getColor(R.color.glitch_block)
        val errorColor = getColor(R.color.error_block)
        val warningColor = getColor(R.color.warning_block)
        val fixColor = getColor(R.color.fix_block)
        val crashColor = getColor(R.color.black)

        val thisTile = tile90

        val playerX = player.x
        val playerY = player.y
        val tileX = thisTile.x
        val tileY = thisTile.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated90) {
                            activated90 = true
                            when {
                                getBackgroundColor(thisTile) == warningColor -> warningBlockHit()
                                getBackgroundColor(thisTile) == errorColor -> errorBlockHit()
                                getBackgroundColor(thisTile) == crashColor -> crashBlockHit()
                                getBackgroundColor(thisTile) == fixColor -> fixBlockHit()
                                getBackgroundColor(thisTile) == glitchColor -> glitchBlockHit()
                            }
                        }
                    }
                    else activated90 = false
                }
                else  activated90 = false
            }
            else activated90 = false
        }
        else activated90 = false
    }

    private fun glitchBlockHit() {
        val handler1 = Handler(Looper.getMainLooper())

        player.setColorFilter(getColor(R.color.glitch_block))
        handler1.postDelayed({
            player.setColorFilter(getColor(R.color.white))
        }, (150).toLong())
        when((1..8).random()) {
            in (1..3) -> issues += (1..4).random()
            in (4..7) -> {
                issues += (0..4).random()
                repeat((2..6).random()) {
                    highlightRandomTile()
                }
            }
            8 -> gameOver()
        }
    }
}
// Green: Safe block; 10% chance of adding an Info Block.
// Orange: Warning Block; adds 1 issue to the user's "code"
// Red: Error Block; adds 2 to 3 issues to the user's "code" and creates more unsafe blocks. Chosen orange blocks become red and chosen red blocks become black
// Black: Crash Blocks; hitting one of these is an instant game over.
// Teal: Fix Blocks; fixes 1 issue and 25% chance of adding another fix block over a green safe block.
// Magenta: Glitch Blocks; Let the glitch apocalypse begin. ;)

/* ~FEATURE IDEAS~
*  Hitting an Error BLock makes the phone vibrate and screen shake via 3D rotation
*  Idea: White BLocks: Ad Blocks; gives the user a frikin' ad
*
*
*
* 563*/