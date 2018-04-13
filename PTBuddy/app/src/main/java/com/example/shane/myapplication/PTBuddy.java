package com.example.shane.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PTBuddy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ptbuddy);

        setTitle("PTBuddy");
        final Button leftArmBtn = findViewById(R.id.secondActivityBtn);
        final Button rightArmBtn = findViewById(R.id.rightArmBtn);
        final Button legsBtn = findViewById(R.id.legsBtn);
        final Button torsoBtn = findViewById(R.id.torsoBtn);

        leftArmBtn.setOnClickListener(new View.OnClickListener() {
                                          public void onClick(View v_1) {
                                              Intent startIntent_1 = new Intent(getApplicationContext(), LeftArmZoom.class);
                                              startIntent_1.putExtra("com.example.shane.myapplication.LeftArmZoom",
                                                      "");
                                              startActivity(startIntent_1);
                                          }
                                      }
        );

        rightArmBtn.setOnClickListener(new View.OnClickListener() {
                                           public void onClick(View v_2) {
                                               Intent startIntent_2 = new Intent(getApplicationContext(), RightArmZoom.class);
                                               startIntent_2.putExtra("com.example.shane.myapplication.RightArmZoom",
                                                       "");
                                               startActivity(startIntent_2);
                                           }
                                       }
        );

        legsBtn.setOnClickListener(new View.OnClickListener() {
                                       public void onClick(View v_3) {
                                           Intent startIntent_3 = new Intent(getApplicationContext(), LegsZoom.class);
                                           startIntent_3.putExtra("com.example.shane.myapplication.LegsZoom",
                                                   "");
                                           startActivity(startIntent_3);
                                       }
                                   }
        );

        torsoBtn.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v_4) {
                                            Intent startIntent_4 = new Intent(getApplicationContext(), TorsoZoom.class);
                                            startIntent_4.putExtra("com.example.shane.myapplication.TorsoZoom",
                                                    "");
                                            startActivity(startIntent_4);
                                        }
                                    }
        );
    }
}
