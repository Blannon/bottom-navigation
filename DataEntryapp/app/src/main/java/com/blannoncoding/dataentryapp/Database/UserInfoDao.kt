package com.blannoncoding.dataentryapp.Database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface UserInfoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(UserInfo:UserInfoEntity)

    @Query("SELECT * FROM user_info")
    fun  getAllUsers(): Flow<List<UserInfoEntity>>

    @Query("delete from user_info where user_id=:u_id")
    suspend fun deleteById(u_id: Int)
}