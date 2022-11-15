package com.oscar.jetpackcomposewithrobolectric

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class ExampleRobolectricTest {

    @get:Rule
    val composeTestRule = createComposeRule()


    @Test
    fun `test screen text`() {
        composeTestRule.setContent {
            Greeting(name = STRING_TEST)
        }

        composeTestRule.onNodeWithText("Hello $STRING_TEST!")
            .assertIsDisplayed()
    }
}

const val STRING_TEST = "Jetpack Compose with Robolectric"