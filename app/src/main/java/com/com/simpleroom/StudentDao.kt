package com.com.simpleroom

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface StudentDao {
    @Query("SELECT * from student")
    fun getAllStudents():List<Student>

    @Insert
    fun addStudent(student: Student)
}