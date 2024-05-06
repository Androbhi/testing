package com.android.testing.helper

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class StringReverserTest{

    private lateinit var stringReverser: StringReverser
    @Before
    fun setup(){
        stringReverser = StringReverser()
    }

    @Test
    fun `True if empty string is equal to empty string`(){
        val result = stringReverser.reverseTheString("")
        assertEquals("", "")
    }

    @Test
    fun `True if A == A`(){
        val result = stringReverser.reverseTheString("A")
        assertEquals("A", result)
    }
    @Test
    fun `True if ABC == CBA`(){
        val result = stringReverser.reverseTheString("ABC")
        assertEquals("CBA", result)
    }

    @Test
    fun `False if A == C`(){
        val result = stringReverser.reverseTheString("A")
        assertEquals(false, result == "C")
    }

}