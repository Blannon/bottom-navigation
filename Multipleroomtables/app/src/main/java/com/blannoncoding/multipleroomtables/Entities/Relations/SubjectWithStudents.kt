package com.blannoncoding.multipleroomtables.Entities.Relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.blannoncoding.multipleroomtables.Entities.School
import com.blannoncoding.multipleroomtables.Entities.Student
import com.blannoncoding.multipleroomtables.Entities.Subject

data class SubjectWithStudents(
    @Embedded val subject: Subject,
    @Relation(
        parentColumn= "subjectName",
        entityColumn= "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val student: List<Subject>
)
