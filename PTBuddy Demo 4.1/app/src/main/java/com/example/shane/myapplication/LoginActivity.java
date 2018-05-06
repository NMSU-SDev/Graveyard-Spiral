package com.example.shane.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


public class LoginActivity extends AppCompatActivity {
    /*
    Used to track if the user is new. If set to 0 then they are new
    if set to 1 then they are a returning user. It would probably be best
    to have some PTBuddy load-in/beginning screen.
    **/

    private SharedPreferences mPref;
    private SharedPreferences.Editor mEdit;

    private EditText mEmail, mPassword;
    private CheckBox mCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        setTitle("PTBuddy: Login");

        final Button loginBtn = findViewById(R.id.loginBtn);
        mEmail = findViewById(R.id.email_login);
        mPassword = findViewById(R.id.password_login);
        mCheck = findViewById(R.id.checkbox_login);
        mPref = PreferenceManager.getDefaultSharedPreferences(this);
        mEdit = mPref.edit();
        checkSharedPref();

        /*
        Calls the openDialog() function below to open a new popup window.
        If the user chooses "no" then it send the user to the UserInput
        Activity. If stated "yes" then just stays put at LoginActivity.
        */

        //Toast.makeText(LoginActivity.this, "Welcome to PTBuddy", Toast.LENGTH_LONG).show();

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ApplySharedPref")
            @Override
            public void onClick(View view) {
                if(mCheck.isChecked()) {
                    mEdit.putString(getString(R.string.checkbox_login), "True");
                    mEdit.commit();

                    String email = mEmail.getText().toString();
                    mEdit.putString(getString(R.string.email_login), email);
                    mEdit.commit();

                    String password = mEmail.getText().toString();
                    mEdit.putString(getString(R.string.password_login), password);
                    mEdit.commit();
                } else {
                    mEdit.putString(getString(R.string.checkbox_login), "False");
                    mEdit.commit();

                    mEdit.putString(getString(R.string.email_login), "");
                    mEdit.commit();

                    mEdit.putString(getString(R.string.password_login), "");
                    mEdit.commit();
                }

                Intent startIntent = new Intent(getApplicationContext(), PTBuddy.class);
                startIntent.putExtra("com.example.shane.myapplication.LoginActivity",
                        "");
                startIntent.setFlags(startIntent.getFlags() | Intent.FLAG_ACTIVITY_TASK_ON_HOME);
                startActivity(startIntent);
            }

        });

    }

    private void checkSharedPref(){
        String checkbox = mPref.getString(getString(R.string.checkbox_login), "False");
        String email = mPref.getString(getString(R.string.email_login), "");
        String password = mPref.getString(getString(R.string.password_login), "");

        mEmail.setText(email);
        mPassword.setText(password);

        if (checkbox.equals("True")){
            mCheck.setChecked(true);
        } else {
            mCheck.setChecked(false);
        }
    }
}