package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BegginerPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begginer_page);

        Button backWorkoutButton = findViewById(R.id.backWorkoutButton);
        Button chestWorkoutButton = findViewById(R.id.chestWorkoutButton);
        Button legWorkoutButton = findViewById(R.id.legWorkoutButton);

        backWorkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BegginerPage.this, EasyBackWorkoutActivity.class));
            }
        });

        chestWorkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BegginerPage.this, EasyChestWorkoutActivity.class));
            }
        });

        legWorkoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BegginerPage.this, EasyLegWorkoutActivity.class));
            }
        });
    }
}
