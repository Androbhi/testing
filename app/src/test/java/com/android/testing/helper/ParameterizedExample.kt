package com.android.testing.helper

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized


@RunWith(Parameterized::class)
class ParameterizedExample(
    private val input: String,
    private val expectedResult: Boolean
) {

    @Test
    fun test(){

        val helper = Helper()
        val result =  helper.isPalindrome(input)
        assertEquals(expectedResult, return)
    }

    companion object{
        @JvmStatic
        @Parameterized.Parameters(name = "{index}: {0} is palindrome: {1}")
        fun data(): List<Array<Any>>{
            return listOf(
                arrayOf("hello", false),
                arrayOf("level", true),
                arrayOf("",true),
                arrayOf("q", true)
            )
        }
    }

}