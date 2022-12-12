package com.example.shoppinglist.data.db.Entities

import android.icu.util.CurrencyAmount
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="shopping_item")
data class ShoppingItem(
    @ColumnInfo(name = "item_name")
    var name:String,
    @ColumnInfo(name = "item_amount")
    var amount: Int,
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? =null
}