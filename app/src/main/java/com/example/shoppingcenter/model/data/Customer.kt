package com.example.shoppingcenter.model.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Customer(
    @PrimaryKey
    val uid: Int,
    @ColumnInfo(name = "customer_name") val customerName: String?,
    @ColumnInfo(name = "customer_last_name") val customerLastName: String?,
    @ColumnInfo(name = "customer_email") val customerEmail: Float?,
    @ColumnInfo(name = "customer_cell_number") val customerCellNumber: String?,
    @ColumnInfo(name = "customer_profile_url") val customerProfileUrl: String?,
    @ColumnInfo(name = "customer_gender") val customerGender: String?,
    @ColumnInfo(name = "customer_date_of_birth") val customerDateOfBirth: String?
)