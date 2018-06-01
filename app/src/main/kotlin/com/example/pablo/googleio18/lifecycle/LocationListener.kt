package com.example.pablo.googleio18.lifecycle

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.content.Context
import com.example.pablo.googleio18.R

class LocationListener(
        private val context: Context,
        private val lifecycle: Lifecycle,
        private val callback: (String) -> Unit) : LifecycleObserver{

    private var enabled = false

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun start() {
        if(enabled) {
            callback(context.getString(R.string.loaded))
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stop() {
        enabled = false
    }

    fun connect() {
        enabled = true
        if(lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED)) {
            start()
        }

    }

}