package com.example.homework03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Button btOpenActB = findViewById(R.id.btOpenActB);

        btOpenActB.setOnClickListener(view -> {
            Intent intent=new Intent(this, ActivityB.class);
            startActivity(intent);
        });
    }
}