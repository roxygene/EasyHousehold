package com.roksanagulewska.easyhousehold.lists

import androidx.room.PrimaryKey

abstract class ElementOfList(open val name: String, open val authorId: Long, open val listId: Long) {
    companion object {
        const val NOBODY = 0
    }
    @PrimaryKey(autoGenerate = true) val elementId : Long = 1
    var status = StatusOfListElement.TODO
    var highImportance = false
    var description = ""
    var doerId = NOBODY

    fun markAsDone() {
        //TODO save id of user who marked
    }

    fun markAsNotDone() {
        //TODO: only user who marked as done can do this
    }

}