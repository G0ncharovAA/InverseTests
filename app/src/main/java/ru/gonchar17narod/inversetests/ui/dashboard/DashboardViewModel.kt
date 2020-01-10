package ru.gonchar17narod.inversetests.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    companion object {
        const val LABEL = "This is dashboard Fragment"
    }

    private val mText = MutableLiveData<String>().apply {
        value = LABEL
    }
    val liveText: LiveData<String> = mText
}