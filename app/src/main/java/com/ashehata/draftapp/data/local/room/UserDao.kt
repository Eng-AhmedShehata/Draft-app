package com.ashehata.draftapp.data.local.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {

    @Query("SELECT * FROM user")
    fun getAllUsers(): LiveData<List<User>>

    @Insert
    fun addUser(user: User)

    @Delete
    fun deleteUser(user: User)
}