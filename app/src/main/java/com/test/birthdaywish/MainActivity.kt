package com.test.birthdaywish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val buton = findViewById<Button>(R.id.buttonsend)

        buton.setOnClickListener{

            val make =editText.text.toString()
            if (make.isNotEmpty()) {

                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("name", make)
                startActivity(intent)
                editText.text.clear()
            }else{
                Toast.makeText(this,"Enter Name",Toast.LENGTH_SHORT).show()
            }
        }
    }
}