package com.example.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "itemData")
data class itemData (
    @PrimaryKey
    val id:Int,
    val type:Int,
    val name: String,
    var number: String,
        )