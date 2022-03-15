package com.example.shoppingcenter.model.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Stock (
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "product_code") val productCode: String?,
    @ColumnInfo(name = "number_of_items_in_stock") val numberOfItemsInStock: Int?)