package com.example.shane.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        setTitle(getString(R.string.pt_buddy));

        final Button loginBtn = findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
                 public void onClick(View v_1) {
                     Intent startIntent_1 = new Intent(getApplicationContext(), MainActivity.class);
                     startIntent_1.putExtra("com.example.shane.myapplication.MainActivity",
                             "");
                     startActivity(startIntent_1);
                 }
             }
        );
    }
}