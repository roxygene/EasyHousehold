package com.roksanagulewska.easyhousehold.lists

data class Task(override val name: String, override val authorId: Long) : ElementOfList(name, authorId) {
    var asigneeId : Int

    init {
        //TODO if else with adding asignee
        asigneeId = NOBODY
    }

}