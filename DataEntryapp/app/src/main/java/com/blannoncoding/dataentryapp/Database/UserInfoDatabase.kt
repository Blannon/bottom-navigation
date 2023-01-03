package com.blannoncoding.dataentryapp.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.CoroutineScope

@Database(entities = [UserInfoEntity::class], version = 1, exportSchema = false)
abstract class UserInfoDatabase :RoomDatabase(){
    abstract fun dataEntryDao():DataEntryDao

    companion object{

        @Volatile
        private var INSTANCE : UserInfoDatabase= null

        fun getDatabase(ctx:Context, scope: CoroutineScope):
                UserInfoDatabase{
            return when (val temp= INSTANCE) {
                null ->synchronized(this) {
                    Room.databaseBuilder(
                        ctx.applicationContext,
                        UserInfoDatabase::class.java,
                        "user_info"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                }
                else -> temp
            }
        }
    }
}