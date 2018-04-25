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
        setContentView(R.layout.zoom_arm_right);

        setTitle("PTBuddy");

        Button returnActivityBtn = findViewById(R.id.returnButtonMA);
        returnActivityBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent returnIntent = new Intent(getApplicationContext(), MainActivity.class);
                returnIntent.putExtra("com.example.shane.myapplication.MainActivity", "");
                startActivity(returnIntent);

            }
        });
    }
}
