package com.curso.android.app.practica.proyectofinalintento5.view

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import com.curso.android.app.practica.proyectofinalintento5.R
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testWordsComparisonUI() {
        // Simulate user input
        Espresso.onView(ViewMatchers.withId(R.id.word1EditText))
            .perform(ViewActions.typeText("manzana"))
        Espresso.onView(ViewMatchers.withId(R.id.word2EditText))
            .perform(ViewActions.typeText("manzana"))
        val perform = Espresso.onView(ViewMatchers.withId(R.id.compareButton))
            .perform(ViewActions.click())

        // Check the result
        Espresso.onView(ViewMatchers.withId(R.id.resultTextView))
            .check(ViewAssertions.matches(ViewMatchers.withText("Las palabras son iguales")))
    }

    @Test
    fun testWordsNotEqualUI() {
        // Simulate user input
        Espresso.onView(ViewMatchers.withId(R.id.word1EditText))
            .perform(ViewActions.typeText("manzana"))
        Espresso.onView(ViewMatchers.withId(R.id.word2EditText))
            .perform(ViewActions.typeText("banana"))
        Espresso.onView(ViewMatchers.withId(R.id.compareButton))
            .perform(ViewActions.click())

        // Check the result
        Espresso.onView(ViewMatchers.withId(R.id.resultTextView))
            .check(ViewAssertions.matches(ViewMatchers.withText("Las palabras no son iguales")))
    }
}