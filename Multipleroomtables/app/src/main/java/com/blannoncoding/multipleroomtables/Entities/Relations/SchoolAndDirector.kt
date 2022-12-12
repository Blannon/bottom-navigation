package com.blannoncoding.multipleroomtables.Entities.Relations

import androidx.room.Embedded
import androidx.room.Relation
import com.blannoncoding.multipleroomtables.Entities.Director
import com.blannoncoding.multipleroomtables.Entities.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)
