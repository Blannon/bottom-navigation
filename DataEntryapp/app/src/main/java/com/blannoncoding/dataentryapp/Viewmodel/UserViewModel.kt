package com.blannoncoding.dataentryapp.Viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.blannoncoding.dataentryapp.Database.UserInfoEntity
import com.blannoncoding.dataentryapp.Repository.UserInfoRepository
import kotlinx.coroutines.launch

class UserViewModel(private val repository: UserInfoRepository) :
 ViewModel(){
     val allWords: LiveData<List<UserInfoEntity>> =
         repository.allUsers.asLiveData()

    fun insert(userInfo:UserInfoEntity) = viewModelScope.launch {
        repository.insert(userInfo)
    }

    fun delete(userid : Int) {
        viewModelScope.launch {
            repository.deleteById(userid)
        }
    }
}