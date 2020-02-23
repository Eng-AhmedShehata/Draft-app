package com.ashehata.draftapp.data.local.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User(
         @PrimaryKey val id: Int,
         @ColumnInfo(name = "name") val name:String?,
         @ColumnInfo(name = "salary") val salary: Int?
)
