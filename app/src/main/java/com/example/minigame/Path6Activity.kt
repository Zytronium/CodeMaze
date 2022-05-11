package com.example.minigame

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.minigame.Path1Activity.Path1Tiles.TILE0
import com.example.minigame.Path1Activity.Path1Tiles.TILE1
import com.example.minigame.Path1Activity.Path1Tiles.TILE2
import com.example.minigame.Path1Activity.Path1Tiles.TILE3
import com.example.minigame.Path1Activity.Path1Tiles.TILE4
import com.example.minigame.Path1Activity.Path1Tiles.TILE5
import com.example.minigame.Path1Activity.Path1Tiles.TILE6
import com.example.minigame.Path1Activity.Path1Tiles.TILE7
import com.example.minigame.Path1Activity.Path1Tiles.TILE8
import com.example.minigame.Path1Activity.Path1Tiles.TILE9
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
import com.example.minigame.Path1Activity.Path1Tiles.TILE90

class Path6Activity : AppCompatActivity() {

    private var numb = 0
     lateinit var tile0: FrameLayout
     lateinit var tile1: FrameLayout
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.path6_layout)

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

        allTiles.forEach { frameLayout: FrameLayout ->
            if (identifyPath().contains(frameLayout)) {
                numb++
                println(frameLayout.id.toString() + "yes" + numb)
                println(numb)
                passPathTiles(frameLayout)

            } else {
                println("no")
            }
        }

        val intent = Intent(this@Path6Activity, MainActivity::class.java)
        startActivity(intent)
        finish()

    }

    fun passPathTiles(tile: FrameLayout) {
        if(identifyPath().contains(tile)) {
            when (tile) {
                tile0 -> TILE0 = true
                tile1 -> TILE1 = true
                tile2 -> TILE2 = true
                tile3 -> TILE3 = true
                tile4 -> TILE4 = true
                tile5 -> TILE5 = true
                tile6 -> TILE6 = true
                tile7 -> TILE7 = true
                tile8 -> TILE8 = true
                tile9 -> TILE9 = true
                tile10 -> TILE10 = true
                tile11 -> TILE11 = true
                tile12 -> TILE12 = true
                tile13 -> TILE13 = true
                tile14 -> TILE14 = true
                tile15 -> TILE15 = true
                tile16 -> TILE16 = true
                tile17 -> TILE17 = true
                tile18 -> TILE18 = true
                tile19 -> TILE19 = true
                tile20 -> TILE20 = true
                tile21 -> TILE21 = true
                tile22 -> TILE22 = true
                tile23 -> TILE23 = true
                tile24 -> TILE24 = true
                tile25 -> TILE25 = true
                tile26 -> TILE26 = true
                tile27 -> TILE27 = true
                tile28 -> TILE28 = true
                tile29 -> TILE29 = true
                tile30 -> TILE30 = true
                tile31 -> TILE31 = true
                tile32 -> TILE32 = true
                tile33 -> TILE33 = true
                tile34 -> TILE34 = true
                tile35 -> TILE35 = true
                tile36 -> TILE36 = true
                tile37 -> TILE37 = true
                tile38 -> TILE38 = true
                tile39 -> TILE39 = true
                tile40 -> TILE40 = true
                tile41 -> TILE41 = true
                tile42 -> TILE42 = true
                tile43 -> TILE43 = true
                tile44 -> TILE44 = true
                tile45 -> TILE45 = true
                tile46 -> TILE46 = true
                tile47 -> TILE47 = true
                tile48 -> TILE48 = true
                tile49 -> TILE49 = true
                tile50 -> TILE50 = true
                tile51 -> TILE51 = true
                tile52 -> TILE52 = true
                tile53 -> TILE53 = true
                tile54 -> TILE54 = true
                tile55 -> TILE55 = true
                tile56 -> TILE56 = true
                tile57 -> TILE57 = true
                tile58 -> TILE58 = true
                tile59 -> TILE59 = true
                tile60 -> TILE60 = true
                tile61 -> TILE61 = true
                tile62 -> TILE62 = true
                tile63 -> TILE63 = true
                tile64 -> TILE64 = true
                tile65 -> TILE65 = true
                tile66 -> TILE66 = true
                tile67 -> TILE67 = true
                tile68 -> TILE68 = true
                tile69 -> TILE69 = true
                tile70 -> TILE70 = true
                tile71 -> TILE71 = true
                tile72 -> TILE72 = true
                tile73 -> TILE73 = true
                tile74 -> TILE74 = true
                tile75 -> TILE75 = true
                tile76 -> TILE76 = true
                tile77 -> TILE77 = true
                tile78 -> TILE78 = true
                tile79 -> TILE79 = true
                tile80 -> TILE80 = true
                tile81 -> TILE81 = true
                tile82 -> TILE82 = true
                tile83 -> TILE83 = true
                tile84 -> TILE84 = true
                tile85 -> TILE85 = true
                tile86 -> TILE86 = true
                tile87 -> TILE87 = true
                tile88 -> TILE88 = true
                tile89 -> TILE89 = true
                tile90 -> TILE90 = true
            }
        }
    }

    fun identifyPath(): Array<FrameLayout> {

        var safeTiles: Array<FrameLayout> = arrayOf()
        allTiles.onEach { frameLayout: FrameLayout ->
            if (getBackgroundColor(frameLayout) == getColor(R.color.safe_block)) {
                safeTiles += frameLayout
            }
        }
        return safeTiles
    }

    fun getBackgroundColor(selectedTile: FrameLayout): Int {
        val background = selectedTile.background
        return if (background is ColorDrawable) background.color
        else {
            println("could not find requested color, returning transparent")
            Color.TRANSPARENT
        }
    }
}