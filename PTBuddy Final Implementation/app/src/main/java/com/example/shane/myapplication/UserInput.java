package com.example.shane.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//Method that creates an activity that asks for the users: name, email and weight.
public class UserInput extends AppCompatActivity {
    int weight;
    String name;
    String email;
    String password;
    EditText nameInput;
    EditText emailInput;
    EditText passwordInput;
    EditText weightInput;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_user);

        nameInput = findViewById(R.id.nameInput);
        emailInput = findViewById(R.id.emailInput);
        passwordInput = findViewById(R.id.passwordInput);
        weightInput = findViewById(R.id.weightInput);
        submitButton =  findViewById(R.id.submitInput);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = nameInput.getText().toString();
                email = emailInput.getText().toString();
                password = passwordInput.getText().toString();
                weight = Integer.valueOf(weightInput.getText().toString());

                Intent startIntent = new Intent(getApplicationContext(), LoginActivity.class);
                startIntent.putExtra("com.example.shane.myapplication.PTBuddy", "");
                startIntent.setFlags(startIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(startIntent);
            }
        });
    }
}
