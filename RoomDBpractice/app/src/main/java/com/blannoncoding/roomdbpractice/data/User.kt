package com.blannoncoding.roomdbpractice.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "User_Table")
data class User(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val FirstName : String,
    val LastName : String,
    val Age : Int
)
