package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;


public class HomeActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment= new HomeFragment();
    ProfileFragment profileFragment=new ProfileFragment();
    Exsercisefragment exsercisefragment=new Exsercisefragment();
    DiscoverFragment discoverFragment=new DiscoverFragment();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        bottomNavigationView  = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();



        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
                        return true;
                    case R.id.exsercise:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,exsercisefragment).commit();
                        return true;
                    case R.id.discover:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,discoverFragment).commit();
                        return true;
                }

                return false;
            }
        });

    }
}