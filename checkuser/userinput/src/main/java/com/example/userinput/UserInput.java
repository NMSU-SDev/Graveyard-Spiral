package com.example.userinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserInput extends AppCompatActivity {
    String name,email;
    int weight;
    EditText nameInput;
    EditText emailInput;
    EditText weightInput;
    Button submitButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_user);
        nameInput=(EditText) findViewById(R.id.nameInput);
        emailInput=(EditText) findViewById(R.id.emailInput);
        weightInput=(EditText) findViewById(R.id.weightInput);

        submitButton = (Button) findViewById(R.id.submitInput);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = nameInput.getText().toString();
                email = emailInput.getText().toString();
                weight = Integer.valueOf(weightInput.getText().toString());
            }
        });


}

}
