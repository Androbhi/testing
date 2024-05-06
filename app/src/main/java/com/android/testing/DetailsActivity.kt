package com.android.testing

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class DetailsActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val message = intent.getStringExtra("message")
        val tvMessage = findViewById<TextView>(R.id.tvDetails)
        tvMessage.text = message
    }
}