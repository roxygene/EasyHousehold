package com.roksanagulewska.easyhousehold.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.roksanagulewska.easyhousehold.lists.ElementOfList
import com.roksanagulewska.easyhousehold.lists.List

@Dao
class ListDao {

    @Insert
    suspend fun insert(element: ElementOfList) {}

    @Delete
    suspend fun delete(element: ElementOfList) {}

    /*@Query("SELECT * FROM ")
    fun getAllLists() : LiveData<List> {

    }*/
}