package com.example.rng

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_ramdom_number.*
import kotlinx.android.synthetic.main.activity_ramdom_number.*

class RandomNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ramdom_number)
        generateRandomNumber()
        init()
    }

    private fun init() {
        generateRandomNumber.setOnClickListener {
            d("button","button is active!")
            generateRandomNumber()

        }
    }

    private fun generateRandomNumber(){
        val number: Int = (-100..100).random()
        d("randomNumber","$number")
        if(number >0 ){
            result.text = "No"
            return
        }
        if (number % 5 == 0) {
            result.text = "Yes"
        }
        else{
            result.text = "No"
        }
    }
    }