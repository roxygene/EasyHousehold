package com.roksanagulewska.easyhousehold.db

import androidx.room.Database
import com.roksanagulewska.easyhousehold.lists.CustomList
import com.roksanagulewska.easyhousehold.lists.ShoppingList
import com.roksanagulewska.easyhousehold.lists.TaskList

@Database(
    entities = [ShoppingList::class, TaskList::class, CustomList::class, ],//TODO
    version = 1

)
abstract class HouseholdDatabase {
}