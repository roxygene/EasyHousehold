package com.roksanagulewska.easyhousehold.lists

import androidx.room.Entity

@Entity("task_lists")
class TaskList(name: String, authorId: Long) : List<Any?>(name, authorId) {
    var isRecurring = false
    var competitionMode = false
    //how often?
    //if not reccuring it can have deadline

}