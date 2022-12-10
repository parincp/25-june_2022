package com.example.sendsms

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.SEND_SMS),1)

        var edContact = findViewById<EditText>(R.id.edContactNumber)
        var edmassage = findViewById<EditText>(R.id.edMassageBox)
        var smssendbtn = findViewById<Button>(R.id.SendButton)

        smssendbtn.setOnClickListener {

            var number = edContact.text.toString()
            var msg = edmassage.text.toString()

            var smsManager : SmsManager = SmsManager.getDefault()

            smsManager.sendTextMessage(number,null,msg,null,null)
            Toast.makeText(this,"Send Massage",Toast.LENGTH_LONG).show()

            //given below method for clear text after button clicked
            edContact.setText("")
            edmassage.setText("")

        }


    }
}