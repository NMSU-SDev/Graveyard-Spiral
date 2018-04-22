package com.example.shane.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/*
This method creates an activity that asks for the users: name, email and weight.
 */
public class UserInput extends AppCompatActivity {
    int weight;
    String name,email;
    EditText nameInput;
    EditText emailInput;
    EditText weightInput;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_user);

        nameInput = findViewById(R.id.nameInput);
        emailInput = findViewById(R.id.emailInput);
        weightInput = findViewById(R.id.weightInput);
        submitButton =  findViewById(R.id.submitInput);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = nameInput.getText().toString();
                email = emailInput.getText().toString();
                weight = Integer.valueOf(weightInput.getText().toString());
                Intent returnIntent = new Intent(getApplicationContext(), LoginActivity.class);
                returnIntent.putExtra("com.example.shane.myapplication.PTBuddy", "");
                startActivity(returnIntent);
            }
        });
    }
}
