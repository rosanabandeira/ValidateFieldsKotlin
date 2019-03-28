package com.example.validatefieldskotlin

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class ValidateUtilTest {


    @Test
    fun emailValid(){
        var result = ValidationUtil.validationEmail("nada@nada ")
        assertTrue(result)
    }

    @Test
    fun emailIsNotValid(){
        var result = ValidationUtil.validationEmail(" ")
        assertTrue(result)
    }

}