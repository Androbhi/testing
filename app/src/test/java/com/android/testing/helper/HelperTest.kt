package com.android.testing.helper

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {

    lateinit var helper: Helper

    @Before
    fun setup(){
        helper = Helper()
    }

    @After
    fun tearDown(){

    }

    @Test
    fun isPalindrome() {

        val isPalindrome = helper.isPalindrome("level")
        assertEquals(true, isPalindrome)
    }

    @Test
    fun `return false for hello as input`() {

        val isPalindrome = helper.isPalindrome("hello")
        assertEquals(false, isPalindrome)
    }
}