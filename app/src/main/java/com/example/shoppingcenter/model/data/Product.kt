package com.example.shoppingcenter.model.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Product(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "product_code") val productCode: String?,
    @ColumnInfo(name = "product_name") val productName: String?,
    @ColumnInfo(name = "product_price") val productPrice: Float?,
    @ColumnInfo(name = "product_image_url") val productImageUrl: String?)