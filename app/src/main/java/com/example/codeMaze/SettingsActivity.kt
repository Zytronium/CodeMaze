package com.example.codeMaze

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.SwitchPreferenceCompat

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_activity)
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.settings, SettingsFragment())
                .commit()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        shared = getSharedPreferences("CodeMinigameDB", Context.MODE_PRIVATE)
        readData()
    }

    class SettingsFragment : PreferenceFragmentCompat() {

        private lateinit var visualMazeGenSwitch: SwitchPreferenceCompat
        private lateinit var vibrationsSwitch: SwitchPreferenceCompat
        private lateinit var keepGenOptisSwitch: SwitchPreferenceCompat
        private lateinit var rainbowCharSwitch: SwitchPreferenceCompat

        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey)
            println("rootKey: $rootKey")
            visualMazeGenSwitch = findPreference("visualGen")!!
            vibrationsSwitch   = findPreference("vibrations")!!
            keepGenOptisSwitch = findPreference("KeepGenOptis")!!
            rainbowCharSwitch = findPreference("rainbowCharacter")!!
            val settingsSwitches = arrayOf<SwitchPreferenceCompat>(visualMazeGenSwitch, vibrationsSwitch, keepGenOptisSwitch, rainbowCharSwitch)
            // ToDo: create object for settings values | done?
            settingsSwitches.forEach { switch: SwitchPreferenceCompat ->
                switch.setOnPreferenceChangeListener { preference, newValue ->
                    println(preference.key + " | " + newValue)
                    SettingsValues.setSetting(preference.key, newValue as Boolean)
                    true
                }
                switch.isChecked = when(switch.key) {
                    "visualGen" -> SettingsValues.visualMazeGen
                    "vibrations" -> SettingsValues.vibrationsAllowed
                    "KeepGenOptis" -> SettingsValues.keepGeneratingOptis
                    "rainbowCharacter" -> SettingsValues.rainbowCharacter
                    else -> switch.isChecked
                }
            }
        }
    }

}

object SettingsValues { // Todo: this is attempt at the ToDo comment above, I doubt its anywhere close to correct.
    var keepGeneratingOptis = true
    var vibrationsAllowed = true
    var visualMazeGen = false
    var rainbowCharacter = false

    fun setSetting(key: String, value: Boolean) {
        when (key) {
            "KeepGenOptis" -> {
                keepGeneratingOptis = value
            }

            "vibrations" -> {
                vibrationsAllowed = value
            }

            "visualGen" -> {
                visualMazeGen = value
            }

            "rainbowCharacter" -> {
                rainbowCharacter = value
            }
            else -> {}

        }

        saveStats()

    }

}

private lateinit var shared : SharedPreferences
var level = 0
var totalOptimizers = 0

private fun readData() {
//        issues = shared.getInt("issues", issues)
    level = shared.getInt("level", level)
//        optimizers = shared.getInt("optimizers", optimizers)
    totalOptimizers = shared.getInt("totalOptimizers", totalOptimizers)

    SettingsValues.vibrationsAllowed   = shared.getBoolean("vibrations",    SettingsValues.vibrationsAllowed  )
    SettingsValues.visualMazeGen       = shared.getBoolean("visualMazeGen", SettingsValues.visualMazeGen      )
    SettingsValues.keepGeneratingOptis = shared.getBoolean("keepGenOptis",  SettingsValues.keepGeneratingOptis)
    SettingsValues.rainbowCharacter    = shared.getBoolean("rainbowCharacter",  SettingsValues.rainbowCharacter)
}

private fun saveStats() {
    val edit = shared.edit()
//        edit.putInt("issues" , issues )
    edit.putInt("level" , level )
//        edit.putInt("optimizers" , optimizers )
    edit.putInt("totalOptimizers" , totalOptimizers )

    //                     --Settings--                     \\
    edit.putBoolean("vibrations" , SettingsValues.vibrationsAllowed)
    edit.putBoolean("visualMazeGen" , SettingsValues.visualMazeGen)
    edit.putBoolean("keepGenOptis" , SettingsValues.keepGeneratingOptis)
    edit.putBoolean("rainbowCharacter" , SettingsValues.rainbowCharacter)
    edit.apply()
}