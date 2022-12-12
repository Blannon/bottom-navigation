package com.blannoncoding.multipleroomtables.Entities.Relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.blannoncoding.multipleroomtables.Entities.School
import com.blannoncoding.multipleroomtables.Entities.Student

data class StudentWithSubject(
    @Embedded val student: Student,
    @Relation(
        parentColumn= "studentName",
        entityColumn= "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subject: List<Student>
)
