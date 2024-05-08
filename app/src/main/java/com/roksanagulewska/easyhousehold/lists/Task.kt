package com.roksanagulewska.easyhousehold.lists

import androidx.room.Entity

@Entity("tasks")
data class Task(override val name: String, override val authorId: Long, override val listId: Long) : ElementOfList(name, authorId, listId) {
    var asigneeId : Int

    init {
        //TODO if else with adding asignee
        asigneeId = NOBODY
    }

}