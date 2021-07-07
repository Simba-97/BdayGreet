 package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayWish(view: View) {

        val name = findViewById<EditText>(R.id.nameInput)
        val greet = "Happy Birthday " + name.text
        Toast.makeText(this, greet, Toast.LENGTH_SHORT).show()
        val intent = Intent(this, BirthdayGreetingActivity::class.java)
        intent.putExtra()
        startActivity(intent)
    }
}

