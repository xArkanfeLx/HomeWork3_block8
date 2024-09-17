package com.example.buttons

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var myInnputField: EditText
    private lateinit var resultText: TextView
    private lateinit var symbolsText: TextView
    private lateinit var myButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        myInnputField = findViewById(R.id.myInnputField)
        resultText = findViewById(R.id.resultText)
        symbolsText = findViewById(R.id.symbolsText)
        myButton = findViewById(R.id.myButton)
    }

    fun onMyButtonClick(view:View){
        val txt = myInnputField.text
        resultText.text = txt.reversed()
        symbolsText.text = txt.length.toString()
    }
}