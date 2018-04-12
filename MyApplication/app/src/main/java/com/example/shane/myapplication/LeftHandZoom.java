package com.example.shane.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LeftHandZoom extends AppCompatActivity {

    //github upload cd AndroidStudioProjects/MyApplication
    //git clone https://github.com/shanegrayson/Project-alpha
    //cp -r MyApplication Project-alpha
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zoom_left_hand);

        setTitle("PTBuddy");

        Button returnHomeBtn = findViewById(R.id.returnHomeBtn);
        Button backBtn = findViewById(R.id.backBtn);
        Button leftHandVid = findViewById(R.id.leftHandVideo);

        returnHomeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent returnIntent = new Intent(getApplicationContext(), MainActivity.class);
                returnIntent.putExtra("com.example.shane.myapplication.MainActivity", "");
                startActivity(returnIntent);

            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent returnIntent = new Intent(getApplicationContext(), SecondActivity.class);
                returnIntent.putExtra("com.example.shane.myapplication.SecondActivity", "");
                startActivity(returnIntent);

            }
        });

        leftHandVid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent returnIntent = new Intent(getApplicationContext(), YouTubeVideoPlayer.class);
                returnIntent.putExtra("com.example.shane.myapplication.YouTubeVideoPlayer", "");
                startActivity(returnIntent);
            }
        });

    }
}
