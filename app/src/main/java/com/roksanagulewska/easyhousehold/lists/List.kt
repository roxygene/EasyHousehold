package com.roksanagulewska.easyhousehold.lists

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
abstract class List<ElementOfList>(
    open val name: String,
    open val authorId : Long){
    @PrimaryKey(autoGenerate = true) val listId : Long = 1
    var size = 0

    fun addElement(element: ElementOfList) {
        //TODO
    }

    fun deleteElement(element: ElementOfList) {
    //TODO: Save id of user who deleted
    }

}