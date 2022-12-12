package com.blannoncoding.multipleroomtables.Entities.Relations

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.Relation


@Entity
data class StudentSubjectCrossRef(
    @Embedded val school: String,
    @Relation(
        parentColumn= "schoolName",
        entityColumn= "schoolName"
    )
    val student: String
)
