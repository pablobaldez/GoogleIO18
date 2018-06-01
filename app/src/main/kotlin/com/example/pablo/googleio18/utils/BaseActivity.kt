package com.example.pablo.googleio18.utils

import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(){

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when(requestCode) {
            LOCATION_PERMISSION_REQUEST_CODE -> {
                if(grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                } else {
                    requestLocationPermission()
                }
            }
        }
    }

}