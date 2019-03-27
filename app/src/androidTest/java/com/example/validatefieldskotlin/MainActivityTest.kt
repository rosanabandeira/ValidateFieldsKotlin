package com.example.validatefieldskotlin

import android.app.LauncherActivity
import android.os.Parcel
import android.os.Parcelable
import android.service.autofill.Validators.not
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.*
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.intent.Intents
import android.support.test.espresso.intent.Intents.intended
import android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.support.v4.app.AppLaunchChecker
import android.widget.EditText
import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)


    @Before
    fun setUp() {


    }

    @After
    fun tearDown() {


    }

    @Test
    fun onView() {

        Intents.init();
        onView(withId(R.id.editTextId)).perform(typeText("17956513855"))
        onView(withText("179.565.138-55")).check(matches(isDisplayed()))
        onView(withId(R.id.editTextPhone)).perform(typeText("111111111111"))
        onView(withId(R.id.editTextEmail)).perform(typeText("rosana@brq.com.br"))

        var matcher = hasComponent(SecondActivity::class.java.name)

        onView(withId(R.id.button)).perform(closeSoftKeyboard(), click(actionWithAssertions(click())))

        intended(matcher)

        Intents.release()



    }

    @Test
    fun invalidateFieldCpf() {
        onView(withId(R.id.editTextId)).perform(typeText("0000000000"), closeSoftKeyboard())
        onView(withId(R.id.button)).perform(click())
        onView(withId(R.id.editTextId)).check(matches(hasErrorText("CPF Inválido")))


    }

    @Test
    fun invalidateFieldPhone() {
        onView(withId(R.id.editTextId)).perform(typeText("17956513855"))
        onView(withId(R.id.editTextPhone)).perform(typeText(" "), closeSoftKeyboard())
        onView(withId(R.id.button)).perform(click())
        onView(withId(R.id.editTextPhone)).check(matches(hasErrorText("Telefone Inválido")))
    }

    @Test
    fun invalidateFieldEmail() {
        onView(withId(R.id.editTextId)).perform(typeText("17956513855"))
        onView(withId(R.id.editTextPhone)).perform(typeText("00000000000"))
        onView(withId(R.id.editTextEmail)).perform(typeText(" "))
        onView(withId(R.id.button)).perform(closeSoftKeyboard(), click(actionWithAssertions(click())))
        onView(withId(R.id.editTextEmail)).check(matches(hasErrorText("Email Inválido")))

    }

}