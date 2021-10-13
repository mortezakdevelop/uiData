package com.example.data.dao


import android.media.SubtitleData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.data.entity.User
import com.example.data.entity.catData
import com.example.data.entity.itemData
import com.example.data.entity.titleData

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAll(category: List<titleData>)

    @Query("SELECT * FROM titleData WHERE type IN (:type)")
    suspend fun getTitleData(type: Int): List<titleData>

     @Query("SELECT * FROM subTitleData WHERE type IN (:type)")
    suspend fun getSubtitleData(type: Int): List<SubtitleData>

     @Query("SELECT * FROM catData WHERE type IN (:type)")
    suspend fun getCatData(type: Int): List<catData>

     @Query("SELECT * FROM itemData WHERE type IN (:type)")
    suspend fun getItemData(type: Int): List<itemData>


}

