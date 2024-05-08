package com.roksanagulewska.easyhousehold.lists

import androidx.room.Entity

@Entity("custom_elements")
data class CustomElement(override val name: String, override val authorId: Long, override val listId: Long) : ElementOfList(name, authorId, listId) {


}