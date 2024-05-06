package com.android.testing

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest{

    @get:Rule
    val activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun testTransition(){
            onView(withId(R.id.etName)).perform(typeText("Abhishek"))
            onView(withId(R.id.etDescription)).perform(typeText("Android developer"))
            onView(withId(R.id.btnSubmit)).perform(click())
            onView(withId(R.id.tvDetails)).check(matches(withText("Abhishek Android developer")))
    }
}