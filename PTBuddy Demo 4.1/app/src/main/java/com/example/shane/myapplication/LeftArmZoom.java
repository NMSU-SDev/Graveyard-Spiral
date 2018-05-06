package com.example.shane.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LeftArmZoom extends AppCompatActivity {

    //github upload cd AndroidStudioProjects/MyApplication
    //git clone https://github.com/shanegrayson/Project-alpha
    //cp -r MyApplication Project-alpha
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zoom_left_arm);

        setTitle("PTBuddy: Left Arm");

        /* These create button objects for the click listeners down below */
        Button returnHomeBtn = findViewById(R.id.returnHomeMA);
        Button leftArmVid = findViewById(R.id.leftArmVideo);

        /*
        This is an action for our buttons, so whenever a button is click, the program
        is "listening" for a click input from the user. When clicked a new "intent" is
        created which allows access to another activitiy.
         */
        returnHomeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent returnIntent = new Intent(getApplicationContext(), PTBuddy.class);
                returnIntent.putExtra("com.example.shane.myapplication.PTBuddy", "");
                returnIntent.setFlags(returnIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(returnIntent);

            }
        });

        leftArmVid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent YTPlayer = new Intent(getApplicationContext(), YTPlayerArms.class);
                YTPlayer.putExtra("com.example.shane.myapplication.YTPlayerArms", "");
                YTPlayer.setFlags(YTPlayer.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(YTPlayer);
            }
        });

    }
}
