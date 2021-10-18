package com.example.buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var btPlus : Button
    lateinit var btMinus : Button
    lateinit var textView: TextView
    var value =  0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btPlus = findViewById(R.id.btPlus)
        btMinus = findViewById(R.id.btMinus)
        textView = findViewById(R.id.textView)
        value = textView.text.toString().toInt()

        btPlus.setOnClickListener {
            value++
            textView.text = value.toString()
        }
        btMinus.setOnClickListener {
            value--
            textView.text = value.toString()
        }
    }
}