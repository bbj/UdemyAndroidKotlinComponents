package com.bbj.textviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    /**
     * In Kotlin a class variable must be initialized or be abstract
     * but sometime we just want to initialize later; 2 options:
     *      1. lateinit keyword: code editor is happier (most common for components)
     *      2. var myText : TextView? = null
     */
    lateinit var myText : TextView
    /**
        onCreate() is called when activity is created
        - it is the very first lifecycle function called
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * R: represents the resources folder
         */
        myText = findViewById(R.id.textExample)
        myText.setTextColor(Color.RED)

        myText.setText("This is an example")
        //same as myText.text = "This is an example"

        myText.setOnClickListener {
            myText.setTextColor(Color.WHITE)
            myText.setBackgroundColor(Color.BLACK)
        }

    }
}