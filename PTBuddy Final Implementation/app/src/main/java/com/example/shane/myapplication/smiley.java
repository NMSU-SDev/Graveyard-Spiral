package com.example.shane.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.hsalf.smilerating.BaseRating;
import com.hsalf.smilerating.SmileRating;


//Created by James on 4/24/2018.
public class smiley extends AppCompatActivity {
    private static final String TAG = "smiley";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.smiley);
        SmileRating smileRating = findViewById(R.id.smile_rating);
        smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
            @Override
            public void onSmileySelected(@BaseRating.Smiley int smiley, boolean reselected) {
                /*
                reselected is false when user selects different smiley that previously selected one
                true when the same smiley is selected.
                Except if it first time, then the value will be false.
                 */
                switch (smiley) {
                    case SmileRating.BAD:
                        Log.i(TAG, "Bad");
                        break;
                    case SmileRating.GOOD:
                        Log.i(TAG, "Good");
                        break;
                    case SmileRating.GREAT:
                        Log.i(TAG, "Great");
                        break;
                    case SmileRating.OKAY:
                        Log.i(TAG, "Okay");
                        break;
                    case SmileRating.TERRIBLE:
                        Log.i(TAG, "Terrible");
                        break;
                }
            }
        });
        smileRating.setOnRatingSelectedListener(new SmileRating.OnRatingSelectedListener() {
            @Override
            public void onRatingSelected(int level, boolean reselected) {

                Toast.makeText(smiley.this, "Selected Rating" + level, Toast.LENGTH_SHORT).show();

            }
        });

        Button returnHomeBtn = findViewById(R.id.returnHomeBtn);

        /*
        Button object for the return home button
        Precondition: user trying to exit the application
        Postcondition: returns the user to the main of the application
         */
        returnHomeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent returnIntent = new Intent(getApplicationContext(), PTBuddy.class);
                returnIntent.putExtra("com.example.shane.myapplication.PTBuddy", "");
                returnIntent.setFlags(returnIntent.getFlags() | Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(returnIntent);
            }
        });
    }

}
