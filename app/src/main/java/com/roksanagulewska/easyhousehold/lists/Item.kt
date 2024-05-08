package com.roksanagulewska.easyhousehold.lists

import androidx.room.Entity

@Entity("items")
data class Item(override val name: String, override val authorId: Long, override val listId: Long) : ElementOfList(name, authorId, listId) {
}