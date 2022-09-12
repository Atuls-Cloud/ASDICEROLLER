package com.atuls7718.asdiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onbuttonclicked(view: View) {
        val randomNumber = (1..6).random()
        textView2.text = randomNumber.toString()
    }
}
