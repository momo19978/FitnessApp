package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_page);

        Button backWorkoutButton = findViewById(R.id.backWorkoutButton);
        Button chestWorkoutButton = findViewById(R.id.chestWorkoutButton);
        Button legWorkoutButton = findViewById(R.id.legWorkoutButton);
        Button goBackButton = findViewById(R.id.goBackButton);

        backWorkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProPage.this, ProBackWorkoutActivity.class));
            }
        });

        chestWorkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProPage.this, ProChestWorkoutActivity.class));
            }
        });

        legWorkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProPage.this, ProLegWorkoutActivity.class));
            }
        });

        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProPage.this, Exsercisefragment.class));
                finish();
            }
        });
    }
}
