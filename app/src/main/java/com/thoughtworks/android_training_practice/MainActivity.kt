package com.thoughtworks.android_training_practice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val editTextView: EditText by lazy { findViewById(R.id.edit_text_view) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.test)
        button.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
        editTextView.append("MainActivity:-onCreate\n")
        println("MainActivity:-onCreate")
    }

    override fun onResume() {
        super.onResume()
        editTextView.append("MainActivity:-onResume\n")
        println("MainActivity:-onResume")
        println("*************************")
    }

    override fun onStart() {
        super.onStart()
        editTextView.append("MainActivity:-onStart\n")
        println("MainActivity:-onStart")
        // 执行初始化操作
//        initializeData()
        // 分配资源
//        allocateResources()
        // 更新 UI
//        updateUI()
        // 注册监听器
//        registerListeners()
        // 检查权限
//        checkPermissions()
    }

    override fun onRestart() {
        super.onRestart()
        editTextView.append("MainActivity:-onRestart\n")
        println("MainActivity:-onRestart")
    }

    override fun onPause() {
        super.onPause()
        editTextView.append("MainActivity:-onPause\n")
        println("MainActivity:-onPause")
        println("*************************")
    }

    override fun onStop() {
        super.onStop()
        editTextView.append("MainActivity:-onStop\n")
        println("MainActivity:-onStop")
        println("*************************")
    }

    override fun onDestroy() {
        super.onDestroy()
        editTextView.append("MainActivity:-onDestroy\n")
        println("MainActivity:-onDestroy\n")
    }
}