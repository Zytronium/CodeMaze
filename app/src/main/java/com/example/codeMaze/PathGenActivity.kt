package com.example.codeMaze

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.forEach
import androidx.gridlayout.widget.GridLayout
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

class PathGenActivity : AppCompatActivity() {

    private var loaded = false
    private var numb = 0
    lateinit var grid: GridLayout
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
     private var tiles: Array<Tile> = arrayOf()

     private var visualGeneration: Boolean = true
     private var loadWait = 5L
     private var generationComplete = false
     private var generatingMazes = 0
     private var generatedMazes = 0
    private var internalGenerationDone = false
     private var completionConflictRetries = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.path_gen_layout)

        grid = findViewById(R.id.grid)
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

//        allTiles.forEach { frame: FrameLayout ->
//            val grid: GridLayout? = (if (frame.parent is GridLayout) frame.parent as GridLayout else null)
        loadIt()
    }

    private fun loadIt() {

        fun checkLoaded(): Boolean {
            var l = true
            allTiles.forEach { tile: FrameLayout ->
                if(tile.x == 0F && tile.y == 0F && tile != tile9) l = false
            }
            return l
        }

        if(checkLoaded() && !loaded) {
            loaded = true

            Handler().postDelayed({

            grid.forEach { view: View ->
                if (view is FrameLayout) {
                    val tX = when (view.x) {
//                        0F -> 0
                        tile43.x -> 1
                        tile0.x -> 2
                        tile51.x -> 3
                        tile41.x -> 4
                        tile52.x -> 5
                        tile74.x -> 6
                        tile67.x -> 7
                        else -> 0
                    }
                    val tY = when (view.y) {
//                        0F -> 0
                        tile0.y -> 1
                        tile3.y -> 2
                        tile33.y -> 3
                        tile18.y -> 4
                        tile30.y -> 5
                        tile53.y -> 6
                        tile6.y -> 7
                        tile59.y -> 8
                        tile55.y -> 9
                        tile40.y -> 10
                        tile61.y -> 11
                        tile29.y -> 12
                        tile16.y -> 13
                        else -> 0
                    }
                    if (tX == 0) println("WARNING: tX == 0 for a tile")
                    if (tY == 0) println("WARNING: tY == 0 for a tile")
                    val newTile = Tile(view, tX, tY)
                    tiles = tiles.plusElement(newTile)
                }
            }
//        }

            generateMaze()
                println("Internal generation complete: $internalGenerationDone")

                passTileData()
//        allTiles.forEach { frameLayout: FrameLayout ->
//            if (identifyPath().contains(frameLayout)) {
//                numb++
//                println(frameLayout.id.toString() + "yes" + numb)
//                println(numb)
//                passPathTiles(frameLayout)
//
//            } else {
//                println("no")
//            }
//        }

                println("LoadWait1 = $loadWait")
                val intent =
                    Intent(this@PathGenActivity, MainActivity(visualGeneration)::class.java)

                if(visualGeneration) {
                    Handler().postDelayed({
                        println("Checking If Generation Has Completed...")
                        loadActivity(intent) // checks if it has completed and loads activity is so, else checks again.
////                        Handler().postDelayed({
//                            val w1 = loadWait
//                            Handler().postDelayed({
//                                if(w1 == loadWait) {
//                                    println("w1 = LoadWait2 = $loadWait")
//                                    startActivity(intent)
//                                    finish()
//                                } else {
//                                    println("not done loading...")
//                                    val w2 = loadWait
//                                    Handler().postDelayed({
//
//                                        println("x LoadWait3 = $loadWait")
//                                    println("4loading ${if (w2 == loadWait) "has" else "has NOT"} finished. ")
//                                        if (w2 == loadWait) {
//                                            startActivity(intent)
//                                            finish()
//                                        } else {
//                                            val w3 = loadWait
//                                        Handler().postDelayed({
//                                            println("5 ~ loading ${if (w3 == loadWait) "has" else " still has NOT"} finished. ")
//                                            if (w3 != loadWait) {
//                                                println("GAME WILL LOAD PREMATURELY")
//                                            }
//                                            // TODO: if this is false, the game will load early!
//
//                                            startActivity(intent)
//                                            finish()
//                                        }, loadWait+306)
//                                        }
//                                    }, loadWait+51)
//                                    }
//                            }, 100)
////                            println("LoadWait5 = $loadWait")
////                        }, 20)
//                        println("LoadWait6 = $loadWait")
                    }, loadWait+100)
                } else {
                    println("LoadWait7 = $loadWait")
                    startActivity(intent)
                    finish()
                    println("LoadWait8 = $loadWait")
                }

            },399L)
        } else if(!loaded) {
            println("loading")
            Handler().postDelayed({
                loadIt()
            },33)
        }
    }

    private fun loadActivity(intent: Intent) {// checks if generation has completed and loads the activity if true, else waits briefly checks again, looping until it detects generation has finished.
        if(generationComplete) {
            println("Maze Generation Completed. Starting Minigame.")
            startActivity(intent)
            finish()
        } else {
            println("Generation Not Completed Yet.")
            Handler().postDelayed({
                println("Rechecking If Generation Completed...")
                loadActivity(intent)
            }, 45)
        }
    }

    private fun generateMaze() {
        generatingMazes ++
        val startTile: Tile = getTile(x = (1..7).random(), y = 1)!!  // do something in case it == null
        startTile.path = true
        if(visualGeneration) {
            startTile.tile.setBackgroundColor(getColor(R.color.safe_block))
//            startTile.tile.invalidate()
//            sleep(25)
        }
        val nextTile = getTile(startTile.x, startTile.y + 1)!!
        nextTile.path = true
        if(visualGeneration) {
            loadWait+= 41
            Handler().postDelayed({
                nextTile.tile.setBackgroundColor(getColor(R.color.safe_block))
            }, loadWait)
//            nextTile.tile.invalidate()
//            sleep(25)
        }

        step(nextTile, 2)

/*        if(visualGeneration) {
            Handler().postDelayed({

                passTileData()

            }, loadWait + 520)
        } else */ //passTileData()
        generatedMazes ++
        generatingMazes --
        continueWhenDone()
        internalGenerationDone = true
    }

    private fun continueWhenDone() {
        val w = loadWait
        Handler().postDelayed({
            if (w == loadWait) {
                println("maze generation stage done.")
                if (identifyGenPath().size <= 20) { //TODO: !!WIP!!
                    println("too small; generating another maze.")
                    generateMaze()
                } else if(generatingMazes == 0) {
                    println("all generation complete.")
                    passTileData()
                    generationComplete = true
                } else {
                    completionConflictRetries ++
                    if(completionConflictRetries < 126) {
                        println("Warning, detected completed generation but $generatingMazes maze stages are supposedly still generating. Checking again. ")
                        continueWhenDone()
                    } else {
                        println("$generatingMazes maze stages are supposedly still generating after $completionConflictRetries rechecks. Loading minigame anyways. Debug: Mazes generating: $generatingMazes; mazes generated: $generatedMazes; internalGenerationDone: $internalGenerationDone")
                        passTileData()
                        generationComplete = true
                    }
                }
                passTileData()
            } else continueWhenDone()
        }, 150)
    }

    private fun passTileData() {
        tiles.forEach { tile: Tile ->
            if(tile.path == true) {
                when(tile.tile) {
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
    }

    private fun step(previousTile: Tile, dirctn: Int) {
        var direction = dirctn
        val oldDirection = direction // maybe replace oldDirection with just dirctn
        val next = when(direction) {
            1 -> getTile(previousTile.x - 1, previousTile.y)// never gonna give U (2)
            2 -> getTile(previousTile.x, previousTile.y + 1)//      up 2
            3 -> getTile(previousTile.x + 1, previousTile.y)// left 1     3 right
            4 -> getTile(previousTile.x, previousTile.y - 1)//    down 4
            else -> { getTile(previousTile.x, previousTile.y)}//  never gonna let U (4)
        }
        var illegal = false
        if((next != null/* && !next.path!!*/)/*next != null is always true, redo this, maybe remove !next.path!!*/ /*|| (next != null)*/) { // check for illegal path combos, e.g. filled squares
            val illegalTile = ((getTile(next.x, next.y+1)?.path == true && getTile(next.x+1, next.y)?.path == true && getTile(next.x + 1, next.y + 1)?.path == true) || (getTile(next.x+1, next.y)?.path == true && getTile(next.x, next.y-1)?.path == true && getTile(next.x + 1, next.y - 1)?.path == true) || (getTile(next.x-1, next.y)?.path == true && getTile(next.x, next.y-1)?.path == true && getTile(next.x - 1, next.y - 1)?.path == true) || (getTile(next.x-1, next.y)?.path == true && getTile(next.x, next.y+1)?.path == true && getTile(next.x - 1, next.y + 1)?.path == true))
            if(!illegalTile) {
                if (next.path != null && next.path!! && (0..24).random() == 4) direction = 0
                else {
                    next.path = true
                    if (visualGeneration) {
                        loadWait += 41
                        Handler().postDelayed({
                            next.tile.setBackgroundColor(getColor(R.color.safe_block))
                        }, loadWait)
                    }
                }
            } else {
                illegal = true
//                direction = 0
            }
        } else direction = 0
        if(next == null) illegal = true
        if((1..124).random() == 42) direction = 0

        if(direction != 0 || illegal) {
            direction = when ((1..8).random()) {
                1 -> if (direction != 3) 1 else 3
                2 -> if (direction != 4) 2 else 4
                3 -> if (direction != 1) 3 else 1
                4 -> if (direction != 2) 4 else 2
                5 -> 5
                6 -> arrayOf(6, 5, 5).random()
                else -> if(direction == 1 || direction == 3 && (1..3).random() == 3) 2 else direction
                // 7/10 -> stays same
                // 2/10 -> left or right turn //odds outdated since 5 AND 6 now make turns instead of just 5
                // 1/10 split at least once
                // 1/10 chance that theres a 1/5 chance that theres a 1/5 chance that it will split twice, making a 4-way intersection if possible.
            }

            if (direction == 5) {
                if (next != null) {
                    step(if(illegal) previousTile else next, oldDirection)
                } // same direction as before, while the old path takes a turn
                direction = when ((1..5).random()) { // cant be old direction or opposite of it
                    1 -> if (oldDirection != 1 && oldDirection != 3) 1 else 4
                    2 -> if (oldDirection != 2 && oldDirection != 4) 2 else 1
                    3 -> if (oldDirection != 3 && oldDirection != 1) 3 else 2
                    4 -> if (oldDirection != 4 && oldDirection != 2) 4 else 3
                    else -> (1..5).random()
                }
                if (direction == 5) {
                    val s2 = when ((1..4).random()) { // cant be old direction or opposite of it
                        1 -> if (oldDirection != 3 && oldDirection != 1) 1 else 2
                        2 -> if (oldDirection != 4 && oldDirection != 2) 2 else 3
                        3 -> if (oldDirection != 1 && oldDirection != 3) 3 else 4
                        else -> if (oldDirection != 2 && oldDirection != 4) 4 else 1
                    }
                    if (next != null) {
//                        if(setTile) loadWait += 35
                        step(if(illegal) previousTile else next, s2)
                    }
                    direction = when (s2) { //opposite direction of this split direction
                        1 -> 3
                        2 -> 4
                        3 -> 1
                        else -> 2
                    }
                }
            }
//            if (next != null /*&& !((getTile(next.x, next.y+1)?.path == true && getTile(next.x+1, next.y)?.path == true && getTile(next.x + 1, next.y + 1)?.path == true) || (getTile(next.x+1, next.y)?.path == true && getTile(next.x, next.y-1)?.path == true && getTile(next.x + 1, next.y - 1)?.path == true) || (getTile(next.x-1, next.y)?.path == true && getTile(next.x, next.y-1)?.path == true && getTile(next.x - 1, next.y - 1)?.path == true) || (getTile(next.x-1, next.y)?.path == true && getTile(next.x, next.y+1)?.path == true && getTile(next.x - 1, next.y + 1)?.path == true))*/
//            ) {
                if(!illegal || (0..15).random() == 3) step(if (illegal || next == null) previousTile else next, direction)
//            }
        }
        // else this path stops
    }

//    private fun split(newDirection: Int) {
//        TO DO("Not yet implemented")
//    }

    private fun getTile(x: Int, y: Int): Tile? {
        var found = false
        var tile: Tile? = null
        tiles.forEach { t: Tile ->
            if(t.x == x && t.y == y) {
                if(found) println("WARNING: Multiple tiles found for coords $x, $y")
                else found = true
                tile = t
            }
        }
        return tile
    }

    private fun getTile(view: FrameLayout): Tile? {
        var found = false
        var tile: Tile? = null
        tiles.forEach { t: Tile ->
            if(t.tile == view) {
                if(found) println("WARNING: Multiple tiles found for view $view")
                else found = true
                tile = t
            }
        }
        return tile
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

    fun identifyPath(): Array<FrameLayout> { //you can do this with Tiles.getTile.this when 'this' = a tile in forEach

        var safeTiles: Array<FrameLayout> = arrayOf()
        allTiles.onEach { frameLayout: FrameLayout ->
            if (getBackgroundColor(frameLayout) == getColor(R.color.safe_block)) {
                safeTiles += frameLayout
            }
        }
        return safeTiles
    }

    fun identifyGenPath(): Array<FrameLayout> { //you can do this with Tiles.getTile.this when 'this' = a tile in forEach

        var safeTiles: Array<FrameLayout> = arrayOf()
        tiles.onEach { tile: Tile ->
            if (tile.path == true) {
                safeTiles += tile.tile
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

    class Tile(val tile: FrameLayout, val x: Int, val y: Int, var path: Boolean? = null)
}