package com.com.simpleroom

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Teacher(@PrimaryKey(autoGenerate = true) val id: Int? = null) {
}