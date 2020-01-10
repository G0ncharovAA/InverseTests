package ru.gonchar17narod.inversetests.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    companion object {
        const val LABEL = "This is home Fragment"
    }

    private val mText = MutableLiveData<String>().apply {
        value = LABEL
    }
    val liveText: LiveData<String> = mText
}