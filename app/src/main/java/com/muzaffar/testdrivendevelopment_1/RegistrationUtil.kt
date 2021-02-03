package com.muzaffar.testdrivendevelopment_1

object RegistrationUtil {

    private val existUsers = listOf("Salman", "Shahrukh", "Ameer")

    /**
     * input is not valid of
     * ...username/password is empty
     * ...username is already taken
     * ...the confirmed password is not same as password
     * ...the password contains less than 2 digits
     */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()) return false
        if (username in existUsers) return false
        if (password != confirmPassword) return false
        if (password.count { it.isDigit() } < 2) return false
        return true
    }

}