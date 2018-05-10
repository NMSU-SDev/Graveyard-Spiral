package com.example.shane.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

//This is the Main Activity the application runs from
public class PTBuddy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ptbuddy);

        setTitle("PTBuddy: Home");

        /*
        Button object for the YouTube Video Player
        Precondition: user trying to access a YouTube Video
        Postcondition: Calls the YouTube player associated class
         */
        final Button leftArmBtn = findViewById(R.id.secondActivityBtn);
        leftArmBtn.setOnClickListener(new View.OnClickListener() {
                                          public void onClick(View v_1) {
                                              Intent startIntent_1 = new Intent(getApplicationContext(), LeftArmZoom.class);
                                              startIntent_1.setFlags(startIntent_1.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                                              startIntent_1.putExtra("key", "");
                                              startActivity(startIntent_1);
                                          }
                                      }
        );

        /*
        Button object for the YouTube Video Player
        Precondition: user trying to access a YouTube Video
        Postcondition: Calls the YouTube player associated class
         */
        final Button rightArmBtn = findViewById(R.id.rightArmBtn);
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

        /*
        Button object for the YouTube Video Player
        Precondition: user trying to access a YouTube Video
        Postcondition: Calls the YouTube player associated class
         */
        final Button legsBtn = findViewById(R.id.legsBtn);
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

        /*
        Button object for the YouTube Video Player
        Precondition: user trying to access a YouTube Video
        Postcondition: Calls the YouTube player associated class
         */
        final Button torsoBtn = findViewById(R.id.torsoBtn);
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
