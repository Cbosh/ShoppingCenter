package com.example.shoppingcenter.model.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Sales (@PrimaryKey val uid: Int,
                  @ColumnInfo(name = "customer_code") val customerCode: String?,
                  @ColumnInfo(name = "product_code") val productCode: String?,
                  @ColumnInfo(name = "number_of_items_bought") val numberOfItemsBought: Int?)