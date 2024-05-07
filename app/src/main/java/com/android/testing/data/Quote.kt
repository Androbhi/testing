package com.android.testing.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quote")
data class Quote(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val quoteString: String
)
