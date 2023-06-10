package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Nutrition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);

        // Create a list of food items
        List<String> foodList = new ArrayList<>();
        foodList.add("Apple - 52 cal, 0.2g fat, 14g carbs, 2.4g fiber");
        foodList.add("Banana - 96 cal, 0.2g fat, 23g carbs, 2.6g fiber");
        foodList.add("Chicken Breast - 165 cal, 3.6g fat, 0g carbs, 0g fiber");
        foodList.add("Broccoli - 55 cal, 0.6g fat, 11g carbs, 5.2g fiber");
        foodList.add("Salmon - 206 cal, 13g fat, 0g carbs, 0g fiber");
        foodList.add("Spinach - 23 cal, 0.4g fat, 3.6g carbs, 2.2g fiber");
        foodList.add("Oats - 389 cal, 6.9g fat, 66g carbs, 10g fiber");
        foodList.add("Eggs - 155 cal, 10.6g fat, 1.1g carbs, 0g fiber");
        foodList.add("Greek Yogurt - 59 cal, 0.4g fat, 3.6g carbs, 0g fiber");
        foodList.add("Sweet Potato - 86 cal, 0.1g fat, 20g carbs, 3g fiber");
        foodList.add("Almonds - 579 cal, 49.9g fat, 21.6g carbs, 12.5g fiber");
        foodList.add("Quinoa - 120 cal, 1.9g fat, 21.3g carbs, 2.8g fiber");
        foodList.add("Cucumber - 15 cal, 0.1g fat, 3.6g carbs, 0.5g fiber");
        foodList.add("Avocado - 160 cal, 14.7g fat, 8.5g carbs, 6.7g fiber");
        foodList.add("Lentils - 116 cal, 0.4g fat, 20g carbs, 7.9g fiber");
        foodList.add("Blueberries - 57 cal, 0.3g fat, 14g carbs, 2.4g fiber");
        foodList.add("Beef Steak - 271 cal, 17g fat, 0g carbs, 0g fiber");
        foodList.add("Cottage Cheese - 98 cal, 4.3g fat, 3.6g carbs, 0g fiber");
        foodList.add("Brown Rice - 111 cal, 0.9g fat, 23g carbs, 1.8g fiber");
        foodList.add("Tomato - 18 cal, 0.2g fat, 3.9g carbs, 1.2g fiber");
        foodList.add("Peanut Butter - 588 cal, 50g fat, 20g carbs, 6g fiber");
        foodList.add("Green Beans - 31 cal, 0.2g fat, 7.1g carbs, 3.4g fiber");
        foodList.add("Tuna - 116 cal, 0.4g fat, 0g carbs, 0g fiber");
        foodList.add("Oranges - 43 cal, 0.2g fat, 11g carbs, 2.3g fiber");
        foodList.add("Whey Protein - 103 cal, 0.6g fat, 2g carbs, 0g fiber");
        foodList.add("Mushrooms - 22 cal, 0.3g fat, 3.3g carbs, 1g fiber");
        foodList.add("Whole Wheat Bread - 246 cal, 2.4g fat, 49g carbs, 7.9g fiber");
        foodList.add("Grapes - 69 cal, 0.2g fat, 18g carbs, 0.9g fiber");
        foodList.add("Pineapple - 50 cal, 0.1g fat, 13g carbs, 1.4g fiber");
        foodList.add("Cauliflower - 25 cal, 0.3g fat, 5.3g carbs, 2g fiber");
        foodList.add("Milk - 60 cal, 3.2g fat, 4.8g carbs, 0g fiber");

        // Create an ArrayAdapter to display the food items in the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, foodList);

        // Get a reference to the ListView and set the adapter
        ListView foodListView = findViewById(R.id.foodListView);
        foodListView.setAdapter(adapter);
    }
}
