package com.example.birthday

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class greetingpage : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greetingpage)
        val name=intent.getStringExtra(NAME_EXTRA)
        val myTextView:TextView = findViewById<TextView>(R.id.birthdayview)
        myTextView.text = "HAPPY BIRTHDAY $name"
    }
}