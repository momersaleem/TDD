package com.tws.tdd

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class LoginValidatorTest {

    @Test
    fun `empty email is invalid`() {
        assertFalse(LoginValidator.isValidEmail(""))
    }

    @Test
    fun `email without at sign is invalid`() {
        assertFalse(LoginValidator.isValidEmail("alitest.com"))
    }

    @Test
    fun `valid email is accepted`() {
        assertTrue(LoginValidator.isValidEmail("ali@test.com"))
    }

    @Test
    fun `short password is invalid`() {
        assertFalse(LoginValidator.isValidPassword("abc12"))
    }

    @Test
    fun `password without digit is invalid`() {
        assertFalse(LoginValidator.isValidPassword("abcdefgh"))
    }

    @Test
    fun `strong password is valid`() {
        assertTrue(LoginValidator.isValidPassword("abcd1234"))
    }
}