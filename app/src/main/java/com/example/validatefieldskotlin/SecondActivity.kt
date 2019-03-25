package com.example.validatefieldskotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity : AppCompatActivity() {

    var cpf: String? = editTextId.text.toString()
    var phone: String? = editTextPhone.text.toString()
    var email: String? = editTextEmail.text.toString()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)


        fun preencherDados( cpf: String, phone:String, email: String) {
            return
        }


    }
}
