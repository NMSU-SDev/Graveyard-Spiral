package com.example.shane.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.preference.PreferenceManager.getDefaultSharedPreferences;

public class Start extends AppCompatActivity {

    private boolean exit = false;

    //onCreate method for starting the main activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        setTitle("Welcome to PTBuddy");

        /*
        Button object for the return home button
        Precondition: user trying to exit the application
        Postcondition: returns the user to the main of the application
         */
        Button returnHomeBtn = findViewById(R.id.returnHomeBtn);
        returnHomeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent returnIntent = new Intent(getApplicationContext(), PTBuddy.class);
                returnIntent.putExtra("com.example.shane.myapplication.PTBuddy", "");
                returnIntent.setFlags(returnIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(returnIntent);
            }
        });

        /*
        Conditional that tracks shared preferences if they are a new or returning user.
        Precondition: boolean information from shared preferences
        Postcondition: proper branching
         */
        SharedPreferences prefs = getDefaultSharedPreferences(this);
        if (prefs.getBoolean("newUser", true)) {
            prefs.edit().putBoolean("newUser", false).apply();
            openDialog();
        } else {
            prefs.edit().putBoolean("newUser", false).apply();
            Toast.makeText(Start.this, "Welcome back to PTBuddy!",
                    Toast.LENGTH_LONG).show();
            Intent startIntent = new Intent(getApplicationContext(), LoginActivity.class);
            startIntent.putExtra("com.example.shane.myapplication.UserInfo",
                    "");
            startIntent.setFlags(startIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
            startActivity(startIntent);
        }
    }

    /*
    Override command on onBackPressed to change how the back button on a phone operates
    Precondition: user trying to use a phones back button
    Postcondition: exits the application
     */
    @Override
    public void onBackPressed() {
        if (exit)
            this.finish();
        else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);
            exit = true;
        }
    }

    /*
    Method that opens an alert dialogue box for a new user
    Precondition: new user using the application
    Postcondition: exits the application
     */
    public void openDialog() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Are you new to PTBuddy?");

        //Method that creates an option for the user
        alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                //Toasts are the little popup windows near the bottom after completing an action
                Toast.makeText(Start.this, "Welcome to PTBuddy!",
                        Toast.LENGTH_LONG).show();
                Intent startIntent = new Intent(getApplicationContext(), UserInput.class);
                startIntent.setFlags(startIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(startIntent);
            }
        });

        //Method that creates an option for the user
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Toasts are the little popup windows near the bottom after completing an action
                Toast.makeText(Start.this, "Welcome back to PTBuddy!",
                        Toast.LENGTH_LONG).show();
                Intent startIntent = new Intent(getApplicationContext(), LoginActivity.class);
                startIntent.putExtra("com.example.shane.myapplication.UserInfo",
                        "");
                startIntent.setFlags(startIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(startIntent);
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}