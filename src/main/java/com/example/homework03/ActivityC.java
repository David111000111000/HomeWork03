package com.example.homework03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        Button btOpenActAFromC = findViewById(R.id.btOpenActAFromC);

        btOpenActAFromC.setOnClickListener(view -> {
            Intent intent=new Intent(this, ActivityA.class);
            startActivity(intent);
        });

        Button btOpenActD = findViewById(R.id.btOpenActD);

        btOpenActD.setOnClickListener(view -> {
            Intent intent=new Intent(this, ActivityD.class);
            startActivity(intent);
        });

        //btCloseActC

        Button btCloseActC = findViewById(R.id.btCloseActC);

        btCloseActC.setOnClickListener(view -> {
            Intent intent=new Intent(this, ActivityB.class);
            startActivity(intent);
        });

        //btCloseStack
        Button btCloseStack = findViewById(R.id.btCloseStack);

        btCloseStack.setOnClickListener(view -> {
            finishAffinity();
        });
    }
}