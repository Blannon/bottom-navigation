package com.blannoncoding.dataentryapp.Viewmodel

import android.app.Application
import com.blannoncoding.dataentryapp.Database.UserInfoDatabase
import com.blannoncoding.dataentryapp.Repository.UserInfoRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class UserApplication : Application(){

    private val applicationScope = CoroutineScope(SupervisorJob())
    private val database by lazy { UserInfoDatabase.getDatabase(this,  applicationScope) }
    val repository by lazy { UserInfoRepository(database.dataEntryDao())
    }
}