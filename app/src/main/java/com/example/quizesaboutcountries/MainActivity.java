package com.example.quizesaboutcountries;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * this Id for all CheckBox in quiz 1
     */
    RadioButton egyptAnswerId;
    RadioButton spainAnswerId;
    RadioButton brazilAnswerId;
    RadioButton bahrainAnswerId;

    /**
     * this public count of scores
     */
    public static class Shared {
        public static int scores = 0;
        public static int totalOfScores = 6;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
          this method to call Id of RadioButtons
         */
        egyptAnswerId = findViewById(R.id.egyptAnswerId);
        spainAnswerId = findViewById(R.id.spainAnswerId);
        brazilAnswerId = findViewById(R.id.brazilAnswerId);
        bahrainAnswerId = findViewById(R.id.bahrainAnswerId);

    }

    /**
     * This Method for Egypt RadioButton contain if/else, scores variable,
     * Toast and setTextColor().
     */
    public void egyptAnswerClick(View view){
        if(egyptAnswerId.isChecked()){
            egyptAnswerId.setTextColor(Color.GREEN);
            Shared.scores++;
            Toast.makeText(this, "You Got " + Shared.scores + "/" + Shared.totalOfScores + " Scores in Quiz", Toast.LENGTH_LONG).show();
        }
    }

    /**
     * This Method for Spain RadioButton contain if/else, scores variable,
     * Toast and setTextColor().
     */
    public void spainAnswerClick(View view){
        if(spainAnswerId.isChecked()){
            spainAnswerId.setTextColor(Color.RED);
            Toast.makeText(this, "Your answer is wrong Scores in Quiz", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This Method for Brazil RadioButton contain if/else, scores variable,
     * Toast and setTextColor().
     */
    public void brazilAnswerClick(View view) {
        if(brazilAnswerId.isChecked()){
            brazilAnswerId.setTextColor(Color.RED);
            Toast.makeText(this, "Your answer is wrong Scores in Quiz", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This Method for Bahrain RadioButton contain if/else, scores variable,
     * Toast and setTextColor().
     */
    public void bahrainAnswerClick(View view) {
        if(bahrainAnswerId.isChecked()){
            bahrainAnswerId.setTextColor(Color.RED);
            Toast.makeText(this, "The answer is wrong your score is " + Shared.scores + "/" + Shared.totalOfScores, Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This Method for Intent Button
     */
    public void nextA(View view) {
        Intent nextButton1 = new Intent(MainActivity.this, nextPage2.class);
        if (nextButton1.resolveActivity(getPackageManager()) != null){
            startActivity(nextButton1);
        }
    }

}