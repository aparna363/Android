package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button; // Added missing import
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_3);

        Button btnOpenWeb = findViewById(R.id.btnOpenWeb);
        btnOpenWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // Fixed typo (onClick)
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com")); // Fixed capitalization (setData)
                startActivity(intent);
            }
        });
    }
}
