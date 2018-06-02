package com.example.pablo.googleio18.utils

import android.os.CountDownTimer

object FakeLongDataLoading {

    val arrayList = ArrayList<String>()
    init {
        arrayList.add("")
        arrayList.add("")
        arrayList.add("")
        arrayList.add("")
        arrayList.add("")
        arrayList.add("")
    }

    fun load(onLoad: () -> Unit) {
        val counter = object : CountDownTimer(3000, 1000){
            override fun onFinish() {
                onLoad()
            }

            override fun onTick(millisUntilFinished: Long) {}

        }
        counter.start()
    }

    fun loadSpeeches(onLoad: (ArrayList<String>) -> Unit) {
        load { onLoad(arrayList) }
    }

}