package ru.gonchar17narod.inversetests

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isSelected
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class UserInterfaceInstrumentedTest {

    @get:Rule
    val activityActivityTestRule: ActivityTestRule<MainActivity> =
        ActivityTestRule(MainActivity::class.java)

    @Test
    fun clickButtonNavHome() {
        onView(withId(R.id.navigation_home))
            .perform(click())
            .check(matches(isSelected()))
    }

    @Test
    fun clickButtonNavDashboard() {
        onView(withId(R.id.navigation_dashboard))
            .perform(click())
            .check(matches(isSelected()))
    }

    @Test
    fun clickButtonNavNotifications() {
        onView(withId(R.id.navigation_notifications))
            .perform(click())
            .check(matches(isSelected()))
    }
}
