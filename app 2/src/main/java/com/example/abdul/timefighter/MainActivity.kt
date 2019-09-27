package com.example.abdul.timefighter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    internal lateinit var tapMeButton: Button
    internal lateinit var gameScoreTextView: TextView
    internal lateinit var timeLeftTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        tapMeButton = findViewById(R.id.tapMeButton)
        gameScoreTextView = findViewById(R.id.scoreTextview)
        timeLeftTextView =findViewById(R.id.timeTextView)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
