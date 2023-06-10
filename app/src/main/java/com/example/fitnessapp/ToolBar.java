package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Toast;

public class ToolBar extends AppCompatActivity {

    ImageButton Home;
    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar);


        Home = (ImageButton) findViewById(R.id.LeftIcon);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ToolBar.this, HomeActivity.class));
            }
        });


        imageButton= (ImageButton) findViewById(R.id.RightIcon);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMenu(v);
            }
        });

    }
    private  void showMenu(View v){

        PopupMenu popupMenu=new PopupMenu(ToolBar.this,v);
        popupMenu.getMenuInflater().inflate(R.menu.popupmenu,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                if(menuItem.getItemId()==R.id.firstBar)
                {
                    startActivity(new Intent(ToolBar.this,BMIcalculator.class));

                }

                if(menuItem.getItemId()==R.id.secBar)
                {
                    Toast.makeText(ToolBar.this,"You cliked it!", Toast.LENGTH_SHORT).show();
                }

                if(menuItem.getItemId()==R.id.thirdBar)
                {
                    Toast.makeText(ToolBar.this,"You cliked it!", Toast.LENGTH_SHORT).show();
                }

                  return false;
            }
        });
popupMenu.show();




}
}