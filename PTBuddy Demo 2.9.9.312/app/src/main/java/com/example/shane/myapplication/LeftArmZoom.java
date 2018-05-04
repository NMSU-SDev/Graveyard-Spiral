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
        Button returnActivityBtn = findViewById(R.id.returnButtonMA);
        Button returnHomeBtn = findViewById(R.id.returnHomeMA);
<<<<<<< HEAD
        //Button leftHandBtn = findViewById(R.id.leftHandBtn);
        Button leftArmVid = findViewById(R.id.leftHandVideo);
        /* trying to global track a variable throughtout the program */
        /*
        final int key, i = 0;
        Bundle extras = getIntent().getExtras();
        GlobalTracker userTracker = new GlobalTracker();
        Toast.makeText(LeftArmZoom.this, "TRACKED: " + i, Toast.LENGTH_LONG).show();
        key = i;
        */
=======
        Button leftHandBtn = findViewById(R.id.leftHandBtn);

        /* trying to global track a variable throughtout the program */
        final int key;
        Bundle extras = getIntent().getExtras();
        GlobalTracker userTracker = new GlobalTracker();
        int i = userTracker.setGlobalVariable(extras.getInt("key"));
        Toast.makeText(LeftArmZoom.this, "TRACKED: " + i, Toast.LENGTH_LONG).show();
        key = i;
>>>>>>> origin/master

        /*
        This is an action for our buttons, so whenever a button is click, the program
        is "listening" for a click input from the user. When clicked a new "intent" is
        created which allows access to another activitiy.
         */
        returnActivityBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v_1) {
                Intent returnIntent_1 = new Intent(getApplicationContext(), PTBuddy.class);
                returnIntent_1.putExtra("com.example.shane.myapplication.PTBuddy", "");
                returnIntent_1.setFlags(returnIntent_1.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(returnIntent_1);

            }
        });

        returnHomeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v_2) {
                Intent returnIntent_2 = new Intent(getApplicationContext(), PTBuddy.class);
                returnIntent_2.putExtra("com.example.shane.myapplication.PTBuddy", "");
                returnIntent_2.setFlags(returnIntent_2.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(returnIntent_2);

            }
        });

<<<<<<< HEAD
        leftArmVid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent returnIntent = new Intent(getApplicationContext(), YouTubeVideoPlayer.class);
                returnIntent.putExtra("com.example.shane.myapplication.YouTubeVideoPlayer", "");
                returnIntent.setFlags(returnIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(returnIntent);
            }
        });
        /*
=======
>>>>>>> origin/master
        leftHandBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v_1) {
                Intent startIntent_1 = new Intent(getApplicationContext(), LeftHandZoom.class);
                startIntent_1.setFlags(startIntent_1.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
<<<<<<< HEAD
                startIntent_1.putExtra("key", "");
                startActivity(startIntent_1);
            }
        });
        */
=======
                startIntent_1.putExtra("key", key);
                startActivity(startIntent_1);
            }
        });
>>>>>>> origin/master
    }
}
