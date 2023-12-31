package com.blannoncoding.dataentryapp

import android.app.Application
import com.blannoncoding.dataentryapp.Database.UserInfoDatabase
import com.blannoncoding.dataentryapp.Repository.UserInfoRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class UserApplication : Application(){

    // No need to cancel this scope as it'll be torn down with the process
    private val applicationScope = CoroutineScope(SupervisorJob())

    /** By using lazy the database and the repository are only created when they're needed
     * rather than when the application starts
     **/
    private val database by lazy { UserInfoDatabase.getDatabase(this) }
    val repository by lazy { UserInfoRepository(database.dataEntryDao()) }
}