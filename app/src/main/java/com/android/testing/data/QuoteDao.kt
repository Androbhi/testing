package com.android.testing.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface QuoteDao {

    @Insert
    suspend fun insertQuote(quote: Quote)

    @Delete
    suspend fun deleteQuote(quote: Quote)

    @Update
    suspend fun updateQuote(quote: Quote)

    @Query("SELECT * FROM quote")
    fun observeQuote(): Flow<List<Quote>>

    @Query("SELECT * FROM quote where id = :quoteId")
    suspend fun getQuote(quoteId: Int): Quote

}