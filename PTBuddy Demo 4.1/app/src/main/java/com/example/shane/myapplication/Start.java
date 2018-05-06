package com.example.shane.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Start extends AppCompatActivity {

    private boolean exit = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        setTitle("Welcome to PTBuddy");

        Button returnHomeBtn = findViewById(R.id.returnHomeBtn);
        returnHomeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent returnIntent = new Intent(getApplicationContext(), PTBuddy.class);
                returnIntent.putExtra("com.example.shane.myapplication.PTBuddy", "");
                returnIntent.setFlags(returnIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(returnIntent);
            }
        });

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        boolean start_progam = true;
        if (start_progam) {
            openDialog();
        } else {
            prefs.edit().putBoolean("", false).apply();
            onBackPressed();
        }
    }

    /*
Method for asking the user if they would like to exit the program
when they press the back button at the start screen.
 */
    @Override
    public void onBackPressed() {
        if (exit)
            this.finish();
        else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            //exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);
            exit = true;
        }
    }

    public void openDialog() {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Are you new to PTBuddy?");

        alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
            /*
            Toasts are the little popup windows near the bottom after completing an action.
             */
                Toast.makeText(Start.this, "Welcome to PTBuddy!", Toast.LENGTH_LONG).show();

                Intent startIntent_1 = new Intent(getApplicationContext(), UserInput.class);
                startIntent_1.setFlags(startIntent_1.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(startIntent_1);
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            /*
            Toasts are the little popup windows near the bottom after completing an action.
             */
                Toast.makeText(Start.this, "Welcome back to PTBuddy!", Toast.LENGTH_LONG).show();

                Intent startIntent_1 = new Intent(getApplicationContext(), LoginActivity.class);
                startIntent_1.putExtra("com.example.shane.myapplication.UserInfo",
                        "");
                startIntent_1.setFlags(startIntent_1.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(startIntent_1);
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}