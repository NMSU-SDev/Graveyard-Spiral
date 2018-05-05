package com.example.shane.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
This method creates an activity that asks for the users: name, email and weight.
 */
public class UserInput extends AppCompatActivity {
    int weight;
    String name;
    String email;
    EditText nameInput;
    EditText emailInput;
    EditText weightInput;
    Button submitButton;

    /*
    Write to file that saves an Int value in a plain text document.
    */

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

                Intent startIntent_1 = new Intent(getApplicationContext(), LoginActivity.class);
                startIntent_1.putExtra("com.example.shane.myapplication.PTBuddy", "");
                startIntent_1.setFlags(startIntent_1.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(startIntent_1);
            }
        });
    }

    /*
    //https://www.youtube.com/watch?v=fJEFZ6EOM9o
    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "text";

    private String text;

    saveData();
    loadData();

                nameInput.setText(text);
                emailInput.setText(text);
                weightInput.setText(text);


    public void saveData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(TEXT, nameInput.getText().toString());
        editor.putString(TEXT, emailInput.getText().toString());
        editor.putString(TEXT, weightInput.getText().toString());

        Toast.makeText(this, "Saved to " + getFilesDir() + "/" + TEXT, Toast.LENGTH_LONG).show();
    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        text = sharedPreferences.getString(TEXT, "");
    }



    private static final String FILE_NAME = "savedVariables.txt";

                //save(nameInput);
                //save(emailInput);
                //save(weightInput);

    public void save(View view) {
        String name = nameInput.getText().toString();
        String email = emailInput.getText().toString();
        String weight = weightInput.getText().toString();

        FileOutputStream fos = null;

        try {
            fos = openFileOutput(FILE_NAME, MODE_PRIVATE);
            fos.write(name.getBytes());
            fos.write(email.getBytes());
            fos.write(weight.getBytes());

            nameInput.getText().clear();
            emailInput.getText().clear();
            weightInput.getText().clear();

            Toast.makeText(this, "Saved to " + getFilesDir() + "/" + FILE_NAME, Toast.LENGTH_LONG).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void load(View view) {
        FileInputStream fis = null;

        try {
            fis = openFileInput(FILE_NAME);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text;

            while ((text = br.readLine()) != null){
                sb.append(text).append("\n");
            }

            nameInput.setText(sb.toString());
            emailInput.setText(sb.toString());
            weightInput.setText(sb.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
*/
}
