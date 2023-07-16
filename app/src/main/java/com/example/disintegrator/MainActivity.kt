package com.example.disintegrator

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val scanButton = findViewById<Button>(R.id.ScanButton)
        scanButton.setOnClickListener { view -> goToScanView(view) }
    }

    private fun goToScanView(view: View) {
        System.err.println("Start goToScanView")
        val scanView = Intent(view.context, ScannerActivityView::class.java)
        view.context.startActivity(scanView)
    }
}