package com.android.testing.helper

class PasswordValidator {

    fun isValidPassword(password: String): Boolean{
        if(password.isEmpty()){
            return false
        }

        if((password.length in 6..15).not()){
            return false
        }

        return true
    }

}