package id.mustofa.app.sharedvm.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @author Habib Mustofa
 * Indonesia on 10/09/19
 */
class SharedViewModel : ViewModel() {

    private val _user = MutableLiveData<String>()
    val user: LiveData<String> = _user

    fun setUser(value: String) {
        _user.value = value
    }
}