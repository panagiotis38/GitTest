package com.example.gittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"This is the original version",Toast.LENGTH_SHORT).show()
        Toast.makeText(this,"Some change was performed",Toast.LENGTH_SHORT).show()
        Toast.makeText(this,"Can you pull this?",Toast.LENGTH_SHORT).show()
    }
}
