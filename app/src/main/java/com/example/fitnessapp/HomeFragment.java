package com.example.fitnessapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class HomeFragment extends Fragment {

    private TextView tipTextView;
    private Button bmiButton;
    private Button nutritionButton;

    // Array of טיפים
    private String[] tips = {
            "Stay consistent with your workouts to see results.",
            "Set realistic goals and track your progress.",
            "Stay hydrated throughout the day.",
            "Incorporate strength training into your fitness routine.",
            "Listen to your body and give it proper rest and recovery."
            // להוסיך כאן
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        tipTextView = rootView.findViewById(R.id.tipTextView);
        bmiButton = rootView.findViewById(R.id.bmiButton);
        nutritionButton = rootView.findViewById(R.id.nutritionButton); // Initialize the button

        bmiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAnotherActivity();
            }
        });

        nutritionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNutritionActivity();
            }
        });

        // Set the random fitness tip
        displayRandomTip();

        return rootView;
    }

    public void goToAnotherActivity() {
        // Start the new activity here
        Intent intent = new Intent(getActivity(), Second_bmi.class);
        startActivity(intent);
    }

    public void goToNutritionActivity() {
        // Start the Nutrition activity here
        Intent intent = new Intent(getActivity(), Nutrition.class);
        startActivity(intent);
    }

    private void displayRandomTip() {
        // Generate a random index within the range of the tips array
        Random random = new Random();
        int index = random.nextInt(tips.length);

        // Set the randomly selected tip or quote on the tipTextView
        tipTextView.setText("Fitness Tip of the Day: " + tips[index]);
    }
}
