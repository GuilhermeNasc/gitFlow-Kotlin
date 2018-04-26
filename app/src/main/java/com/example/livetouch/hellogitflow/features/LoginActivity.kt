package com.example.livetouch.hellogitflow.features

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.livetouch.hellogitflow.R
import com.example.livetouch.hellogitflow.common.MainActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnEntrar.setOnClickListener {
            val i = Intent(LoginActivity@this, MainActivity::class.java)
            startActivity(i)
            finish()
        }

    }
}
