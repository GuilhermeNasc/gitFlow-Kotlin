package com.example.livetouch.hellogitflow.common

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.livetouch.hellogitflow.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("Commit", "outra funcionalidade")
        Log.v("Commit", "firebase")
    }
}
