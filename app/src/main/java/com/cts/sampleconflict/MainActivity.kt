package com.cts.sampleconflict

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sample_tv.setOnClickListener {

           val i= Intent(this@MainActivity,FirstClass::class.java)
            startActivity(i)


        }
    }
}
