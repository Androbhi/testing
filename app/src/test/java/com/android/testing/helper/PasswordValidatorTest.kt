package com.android.testing.helper

import org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class PasswordValidatorTest {

    private lateinit var passwordValidator: PasswordValidator
    @Before
    fun setUp() {
        passwordValidator = PasswordValidator()
    }

    @Test
    fun `False if password is empty`(){
        val result = passwordValidator.isValidPassword("")
        assertEquals(false, result)
    }

    @Test
    fun `False if password is less than 6 characters`(){
        val result = passwordValidator.isValidPassword("abc")
        assertEquals(false, result)
    }


    @Test
    fun `False if password is greater than 15 characters`(){
        val result = passwordValidator.isValidPassword("abcsldjsdlfjsdlijsdviljlsadfij")
        assertEquals(false, result)
    }

    @Test
    fun `True if password is less than 15  and greater than 6 characters`(){
        val result = passwordValidator.isValidPassword("abcd1234")
        assertEquals(true, result)
    }
}