package com.roksanagulewska.easyhousehold.lists

import androidx.room.Entity

@Entity("custom-lists")
data class CustomList(override val name: String, override val authorId: Long) : List(name, authorId) {


}
