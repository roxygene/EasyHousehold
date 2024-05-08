package com.roksanagulewska.easyhousehold.lists

import androidx.room.Entity
import com.roksanagulewska.easyhousehold.lists.List

@Entity("shopping_lists")
class ShoppingList(name: String, authorId: Long) : List<Any?>(name, authorId){

}