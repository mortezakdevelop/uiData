package com.example.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "subTitleData")
data class subTitleData (
    @PrimaryKey
    val id:Int,
    val type:Int,
    val catTitle: String
        )