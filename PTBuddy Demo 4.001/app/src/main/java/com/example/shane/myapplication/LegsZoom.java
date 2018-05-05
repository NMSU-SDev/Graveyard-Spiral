package com.example.shane.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LegsZoom extends AppCompatActivity {

    //github upload cd AndroidStudioProjects/MyApplication
    //git clone https://github.com/shanegrayson/Project-alpha
    //cp -r MyApplication Project-alpha
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zoom_legs);

        setTitle("PTBuddy: Leg");

        Button legsVideo = findViewById(R.id.legsVideo);

        legsVideo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent returnIntent = new Intent(getApplicationContext(), YTPlayerLegs.class);
                returnIntent.putExtra("com.example.shane.myapplication.YouTubeVideoPlayer", "");
                returnIntent.setFlags(returnIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(returnIntent);
            }
        });
    }
}
