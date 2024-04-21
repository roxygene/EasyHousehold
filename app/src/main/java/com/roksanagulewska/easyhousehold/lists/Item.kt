package com.roksanagulewska.easyhousehold.lists

data class Item(override val name: String, override val authorId: Long) : ElementOfList(name, authorId) {
}