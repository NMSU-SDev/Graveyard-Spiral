package com.example.james.smile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
//import android.content.SharedPreferences;
import com.hsalf.smilerating.BaseRating;
import com.hsalf.smilerating.SmileRating;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SmileRating smileRating = (SmileRating) findViewById(R.id.smile_rating);
        smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
            @Override
            public void onSmileySelected(@BaseRating.Smiley int smiley, boolean reselected) {
                // reselected is false when user selects different smiley that previously selected one
                // true when the same smiley is selected.
                // Except if it first time, then the value will be false.
                switch (smiley) {
                    case SmileRating.TERRIBLE:
                        Toast.makeText(MainActivity.this, "Terrible", Toast.LENGTH_SHORT).show();
                        Log.i(TAG, "Terrible ");
                        break;
                    case SmileRating.BAD:
                        Toast.makeText(MainActivity.this, "Bad", Toast.LENGTH_SHORT).show();
                        Log.i(TAG, "Bad ");
                        //use shared preferences possibly
                        break;
                    case SmileRating.GOOD:
                        Toast.makeText(MainActivity.this, "Good", Toast.LENGTH_SHORT).show();
                        Log.i(TAG, "Good ");
                        break;
                    case SmileRating.GREAT:
                        Toast.makeText(MainActivity.this, "Great", Toast.LENGTH_SHORT).show();
                        Log.i(TAG, "Great ");
                        break;
                    case SmileRating.OKAY:
                        Toast.makeText(MainActivity.this, "Okay", Toast.LENGTH_SHORT).show();
                        Log.i(TAG, "Okay ");
                        break;

                }
            }
        });
     smileRating.setOnRatingSelectedListener(new SmileRating.OnRatingSelectedListener() {
         @Override
         public void onRatingSelected(int level, boolean reselected) {

             Toast.makeText(MainActivity.this, "Selected Rating" + level, Toast.LENGTH_SHORT).show();

         }
     });
    }
}
