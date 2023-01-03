package com.blannoncoding.dataentryapp.Repository

import com.blannoncoding.dataentryapp.Database.UserInfoEntity
import kotlinx.coroutines.flow.Flow

class UserInfoRepository(private val dataEntryDao:DataEntryDao) {

    val allUsers: Flow<List<UserInfoEntity>> =
        dataEntryDao.getAllUsers()

    suspend fun insert(userInfo:UserInfoEntity) {
        dataEntryDao.insert(userInfo)
    }

    suspend fun deleteById(u_id: Int) {
        dataEntryDao.deleteById(u_id)
    }
}