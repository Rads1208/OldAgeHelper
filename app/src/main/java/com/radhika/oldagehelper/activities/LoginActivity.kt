package com.radhika.oldagehelper.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.radhika.oldagehelper.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<FloatingActionButton>(R.id.btnLogin)

        loginButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}