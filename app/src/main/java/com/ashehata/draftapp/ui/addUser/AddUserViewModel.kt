package com.ashehata.draftapp.ui.addUser

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.ashehata.draftapp.data.local.room.User

class AddUserViewModel(application: Application) : AndroidViewModel(application) {
    // init repo class
    private var repository = AddUserRepository(application)
    private val _isFormValid = MutableLiveData<String>()

    val isValid: LiveData<String>
        get() = _isFormValid

    fun setUserData(user: User) {
        checkValid(user)
    }

    private fun checkValid(user: User) {
        // check validation
        if ( user.name.isNullOrEmpty() || user.salary == null ) {
            _isFormValid.postValue("Empty fields!")

        } else {
            // pass data to repo
            repository.saveUserData(user)
        }
    }

}