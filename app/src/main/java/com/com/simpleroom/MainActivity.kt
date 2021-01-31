package com.com.simpleroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = Room.databaseBuilder(applicationContext,StudentDatabase::class.java,"student-database")
            .allowMainThreadQueries().build()

        val studentDao = database.studentDao()

        val students = studentDao.getAllStudents()

        if(students.isEmpty()){
            for(i in 1..100)
                studentDao.addStudent(Student("Przemysław","Stokłosa_$i"))
        }

        for(student in students) {
            Log.v("MainActivity",student.toString())
        }

    }
}