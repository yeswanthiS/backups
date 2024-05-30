package com.example.apiprojects;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Get the intent that started this activity
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            // Extract the details from the intent
            String name = extras.getString("name");
            String password=extras.getString("password");
            String address = extras.getString("address");

            // Display the details in TextViews
            TextView textViewName = findViewById(R.id.textViewName);
            textViewName.setText("Name: " + name);
            TextView textViewpass = findViewById(R.id.textViewPassword);
            textViewpass.setText("Password: " + password);
            TextView textViewAddress = findViewById(R.id.textViewAddress);
            textViewAddress.setText("Address: " + address);
        }
    }
}