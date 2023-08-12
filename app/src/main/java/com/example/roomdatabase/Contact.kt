package com.example.roomdatabase

import androidx.room.PrimaryKey

data class Contact(
    val firstName: String,
    val lastName: String,
    val phoneNumber: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
