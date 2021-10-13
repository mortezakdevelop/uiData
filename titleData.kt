package com.example.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "titleData")
data class titleData(
    @PrimaryKey
    val id: Int,
    val type:Int,
    val title: String,
)
