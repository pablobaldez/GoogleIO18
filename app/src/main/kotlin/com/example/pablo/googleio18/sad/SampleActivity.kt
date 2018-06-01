package com.example.pablo.googleio18.sad

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.pablo.googleio18.R
import com.example.pablo.googleio18.utils.FakeLongDataLoading
import com.example.pablo.googleio18.utils.toast
import kotlinx.android.synthetic.main.activity_sample.*

class SampleActivity : AppCompatActivity() {

    private lateinit var locationListener: LocationListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)
        locationListener = LocationListener(this) {
            progressBar.visibility = View.INVISIBLE
            textView.text = it
            toast("Data loading finished")
        }
    }

    override fun onStart() {
        super.onStart()
        progressBar.visibility = View.VISIBLE
        FakeLongDataLoading.load {
            locationListener.connect()
        }
    }

    override fun onStop() {
        super.onStop()
        locationListener.disconnect()
    }

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, SampleActivity::class.java)
            context.startActivity(intent)
        }
    }

}