package com.com.simpleroom

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Student::class, Teacher::class), version = 2)
abstract class StudentDatabase : RoomDatabase() {
    abstract fun studentDao() : StudentDao
}