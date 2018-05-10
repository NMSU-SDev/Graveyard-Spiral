package com.example.shane.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LeftArmZoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zoom_left_arm);

        setTitle("PTBuddy: Left Arm");

        /*
        Button object for the return home button
        Precondition: user trying to exit the application
        Postcondition: returns the user to the main of the application
         */
        Button returnHomeBtn = findViewById(R.id.returnHomeMA);
        returnHomeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent returnIntent = new Intent(getApplicationContext(), PTBuddy.class);
                returnIntent.putExtra("com.example.shane.myapplication.PTBuddy", "");
                returnIntent.setFlags(returnIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(returnIntent);

            }
        });

        /*
        Button object for the YouTube Video Player
        Precondition: user trying to access a YouTube Video
        Postcondition: Calls the YouTube player associated class
         */
        Button leftArmVid = findViewById(R.id.leftArmVideo);
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
