package com.example.di_3rddaggerwithmvvmapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product")
data class Products(
    val category: String,
    val description: String,
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val image: String,
    val price: Double,
    val title: String
)