package com.example.shane.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LeftHandZoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zoom_left_hand);

        setTitle("PTBuddy: Left Hand");

        /* These create button objects for the click listeners down below */
        Button returnHomeBtn = findViewById(R.id.returnHomeBtn);
        Button backBtn = findViewById(R.id.backBtn);
        Button leftHandVid = findViewById(R.id.leftHandVideo);

        /* trying to global track a variable throughtout the program */
<<<<<<< HEAD
        /*
=======
>>>>>>> origin/master
        final int key;
        Bundle extras = getIntent().getExtras();
        GlobalTracker userTracker = new GlobalTracker();
        userTracker.setGlobalVariable(extras.getInt("key"));
        Toast.makeText(LeftHandZoom.this, "TRACKED: " + userTracker.getGlobalVariable(), Toast.LENGTH_LONG).show();
        key = userTracker.setGlobalVariable(userTracker.getGlobalVariable());
<<<<<<< HEAD
        */
=======
>>>>>>> origin/master

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

        backBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent returnIntent = new Intent(getApplicationContext(), LeftArmZoom.class);
                returnIntent.putExtra("com.example.shane.myapplication.LeftArmZoom", "");
                returnIntent.setFlags(returnIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(returnIntent);

            }
        });

        leftHandVid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent returnIntent = new Intent(getApplicationContext(), YouTubeVideoPlayer.class);
                returnIntent.putExtra("com.example.shane.myapplication.YouTubeVideoPlayer", "");
                returnIntent.setFlags(returnIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(returnIntent);
            }
        });
    }
}
