package com.example.myapplication2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_relativelayout.*

class RelativeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relativelayout)

        buttonEnter.setOnClickListener {
            val myIntent = IetUser.textntent(this, RelativeVSLinearActivity::class.java)
            myIntent.putExtra("user",etUser.text)
            myIntent.putExtra("password",etContrasena.text)
            startActivity(myIntent)

        }
    }
}