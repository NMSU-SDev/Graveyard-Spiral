package com.example.shane.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        setTitle("Welcome to PTBuddy");

        openDialog();
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
                startIntent_1.putExtra("com.example.shane.myapplication.UserInfo",
                        "");
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

        alertDialogBuilder.setNeutralButton("SKIP", new DialogInterface.OnClickListener() {
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
