package com.example.disintegrator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button scanButton = findViewById(R.id.ScanButton);
        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToScanView(view);
            }
        });
    }

    private void goToScanView(View view) {
        System.err.println("Start goToScanView");
        Intent scanView = new Intent(view.getContext(), ScannerActivityView.class);
        view.getContext().startActivity(scanView);
    }
}