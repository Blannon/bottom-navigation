package com.blannoncoding.dataentryapp.Database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName="user_info", indices = [Index(value = ["email","name"], unique = true)])
data class UserInfoEntity(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name="user_id")
    val id :Int= 0,
    val name: String,
    val email: String
)
