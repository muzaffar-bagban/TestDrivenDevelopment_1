package com.muzaffar.testdrivendevelopment_1

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "something",
            "something"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correct repeated password return true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Muzaffar",
            "something12",
            "something12"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `empty password return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Muzaffar",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password and confirm password do not match return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Muzaffar",
            "something",
            "something5"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than 2 digits return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Muzaffar",
            "something",
            "something"
        )
        assertThat(result).isFalse()
    }

}