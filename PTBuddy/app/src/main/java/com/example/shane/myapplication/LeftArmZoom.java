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

        setTitle("PTBuddy");

        Button returnActivityBtn = findViewById(R.id.returnButtonMA);
        Button returnHomeBtn = findViewById(R.id.returnHomeMA);
        Button leftHandBtn = findViewById(R.id.leftHandBtn);

        returnActivityBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v_1) {
                Intent returnIntent_1 = new Intent(getApplicationContext(), PTBuddy.class);
                returnIntent_1.putExtra("com.example.shane.myapplication.PTBuddy", "");
                startActivity(returnIntent_1);

            }
        });

        returnHomeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v_2) {
                Intent returnIntent_2 = new Intent(getApplicationContext(), PTBuddy.class);
                returnIntent_2.putExtra("com.example.shane.myapplication.PTBuddy", "");
                startActivity(returnIntent_2);

            }
        });

        leftHandBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v_1) {
                Intent startIntent_1 = new Intent(getApplicationContext(), LeftHandZoom.class);
                startIntent_1.putExtra("com.example.shane.myapplication.LeftHandZoom",
                        "");
                startActivity(startIntent_1);
            }
        });

    }
}
