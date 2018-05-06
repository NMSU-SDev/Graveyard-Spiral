package com.example.shane.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/*
This is the Main Activity the application runs from.
 */
public class PTBuddy extends AppCompatActivity {

    //git clone https://github.com/SDev-2018/Graveyard-Spiral
    //git pull

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ptbuddy);
        /*
        Sets title of the application.
        This is the head part that shows up for current activity.
         */
        setTitle("PTBuddy: Home");

        /* These create button objects for the click listeners down below */
        final Button leftArmBtn = findViewById(R.id.secondActivityBtn);
        final Button rightArmBtn = findViewById(R.id.rightArmBtn);
        final Button legsBtn = findViewById(R.id.legsBtn);
        final Button torsoBtn = findViewById(R.id.torsoBtn);

        /*
        This is an action for our buttons, so whenever a button is click, the program
        is "listening" for a click input from the user. When clicked a new "intent" is
        created which allows access to another activity.
         */
        leftArmBtn.setOnClickListener(new View.OnClickListener() {
                                          public void onClick(View v_1) {
                                              Intent startIntent_1 = new Intent(getApplicationContext(), LeftArmZoom.class);
                                              startIntent_1.setFlags(startIntent_1.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                                              startIntent_1.putExtra("key", "");
                                              startActivity(startIntent_1);
                                          }
                                      }
        );

        rightArmBtn.setOnClickListener(new View.OnClickListener() {
                                           public void onClick(View v_2) {
                                               Intent startIntent_2 = new Intent(getApplicationContext(), RightArmZoom.class);
                                               startIntent_2.putExtra("com.example.shane.myapplication.RightArmZoom",
                                                       "");
                                               startIntent_2.setFlags(startIntent_2.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                                               startActivity(startIntent_2);
                                           }
                                       }
        );

        legsBtn.setOnClickListener(new View.OnClickListener() {
                                       public void onClick(View v_3) {
                                           Intent startIntent_3 = new Intent(getApplicationContext(), LegsZoom.class);
                                           startIntent_3.putExtra("com.example.shane.myapplication.LegsZoom",
                                                   "");
                                           startIntent_3.setFlags(startIntent_3.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                                           startActivity(startIntent_3);
                                       }
                                   }
        );

        torsoBtn.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v_4) {
                                            Intent startIntent_4 = new Intent(getApplicationContext(), TorsoZoom.class);
                                            startIntent_4.putExtra("com.example.shane.myapplication.TorsoZoom",
                                                    "");
                                            startIntent_4.setFlags(startIntent_4.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                                            startActivity(startIntent_4);
                                        }
                                    }
        );
    }
}
