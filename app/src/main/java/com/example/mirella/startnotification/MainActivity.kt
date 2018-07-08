package com.example.mirella.startnotification

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //BroadCast static
        btn3.setOnClickListener {
            val intent = Intent("MY_BROADCAST_STATIC")
            intent.putExtra("KeyName", "code1id")
            intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES)
            sendBroadcast(intent)
        }

    }
}
