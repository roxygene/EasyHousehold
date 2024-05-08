package com.roksanagulewska.easyhousehold.db

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.roksanagulewska.easyhousehold.lists.List
import com.roksanagulewska.easyhousehold.lists.ElementOfList

interface ListDao {

    @Insert
    suspend fun insert(element: ElementOfList) {
    }

    @Delete
    suspend fun delete(element: ElementOfList) {
    }

    @Query("SELECT * FROM shopping_lists UNION SELECT * FROM task_lists UNION SELECT * FROM custom_lists")
    fun getAllLists() : LiveData<List<List<ElementOfList>>>

    //TODO: add get for every kind of list separately
}