package com.example.pablo.googleio18.utils

import android.os.CountDownTimer

object FakeLongDataLoading {

    fun load(onLoad: (Boolean) -> Unit) {
        val counter = object : CountDownTimer(3000, 1000){
            override fun onFinish() {
                onLoad(true)
            }

            override fun onTick(millisUntilFinished: Long) {}

        }
        counter.start()

    }

}