package com.android.testing.helper

class StringReverser {

    fun reverseTheString(stringToBeReversed: String): String {

        var i = 0
        var j = stringToBeReversed.length - 1
        var stringBuilder = StringBuilder()

        while (j >= 0) {
            stringBuilder.append(stringToBeReversed[j])
            j--
        }

        return stringBuilder.toString()
    }

}