package com.blannoncoding.multipleroomtables

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.blannoncoding.multipleroomtables.Entities.Director
import com.blannoncoding.multipleroomtables.Entities.Relations.*
import com.blannoncoding.multipleroomtables.Entities.School
import com.blannoncoding.multipleroomtables.Entities.Student
import com.blannoncoding.multipleroomtables.Entities.Subject

@Dao
interface SchoolDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudent(student: Student)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubject(subject: Subject)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudentSubjectCrossRef(crossRef: StudentSubjectCrossRef)

    @Transaction
    @Query("SELECT * FROM school WHERE SchoolName= :SchoolName")
    suspend fun getSchoolAndDirectorWithSchoolName(SchoolName:String): List<SchoolAndDirector>


    @Transaction
    @Query("SELECT * FROM subject WHERE subjectName= :SubjectName")
    suspend fun getStudentofSubject(SubjectName:String): List<SubjectWithStudents>

    @Transaction
    @Query("SELECT * FROM student WHERE studentName= :studentName")
    suspend fun getSchoolWithStudent(studentName:String): List<StudentWithSubject>
}