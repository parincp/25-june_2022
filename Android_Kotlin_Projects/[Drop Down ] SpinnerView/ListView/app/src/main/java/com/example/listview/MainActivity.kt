package com.example.listview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv = findViewById<ListView>(R.id.list)
        var spinner = findViewById<Spinner>(R.id.spinnerlist)

        tv.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this@MainActivity,""+tv.getItemAtPosition(position),Toast.LENGTH_SHORT).show()

        }
        spinner.onItemSelectedListener=object:AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@MainActivity,""+tv.getItemAtPosition(position),Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemen}ted")
            }
        }

    }
}