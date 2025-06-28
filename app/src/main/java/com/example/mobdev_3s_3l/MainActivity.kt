package com.example.mobdev_3s_3l

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button = findViewById<Button>(R.id.button)
        val tllTextViewFirst = findViewById<TextView>(R.id.tll_text_view_first)
        val tllTextViewSecond = findViewById<TextView>(R.id.tll_text_view_second)
        val tllTextViewThird = findViewById<TextView>(R.id.tll_text_view_third)
        val bllTextViewFirst = findViewById<TextView>(R.id.bll_text_view_first)
        val bllTextViewSecond = findViewById<TextView>(R.id.bll_text_view_second)
        val bllTextViewThird = findViewById<TextView>(R.id.bll_text_view_third)
        val clTextViewLeft = findViewById<TextView>(R.id.cl_text_view_left)
        val clTextViewRight = findViewById<TextView>(R.id.cl_text_view_right)
        val clTextViewCenter = findViewById<TextView>(R.id.cl_text_view_center)



        fun changeNumberTo(number: Int) {
            when(number) {
                1 -> {
                    tllTextViewFirst.setText("1")
                    tllTextViewSecond.setText("")
                    tllTextViewThird.setText("")
                    bllTextViewFirst.setText("1")
                    bllTextViewSecond.setText("")
                    bllTextViewThird.setText("")
                    clTextViewLeft.setText("1")
                    clTextViewRight.setText("")
                    clTextViewCenter.setText("")
                }
                2 -> {
                    tllTextViewFirst.setText("")
                    tllTextViewSecond.setText("2")
                    tllTextViewThird.setText("")
                    bllTextViewFirst.setText("")
                    bllTextViewSecond.setText("")
                    bllTextViewThird.setText("2")
                    clTextViewLeft.setText("")
                    clTextViewRight.setText("2")
                    clTextViewCenter.setText("")
                }
                3 -> {
                    tllTextViewFirst.setText("")
                    tllTextViewSecond.setText("")
                    tllTextViewThird.setText("3")
                    bllTextViewFirst.setText("")
                    bllTextViewSecond.setText("")
                    bllTextViewThird.setText("3")
                    clTextViewLeft.setText("")
                    clTextViewRight.setText("")
                    clTextViewCenter.setText("3")
                }
            }
        }

        var counter = 1

        button.setOnClickListener {
            changeNumberTo(counter)
            if (counter < 3) {
                counter++
            }
            else {
                counter = 1
            }
        }
    }
}