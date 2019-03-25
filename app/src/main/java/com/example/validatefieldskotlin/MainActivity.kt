package com.example.validatefieldskotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        editTextId.addTextChangedListener(Mask.mask("###.###.###-##", editTextId))
        editTextPhone.addTextChangedListener(Mask.mask("(##) #####-####", editTextPhone))


        button.setOnClickListener { view ->

            if (CPFUtil.myValidateCPF(editTextId.text.toString())) {
                editTextId.text.toString()

            } else {
                editTextId.setError("CPF Invalido")
                return@setOnClickListener
            }
            if (!isValidPhone()) {
                editTextPhone.setError("Tefone inválido")
                return@setOnClickListener
            } else {
                editTextPhone.text.toString()
            }
            if (!isValidEmail()) {
                editTextEmail.setError("Email inválido")
                return@setOnClickListener
            } else {
                editTextEmail.text.toString()


            }


            val intent = Intent(this, SecondActivity::class.java)



            startActivity(intent)


        }


    }


    fun isValidEmail(): Boolean = editTextEmail.text.isNotEmpty() &&
            Patterns.EMAIL_ADDRESS.matcher(editTextEmail.text).matches()


    fun isValidPhone(): Boolean = editTextPhone.text.isNotEmpty() &&
            Patterns.PHONE.matcher(editTextPhone.text).matches()


}









