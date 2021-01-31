package com.com.simpleroom

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Student(
    val name: String?,
    val surname: String?,
    @PrimaryKey(autoGenerate = true) val id: Int? = null
) {
}