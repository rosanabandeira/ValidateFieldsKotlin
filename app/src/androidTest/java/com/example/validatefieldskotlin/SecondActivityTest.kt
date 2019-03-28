package com.example.validatefieldskotlin

import android.support.test.espresso.intent.Intents
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.junit.runner.RunWith
import android.content.Intent
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withText


@RunWith(AndroidJUnit4::class)
@LargeTest
class SecondActivityTest {

    @get:Rule
    var mActivityRule: ActivityTestRule<SecondActivity> =
        object : ActivityTestRule<SecondActivity>(SecondActivity::class.java) {

            override fun getActivityIntent(): Intent {
                val intent = Intent()
                intent.putExtra("cpf", "11111111111")
                intent.putExtra("phone", "0000000000")
                intent.putExtra("email", "nada@nada")
                return intent
            }
        }


    @Test
    fun validateCpf() {
        onView(withText("11111111111")).check(matches(isDisplayed()))

    }

    @Test
    fun validatePhone() {
        onView(withText("0000000000")).check(matches(isDisplayed()))

    }

    @Test
    fun validateEmail() {
        onView(withText("nada@nada")).check(matches(isDisplayed()))

    }
}