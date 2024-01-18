package com.example.weatherxmlpro

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val liveDataCurrent = MutableLiveData<DayItem>()
    val liveDataList = MutableLiveData<DayItem>()
}