package com.example.shane.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class RightArmZoom extends AppCompatActivity {

    //github upload cd AndroidStudioProjects/MyApplication
    //git clone https://github.com/shanegrayson/Project-alpha
    //cp -r MyApplication Project-alpha
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zoom_right_arn);

        setTitle("PTBuddy: Right Arm");

        /* These create button objects for the click listeners down below */
        Button backBtn = findViewById(R.id.returnButtonMA);
        Button returnHomeBtn = findViewById(R.id.returnHomeMA);
        Button rightHandBtn = findViewById(R.id.rightHandBtn);

        /*
        This is an action for our buttons, so whenever a button is click, the program
        is "listening" for a click input from the user. When clicked a new "intent" is
        created which allows access to another activitiy.
         */
        returnHomeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent returnIntent = new Intent(getApplicationContext(), PTBuddy.class);
                returnIntent.putExtra("com.example.shane.myapplication.PTBuddy", "");
                startActivity(returnIntent);

            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent returnIntent = new Intent(getApplicationContext(), RightArmZoom.class);
                returnIntent.putExtra("com.example.shane.myapplication.RightArmZoom", "");
                startActivity(returnIntent);

            }
        });

        rightHandBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v_1) {
                Intent startIntent_1 = new Intent(getApplicationContext(), RightHandZoom.class);
                startIntent_1.putExtra("com.example.shane.myapplication.RightHandZoom",
                        "");
                startActivity(startIntent_1);
            }
        });
    }
}
