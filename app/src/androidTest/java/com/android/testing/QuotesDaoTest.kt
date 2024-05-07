package com.android.testing

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import app.cash.turbine.test
import com.android.testing.data.Quote
import com.android.testing.data.QuoteDao
import com.android.testing.data.QuoteDataBase
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class QuotesDaoTest {

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()


    private lateinit var database: QuoteDataBase
    private lateinit var dao: QuoteDao

    @Before
    fun setup() {
        database = Room.inMemoryDatabaseBuilder(
            ApplicationProvider.getApplicationContext(),
            QuoteDataBase::class.java
        ).allowMainThreadQueries().build()
        dao = database.dao()
    }


    @Test
    fun insertedQuoteShouldExistInTheRetrievedList() = runBlocking {
        val quote = Quote(0, "Quote 1")
        dao.insertQuote(quote)

        dao.observeQuote().test {
            val quoteList = awaitItem()
            Assert.assertEquals(1, quoteList.size)
            cancel()
        }
    }

//    @After
//    fun tearDown() {
//        database.close()
//    }

}