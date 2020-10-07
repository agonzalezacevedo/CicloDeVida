package com.alex.ciclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TODO hacer los inicios de onStart

        //Imprimimos en la ventana del "Logcat"
        Log.d("Estado","estoy en el onCreate")
    }
    override fun onStart() {
        super.onStart()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","estoy en el onStart")
    }

    override fun onResume() {
        super.onResume()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","estoy en el onResume")
    }

    override fun onPause() {
        super.onPause()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","estoy en el onPause")
    }

    override fun onStop() {
        super.onStop()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","estoy en el onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","estoy en el onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","estoy en el onReStart")
    }
}