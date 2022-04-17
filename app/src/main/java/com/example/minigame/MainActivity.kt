package com.example.minigame

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.toColorInt


class MainActivity : AppCompatActivity() {
    // ~Stats:~
    private var issues = 0
    // ~Stats ~

    var activated = false

    private lateinit var devToolsMenu: ScrollView
    private lateinit var devToolsToggleButton: ToggleButton
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
        devToolsMenu = findViewById(R.id.devToolsMenu)
        devToolsToggleButton = findViewById(R.id.devToolsButton)
        devToolsToggleButton.setOnCheckedChangeListener { _, isChecked -> toggleTools(isChecked) }

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
//        collideDetect2()
    }

    private fun selectRandomTile(): FrameLayout {
        val randTile = allTiles.random()
        return randTile
    }

    private fun highlightRandomTiles() {
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
                randTile.setBackgroundColor("#CDEE00FF".toColorInt())
            }
            1 -> {
                randTile2.setBackgroundColor("#CDEE00FF".toColorInt())
            }
            3 -> {
                randTile3.setBackgroundColor("#CDEE00FF".toColorInt())
            }
            4 -> {
                randTile4.setBackgroundColor("#CDEE00FF".toColorInt())
            }
            5 -> {
                randTile7.setBackgroundColor("#CDEE00FF".toColorInt())
            }
            6 -> {
                randTile6.setBackgroundColor("#CDEE00FF".toColorInt())
            }
            7 -> {
                randTile5.setBackgroundColor("#CDEE00FF".toColorInt())
            }
            8 -> {
                ranRand.setBackgroundColor("#CDEE00FF".toColorInt())
            }

        }

    }

    @SuppressLint("ClickableViewAccessibility")
    private fun onTouchListener(): View.OnTouchListener {
        return View.OnTouchListener { view, event ->
            val x = event.rawX.toInt()
            val y = event.rawY.toInt()
//            collisionDetection()
            collideDetect2()
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

    private fun checkIssues(view: View) {
        if (issues >= 10) {
            gameOver(view)
        }
    }

    fun fixBlockHit(view: View) {
        if (issues != 0) {
            issues -= 1
        }
        //make this fix block a safe block
        //25% chance that another fix block appears
    }

    fun warningBlockHit(view: View) {
        issues += 1
        println("debug message1")
    }

    fun errorBlockHit(view: View) {
        val selectedTile1 = selectRandomTile()
        val selectedTile2 = selectRandomTile()
        val selectedTile3 = selectRandomTile()
        val selectedTile4 = selectRandomTile()
        issues += (2..3).random()
        var color: Int = Color.TRANSPARENT

        val background = selectedTile1.background
        if (background is ColorDrawable) color = background.color
        if (color == getColor(R.color.warning_block)) {
            selectedTile1.setBackgroundColor(getColor(R.color.error_block))
        } else if(color == getColor(R.color.error_block)) {
            selectedTile1.setBackgroundColor(getColor(R.color.black))
        } else println("WIP code")//********

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
        } else println("WIP code")//********

        //increase amount of red and black blocks. some random blocks will be chosen randomly, chosen orange blocks become red and chosen red blocks become black
    }

    fun crashBlockHit(view: View) {
        gameOver(view)
    }

    fun gameOver(view: View) {
        issues = 0
        //reset game board
        //reset character placement
    }

    private fun toggleTools(isChecked: Boolean) {
        if (isChecked) {
            devToolsMenu.visibility = View.VISIBLE
        } else if (!isChecked) {
            devToolsMenu.visibility = View.GONE
        }
    }

    fun delDevTools(view: View) {
        devToolsToggleButton.visibility = View.GONE
        devToolsMenu.visibility = View.GONE
    }

    private fun collideDetect2() {
        val errorColor = "#FF0000"
        val warningColor = "#FF8C00"
        val safeColor = "#5AFF00"
        val fixColor = "#00ED8E"

        val playerX = player.x
        val playerY = player.y
        val tileX = tile69.x
        val tileY = tile69.y
        if (playerX <= (tileX + 155f)) {
            if(playerX >= (tileX - 85f)) {
                println("X collision detected.")
                println("player's X is $playerX and tile's X is $tileX")
                if (playerY >= (tileY + 75f)) {
                    if(playerY <= (tileY + 275f)) {
                        println("Y collision detected.")
                        println("player's Y is $playerY and tile's Y is $tileY")
                        if (!activated) {
                            activated = true
                            highlightRandomTiles()
                            when ((1..2).random()) {
                                2 -> {
                                    tile69.setBackgroundColor(warningColor.toColorInt())
                                }
                                1 -> {
                                    tile69.setBackgroundColor(fixColor.toColorInt())
                                }

                            }
                        }
                    }
                    else {
                        activated = false
                    }
                }
                else {
                    activated = false
                }
            }
            else {
                activated = false
            }
        }
        else {
            activated = false
        }
    }
}
// Green: Safe block; 10% chance of adding an Info Block.
// Orange: Warning Block; adds 1 issue to the user's "code"
// Red: Error Block; adds 2 to 3 issues to the user's "code" and creates more unsafe blocks. Chosen orange blocks become red and chosen red blocks become black
// Black: Crash Blocks; hitting one of these is an instant game over.
// Teal: Fix Blocks; fixes 1 issue and 25% chance of adding another fix block over a green safe block.
// Magenta: Information Blocks; gives a toast giving a tip. 25% chance of adding an issue.

/* ~FEATURES~
*  Hitting an Error BLock makes the phone vibrate and screen shake via 3D rotation
*  Idea: White BLocks: Ad Blocks; gives the user a frikin' ad
*
*
*
* */