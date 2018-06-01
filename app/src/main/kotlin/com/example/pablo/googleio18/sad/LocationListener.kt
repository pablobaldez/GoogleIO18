package com.example.pablo.googleio18.sad

import android.content.Context
import com.example.pablo.googleio18.R


class LocationListener(
        private val context: Context,
        private val callback: (String) -> Unit
) {

    fun connect() {
        callback(context.getString(R.string.loaded))
    }

    fun disconnect() {
        //do nothing
    }

}