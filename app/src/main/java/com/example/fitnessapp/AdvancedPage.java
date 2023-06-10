package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdvancedPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_page);

        Button backWorkoutButton = findViewById(R.id.backWorkoutButton);
        Button chestWorkoutButton = findViewById(R.id.chestWorkoutButton);
        Button legWorkoutButton = findViewById(R.id.legWorkoutButton);
        Button goBackButton = findViewById(R.id.goBackButton);

        backWorkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdvancedPage.this, MidBackWorkoutActivity.class));
            }
        });

        chestWorkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdvancedPage.this, MidChestWorkoutActivity.class));
            }
        });

        legWorkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdvancedPage.this, MidLegWorkoutActivity.class));
            }
        });

        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AdvancedPage.this, Exsercisefragment.class));
            }
        });
    }
}
