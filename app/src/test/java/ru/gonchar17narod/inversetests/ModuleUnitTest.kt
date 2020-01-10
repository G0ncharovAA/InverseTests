package ru.gonchar17narod.inversetests

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.IsEqual.equalTo
import org.junit.Test
import org.junit.runner.RunWith
import ru.gonchar17narod.inversetests.ui.dashboard.DashboardViewModel
import ru.gonchar17narod.inversetests.ui.home.HomeViewModel
import ru.gonchar17narod.inversetests.ui.notifications.NotificationsViewModel
import ru.gonchar17narod.inversetests.utils.getOrAwaitValue

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ModuleUnitTest {

    @Test
    fun HomeViewModelTest() {
        //Preparations
        val homeViewModel = HomeViewModel()

        //Conducting
        val value = homeViewModel.liveText.getOrAwaitValue()

        //Assertion
        assertThat(value, equalTo(HomeViewModel.LABEL))
    }

    @Test
    fun DashboardViewModelTest() {
        //Preparations
        val dashboardViewModel = DashboardViewModel()

        //Conducting
        val value = dashboardViewModel.liveText.getOrAwaitValue()

        //Assertion
        assertThat(value, equalTo(DashboardViewModel.LABEL))
    }

    @Test
    fun NotificationsViewModelTest() {
        //Preparations
        val notificationsViewModel = NotificationsViewModel()

        //Conducting
        val value = notificationsViewModel.liveText.getOrAwaitValue()

        //Assertion
        assertThat(value, equalTo(NotificationsViewModel.LABEL))
    }
}
