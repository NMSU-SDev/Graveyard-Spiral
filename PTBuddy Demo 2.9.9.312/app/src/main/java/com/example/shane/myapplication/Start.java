package com.example.shane.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.view.View;
import android.widget.Button;
=======
>>>>>>> origin/master
import android.widget.Toast;

public class Start extends AppCompatActivity {

    private boolean exit = false;
<<<<<<< HEAD
    GlobalTracker gt = new GlobalTracker();
=======
>>>>>>> origin/master

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        setTitle("Welcome to PTBuddy");

<<<<<<< HEAD
        Button returnHomeBtn = findViewById(R.id.returnHomeBtn);

        returnHomeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent returnIntent = new Intent(getApplicationContext(), PTBuddy.class);
                returnIntent.putExtra("com.example.shane.myapplication.PTBuddy", "");
                returnIntent.setFlags(returnIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(returnIntent);
            }
        });

        if (gt.getGlobalVariable() == 0) {
            gt.setGlobalVariable();
            openDialog();
        }
=======
        GlobalTracker gt = new GlobalTracker();

        if (gt.getGlobalVariable() == 0)
            openDialog();
>>>>>>> origin/master
        else
            onBackPressed();
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
<<<<<<< HEAD
            //exit = true;
=======
            exit = true;
>>>>>>> origin/master
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
<<<<<<< HEAD
                }
            }, 3 * 1000);
            exit = true;
=======
                    Intent startIntent_1 = new Intent(getApplicationContext(), PTBuddy.class);
                    startIntent_1.putExtra("com.example.shane.myapplication.UserInfo",
                            "");
                    startIntent_1.setFlags(startIntent_1.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                    startActivity(startIntent_1);
                }
            }, 3 * 1000);
>>>>>>> origin/master
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
<<<<<<< HEAD
                startIntent_1.putExtra("com.example.shane.myapplication.UserInfo", gt.getGlobalVariable());
=======
                startIntent_1.putExtra("com.example.shane.myapplication.UserInfo",
                        "");
>>>>>>> origin/master
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

<<<<<<< HEAD
        alertDialogBuilder.setNeutralButton("SKIP GV: " + gt.getGlobalVariable(), new DialogInterface.OnClickListener() {
=======
        alertDialogBuilder.setNeutralButton("SKIP", new DialogInterface.OnClickListener() {
>>>>>>> origin/master
            @Override
            public void onClick(DialogInterface dialog, int which) {
            /*
            Toasts are the little popup windows near the bottom after completing an action.
             */
                Toast.makeText(Start.this, "SKIPPED", Toast.LENGTH_LONG).show();

                Intent startIntent_1 = new Intent(getApplicationContext(), PTBuddy.class);
                startIntent_1.putExtra("com.example.shane.myapplication.PTBuddy",
                        "");
                startIntent_1.setFlags(startIntent_1.getFlags() | Intent.FLAG_ACTIVITY_TASK_ON_HOME);
                startActivity(startIntent_1);
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

}


/*
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Closing Activity")
                .setMessage("Are you sure you want to close this activity?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                })
                .setNegativeButton("No", null)
                .show();
    }

*/
