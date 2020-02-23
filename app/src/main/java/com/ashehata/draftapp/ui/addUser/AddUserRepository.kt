package com.ashehata.draftapp.ui.addUser

import android.content.Context
import com.ashehata.draftapp.data.local.room.AppDatabase
import com.ashehata.draftapp.data.local.room.User
import kotlin.concurrent.thread

class AddUserRepository(val context: Context) {

    fun saveUserData(user: User) {
        // Insert user into db
        AppDatabase.getDatabase(context).userDao().addUser(user)

    }
}