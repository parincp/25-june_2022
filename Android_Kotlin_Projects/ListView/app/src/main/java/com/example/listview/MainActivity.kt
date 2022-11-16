package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv = findViewById<ListView>(R.id.list)

        tv.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this@MainActivity,""+tv.getItemAtPosition(position),Toast.LENGTH_SHORT).show()

        }

    }
}