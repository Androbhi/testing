package com.android.testing

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val tvName = findViewById<EditText>(R.id.etName)
        val tvDescription = findViewById<EditText>(R.id.etDescription)

        btnSubmit.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("message", "${tvName.text} ${tvDescription.text}")
            startActivity(intent)
        }

    }
}