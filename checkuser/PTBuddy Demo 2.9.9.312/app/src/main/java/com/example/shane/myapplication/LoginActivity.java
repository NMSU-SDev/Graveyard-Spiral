package com.example.shane.myapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;
import java.io.OutputStreamWriter;


public class LoginActivity extends AppCompatActivity {

    /*
    Used to track if the user is new. If set to 0 then they are new
    if set to 1 then they are a returning user. It would probably be best
    to have some PTBuddy load-in/beginning screen.
    **/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        setTitle("PTBuddy: Login");

        /*
        Calls the openDialog() function below to open a new popup window.
        If the user chooses "no" then it send the user to the UserInput
        Activity. If stated "yes" then just stays put at LoginActivity.
        */
        int returnUser = 1;
        if (returnUser == 1) {
            Toast.makeText(LoginActivity.this, "Welcome back!", Toast.LENGTH_LONG).show();

            final Button loginBtn = findViewById(R.id.loginBtn);
            loginBtn.setOnClickListener(new View.OnClickListener() {
                                            public void onClick(View v_1) {
                                                Intent startIntent_1 = new Intent(getApplicationContext(), PTBuddy.class);
                                                startIntent_1.putExtra("com.example.shane.myapplication.LoginActivity",
                                                        "");
                                                startIntent_1.setFlags(startIntent_1.getFlags() | Intent.FLAG_ACTIVITY_TASK_ON_HOME);
                                                startActivity(startIntent_1);
                                            }
                                        }
            );
        }
    }
}