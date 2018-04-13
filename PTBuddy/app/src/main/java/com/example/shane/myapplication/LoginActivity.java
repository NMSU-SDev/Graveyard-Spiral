package com.example.shane.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        setTitle(getString(R.string.pt_buddy));

        openDialog();
    }

    public void openDialog() {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Are you a new user?");

        alertDialogBuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(LoginActivity.this, "Welcome to PTBuddy", Toast.LENGTH_LONG).show();
                Intent startIntent_1 = new Intent(getApplicationContext(), UserInput.class);
                startIntent_1.putExtra("com.example.shane.myapplication.LeftArmZoom",
                        "");
                startActivity(startIntent_1);
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(LoginActivity.this, "Welcome back!", Toast.LENGTH_LONG).show();

                final Button loginBtn = findViewById(R.id.loginBtn);
                loginBtn.setOnClickListener(new View.OnClickListener() {
                                                public void onClick(View v_1) {
                                                    Intent startIntent_1 = new Intent(getApplicationContext(), PTBuddy.class);
                                                    startIntent_1.putExtra("com.example.shane.myapplication.PTBuddy",
                                                            "");
                                                    startActivity(startIntent_1);
                                                }
                                            }
                );
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}