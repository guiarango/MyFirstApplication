package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_relative_vslinear.*

class RelativeVSLinearActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_vslinear)



        val user = intent.extras?.getString("user")
        val password = intent.extras?.getString("password")
        etNombre.setText(user)
        etPassword.setText(password)


    }
}
