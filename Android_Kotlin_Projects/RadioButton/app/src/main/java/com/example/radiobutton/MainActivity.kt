package com.example.radiobutton


import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    lateinit var selectedsubject:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var radio = findViewById<RadioGroup>(R.id.radiogp)
        var push = findViewById<Button>(R.id.push)


        radio.setOnCheckedChangeListener { group, checkedId ->

            if (checkedId == R.id.parin) {
                //given below mathod is Toast massage for view massage on screen

                //Toast.makeText(this,"This is parin",Toast.LENGTH_SHORT).show()

                //given below mathod is to view massage in screen . For this first of all
                //create  lateinit variable
                selectedsubject = "Your Selection in Parin :"
            }
            if (checkedId == R.id.priti) {
                //given below mathod is Toast massage for view massage on screen

                // Toast.makeText(this,"This is priti",Toast.LENGTH_SHORT).show()

                //given below mathod is to view massage in screen . For this first of all
                //create  lateinit variable
                selectedsubject = "Your Selection in priti :"
            }
        }
        push.setOnClickListener {
            // given below Toast massage to view selected subject massage  on Push Button
            Toast.makeText(this@MainActivity," "+selectedsubject,Toast.LENGTH_SHORT).show()
        }
    }
}