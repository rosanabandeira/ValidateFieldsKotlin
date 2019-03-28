package com.example.validatefieldskotlin

import android.widget.EditText

class ValidationUtil {


    companion object {

        fun validationEmail(text: String): Boolean {

            if (text == null) {
                return false
            }
            if (text.length < 1) {
                return false
            }
            return true
        }

    }

}