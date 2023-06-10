package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class ProChestWorkoutActivity extends AppCompatActivity {

    private ImageView exerciseImageView;
    private TextView exerciseNameTextView;
    private Button previousButton;
    private Button nextButton;
    private TextView timerTextView;
    private CountDownTimer exerciseCountDownTimer;
    private int currentExerciseIndex = 0;
    private boolean isTimerRunning = false;

    private final int[] exerciseImages = {R.drawable.pushup, R.drawable.pullup, R.drawable.squal};
    private final String[] exerciseNames = {"Push ups", "pull ups", "Squats"};
    private final int[] exerciseDurations = {30, 30, 30};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ready_workout);

        exerciseImageView = findViewById(R.id.exerciseImageView);
        exerciseNameTextView = findViewById(R.id.exerciseNameTextView);
        previousButton = findViewById(R.id.previousButton);
        nextButton = findViewById(R.id.nextButton);
        timerTextView = findViewById(R.id.timerTextView);
        Button startButton = findViewById(R.id.startButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startButton.setVisibility(View.GONE);
                isTimerRunning = true;
                startExerciseTimer(exerciseDurations[currentExerciseIndex]);
            }
        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentExerciseIndex > 0) {
                    currentExerciseIndex--;
                    updateExercise(currentExerciseIndex);
                }
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentExerciseIndex < exerciseNames.length - 1) {
                    currentExerciseIndex++;
                    updateExercise(currentExerciseIndex);
                } else {
                    finish();
                }
            }
        });
    }

    private void startExerciseTimer(int exerciseDuration) {
        exerciseCountDownTimer = new CountDownTimer(exerciseDuration * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                int secondsLeft = (int) (millisUntilFinished / 1000);
                String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", secondsLeft / 60, secondsLeft % 60);
                timerTextView.setText(timeLeftFormatted);
            }

            @Override
            public void onFinish() {
                if (currentExerciseIndex < exerciseNames.length - 1) {
                    currentExerciseIndex++;
                    updateExercise(currentExerciseIndex);
                } else {
                    finish();
                }
            }
        }.start();
    }

    private void updateExercise(int exerciseIndex) {
        exerciseImageView.setImageResource(exerciseImages[exerciseIndex]);
        exerciseNameTextView.setText(exerciseNames[exerciseIndex]);
        timerTextView.setText("00:00");

        if (exerciseCountDownTimer != null) {
            exerciseCountDownTimer.cancel();
        }

        previousButton.setEnabled(exerciseIndex > 0);
        nextButton.setText(exerciseIndex == exerciseNames.length - 1 ? "Finish" : "Next");

        if (isTimerRunning) {
            startExerciseTimer(exerciseDurations[currentExerciseIndex]);
        }
    }
}
