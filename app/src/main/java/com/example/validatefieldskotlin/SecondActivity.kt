package com.example.validatefieldskotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity : AppCompatActivity() {

   var cpf: String? = null
    var phone: String? = null
    var email: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        cpf = intent.getStringExtra("cpf")
        phone = intent.getStringExtra("phone")
        email = intent.getStringExtra("email")
        Log.i("pegou email", email)

        textViewCpf.text.toString()
        textViewPhone.text.toString()
        textViewEmail.text.toString()

    }
}

