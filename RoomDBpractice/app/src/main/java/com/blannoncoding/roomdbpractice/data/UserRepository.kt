package com.blannoncoding.roomdbpractice.data

import androidx.lifecycle.LiveData

class UserRepository(private val UserDao: UserDao) {

    val readAllData: LiveData<User> = UserDao.readAllData()

    suspend fun addUser(User:User) {
        UserDao.addUser(User)
    }
}