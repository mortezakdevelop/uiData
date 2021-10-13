package com.example.data.db


import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.dao.UserDao
import com.example.data.entity.catData
import com.example.data.entity.itemData
import com.example.data.entity.subTitleData
import com.example.data.entity.titleData


@Database(
    entities = [
        titleData::class, subTitleData::class, catData::class, itemData::class,
    ], version = 1
)

abstract class AppDatabase : RoomDatabase() {
    abstract fun listDao(): UserDao
}


