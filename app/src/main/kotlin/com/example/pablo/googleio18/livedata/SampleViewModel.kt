package com.example.pablo.googleio18.livedata

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.pablo.googleio18.utils.FakeLongDataLoading

class SampleViewModel : ViewModel(){

    private var liveData: MutableLiveData<ArrayList<String>>? = null

    fun getData(): LiveData<ArrayList<String>> {
        if(liveData == null) {
            liveData = MutableLiveData()
            load()
        }
        return liveData!!
    }

    private fun load() {
        FakeLongDataLoading.loadSpeeches {
            liveData?.value = it
        }
    }

}