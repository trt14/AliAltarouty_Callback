package com.example.callback

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val TAG = "Activity1"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast(this,"onCreate Activity 1")
        Log.d(TAG, "onCreate:")
        val btnstartsecondact = findViewById<Button>(R.id.btnactivity2)
        btnstartsecondact.setOnClickListener(object :  View.OnClickListener {
            override fun onClick(v: View?) {

                val intent = Intent(this@MainActivity,Main2::class.java)
                startActivity(intent)

            }

        })
    }

    override fun onStart() {
        super.onStart()
        showToast(this,"onStart Activity 1")
        Log.d(TAG, "onStart: ")

    }

    override fun onResume() {
        super.onResume()
        showToast(this,"onResume Activity 1")
        Log.d(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        showToast(this,"onPause Activity 1")
        Log.d(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        showToast(this,"onStop Activity 1")
        Log.d(TAG, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        showToast(this,"onDestroy Activity 1")
        Log.d(TAG, "onDestroy: ")
    }

    fun showToast(context: Context,state:String)
    {
        Toast.makeText(context,state,Toast.LENGTH_SHORT).show()
    }

}