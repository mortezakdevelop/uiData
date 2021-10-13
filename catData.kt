package com.example.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "catData")
data class catData (
    @PrimaryKey
    val id:Int,
    val type:Int,
    val category: String,

        )