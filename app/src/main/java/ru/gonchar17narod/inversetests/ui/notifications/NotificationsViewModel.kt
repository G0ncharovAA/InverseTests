package ru.gonchar17narod.inversetests.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    companion object {
        const val LABEL = "This is notifications Fragment"
    }

    private val mText = MutableLiveData<String>().apply {
        value = LABEL
    }
    val liveText: LiveData<String> = mText
}