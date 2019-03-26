package com.example.validatefieldskotlin

import android.app.LauncherActivity
import android.os.Parcel
import android.os.Parcelable
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.closeSoftKeyboard
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.runner.AndroidJUnit4
import android.support.v4.app.AppLaunchChecker
import android.widget.EditText
import androidx.test.rule.ActivityTestRule
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
     var activityTestRule = ActivityTestRule(MainActivity::class.java)



    @Before
    fun setUp() {


    }

    @After
    fun tearDown() {


    }

    @Test
    fun onView() {

        onView(withId(R.id.editTextId)).perform(typeText("179.565.138-55"))


    }
}