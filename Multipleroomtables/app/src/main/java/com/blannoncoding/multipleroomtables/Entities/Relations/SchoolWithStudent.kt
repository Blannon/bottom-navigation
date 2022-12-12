package com.blannoncoding.multipleroomtables.Entities.Relations

import androidx.room.Embedded
import androidx.room.Relation
import com.blannoncoding.multipleroomtables.Entities.School
import com.blannoncoding.multipleroomtables.Entities.Student

data class SchoolWithStudent(
    @Embedded val school: School,
    @Relation(
        parentColumn= "schoolName",
        entityColumn= "schoolName"
    )
    val student: List<Student>
)
