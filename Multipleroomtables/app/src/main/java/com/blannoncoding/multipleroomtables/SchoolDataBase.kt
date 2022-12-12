
package com.blannoncoding.multipleroomtables

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.blannoncoding.multipleroomtables.Entities.Director
import com.blannoncoding.multipleroomtables.Entities.Relations.StudentSubjectCrossRef
import com.blannoncoding.multipleroomtables.Entities.School
import com.blannoncoding.multipleroomtables.Entities.Student
import com.blannoncoding.multipleroomtables.Entities.Subject
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.internal.synchronized
import kotlinx.coroutines.withContext
import kotlin.coroutines.coroutineContext

@Database(
    entities = [
        School::class,
        Student::class,
        Director:: class,
        Subject::class,
        StudentSubjectCrossRef::class
    ],

    version = 1
)

abstract class SchoolDatabase : RoomDatabase() {

    abstract val schoolDao: SchoolDao

    companion object {
        @Volatile
        private var INSTANCE: SchoolDatabase? = null

        @OptIn(InternalCoroutinesApi::class)
        fun getInstance(context: Context): SchoolDatabase {
            synchronized(this) {
                return INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    SchoolDatabase::class.java,
                    "school_db"
                ).build().also {
                    INSTANCE = it
                }
            }
        }
    }
}
