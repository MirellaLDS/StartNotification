package com.example.mirella.startnotification

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class MyExternalService : Service() {

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {

//        var test = intent.extras["KEY1"].toString()

        Toast.makeText(applicationContext, "Teste de serviço", Toast.LENGTH_LONG).show()

        //TODO do something useful
        return Service.START_NOT_STICKY
    }

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}
