package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class begginerFullBody extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    private Button startButton;
    private Timer timer;
    private int currentImageIndex = 0;
    private int currentTextIndex = 0;

    private int[] imageResources = {R.drawable.pullup, R.drawable.pushup, R.drawable.squal};
    private String[] textResources = {"Do 10 push ups.", "Do 10 pull ups", "Do 10 squats"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begginer);

        imageView = findViewById(R.id.IM);
        textView = findViewById(R.id.T);
        startButton = findViewById(R.id.ST);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timer != null) {
                    timer.cancel();
                    timer = null;
                }

                timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                currentImageIndex = (currentImageIndex + 1) % imageResources.length;
                                currentTextIndex = (currentTextIndex + 1) % textResources.length;

                                imageView.setImageResource(imageResources[currentImageIndex]);
                                textView.setText(textResources[currentTextIndex]);
                            }
                        });
                    }
                }, 0, 30000);
            }
        });
    }
}