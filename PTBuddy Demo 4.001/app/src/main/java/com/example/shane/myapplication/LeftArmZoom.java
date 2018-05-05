package com.example.shane.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
            public void onClick(View v_2) {
                Intent returnIntent_2 = new Intent(getApplicationContext(), PTBuddy.class);
                returnIntent_2.putExtra("com.example.shane.myapplication.PTBuddy", "");
                returnIntent_2.setFlags(returnIntent_2.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(returnIntent_2);

            }
        });

        leftArmVid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent returnIntent = new Intent(getApplicationContext(), YTPlayerArms.class);
                returnIntent.putExtra("com.example.shane.myapplication.YTPlayerArms", "");
                returnIntent.setFlags(returnIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(returnIntent);
            }
        });

    }
}

/* trying to global track a variable throughtout the program */
        /*
        final int key, i = 0;
        Bundle extras = getIntent().getExtras();
        GlobalTracker userTracker = new GlobalTracker();
        Toast.makeText(LeftArmZoom.this, "TRACKED: " + i, Toast.LENGTH_LONG).show();
        key = i;
        */

