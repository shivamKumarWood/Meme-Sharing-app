package com.example.birthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
   //private lateinit var tv_content: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayCard(view: View) {

        val tv:TextView= findViewById(R.id.nameInput)
       // tv_content = findViewById<TextView?>(R.id.nameInput)
        var s=tv.editableText.toString()
        //Toast.makeText(this, "name is $s", Toast.LENGTH_LONG).show()
        //val name=nameInput.editableText.toString()
        val intent=Intent(this,greetingpage::class.java)
        intent.putExtra(greetingpage.NAME_EXTRA,s)
        startActivity(intent)
    }
}