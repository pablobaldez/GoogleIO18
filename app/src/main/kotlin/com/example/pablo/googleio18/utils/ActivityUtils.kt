package com.example.pablo.googleio18.utils

import android.Manifest
import android.app.Activity
import android.content.pm.PackageManager
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.widget.Toast

val Activity.LOCATION_PERMISSION_REQUEST_CODE: Int get() = 1

fun Activity.isLocationPermissionAvailable(): Boolean {
    return ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) ==
            PackageManager.PERMISSION_GRANTED
}

fun Activity.toast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_LONG).show()
}

fun Activity.requestLocationPermission() {
    ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), LOCATION_PERMISSION_REQUEST_CODE)
}

fun Activity.doIfLocationIsAvailable(block: () -> Unit) {
    if(isLocationPermissionAvailable()) {
        block()
    } else {
        requestLocationPermission()
    }
}