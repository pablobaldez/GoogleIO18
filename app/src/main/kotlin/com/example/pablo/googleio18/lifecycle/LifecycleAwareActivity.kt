package com.example.pablo.googleio18.lifecycle

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.pablo.googleio18.R
import com.example.pablo.googleio18.utils.FakeLongDataLoading
import com.example.pablo.googleio18.utils.toast
import kotlinx.android.synthetic.main.activity_sample.*

class LifecycleAwareActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)
        val myListener = LocationListener(this, lifecycle) {
            progressBar.visibility = View.INVISIBLE
            textView.text = it
            toast("Data loading finished")
        }
        FakeLongDataLoading.load {
            myListener.connect()
        }
    }

}