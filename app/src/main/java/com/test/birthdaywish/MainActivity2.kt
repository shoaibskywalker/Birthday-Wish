package com.test.birthdaywish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tv = findViewById<TextView>(R.id.textv)
        val img = findViewById<ImageView>(R.id.image)

        val intent = intent.getStringExtra("name")
        tv.text= "WISH YOU A VERY HAPPY BIRTHDAY\n$intent"

        img.setOnClickListener{

            finish()
        }


    }
}