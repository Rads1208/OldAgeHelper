package com.radhika.oldagehelper.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.radhika.oldagehelper.R

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        //open ? activty layout file
        val btn = findViewById<MaterialButton>(R.id.btnGetStarted)
        btn.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}