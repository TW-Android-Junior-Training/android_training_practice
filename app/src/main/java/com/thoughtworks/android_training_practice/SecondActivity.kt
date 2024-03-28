package com.thoughtworks.android_training_practice

import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    private val editTextView: EditText by lazy { findViewById(R.id.edit_text_view) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        editTextView.append("SecondActivity:-onCreate\n")
        println("SecondActivity:-onCreate\n")
    }

    override fun onResume() {
        super.onResume()
        editTextView.append("SecondActivity:-onResume\n")
        println("SecondActivity:-onResume\n")
        println("*************************")
    }

    override fun onRestart() {
        super.onRestart()
        editTextView.append("SecondActivity:-onRestart\n")
        println("SecondActivity:-onRestart\n")
    }

    override fun onPause() {
        super.onPause()
        editTextView.append("SecondActivity:-onPause\n")
        println("SecondActivity:-onPause\n")
        println("*************************")
    }

    override fun onStop() {
        super.onStop()
        editTextView.append("SecondActivity:-onStop\n")
        println("SecondActivity:-onStop\n")
        println("*************************")
    }

    override fun onStart() {
        super.onStart()
        editTextView.append("SecondActivity:-onStart\n")
        println("SecondActivity:-onStart\n")
    }

    override fun onDestroy() {
        super.onDestroy()
        editTextView.append("SecondActivity:-onDestroy\n")
        println("SecondActivity:-onDestroy\n")
    }
}