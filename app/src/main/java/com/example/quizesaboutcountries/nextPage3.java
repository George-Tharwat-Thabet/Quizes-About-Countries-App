package com.example.quizesaboutcountries;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.renderscript.ScriptC;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class nextPage3 extends nextPage2 {

    /**
     * this Id for all RadioButtons in quiz 3
     */
    RadioButton uaeAnswerId;
    RadioButton jordanAnswerId;
    RadioButton germanyAnswerId;
    RadioButton italyAnswerId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_page3);

        /*
          this method to call Id of RadioButtons
         */
        uaeAnswerId = findViewById(R.id.uaeAnswerId);
        jordanAnswerId = findViewById(R.id.jordanAnswerId);
        germanyAnswerId = findViewById(R.id.germanyAnswerId);
        italyAnswerId = findViewById(R.id.italyAnswerId);

    }

    /**
     * This Method for UAE RadioButton contain if/else, scores variable,
     * Toast and setTextColor().
     */
    public void uaeAnswerClick(View view) {
        if(uaeAnswerId.isChecked()){
            uaeAnswerId.setTextColor(Color.RED);
            Toast.makeText(this, "Your answer is wrong Scores in Quiz", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This Method for Jordan RadioButton contain if/else, scores variable,
     * Toast and setTextColor().
     */
    public void jordanAnswerClick(View view) {
        if(jordanAnswerId.isChecked()){
            jordanAnswerId.setTextColor(Color.GREEN);
            Shared.scores++;
            Toast.makeText(this, "You Got " + Shared.scores + "/" + Shared.totalOfScores + " Scores in Quiz", Toast.LENGTH_LONG).show();
        }
    }

    /**
     * This Method for Germany RadioButton contain if/else, scores variable,
     * Toast and setTextColor().
     */
    public void germanyAnswerClick(View view) {
        germanyAnswerId = findViewById(R.id.germanyAnswerId);
        if(germanyAnswerId.isChecked()){
            germanyAnswerId.setTextColor(Color.RED);
            Toast.makeText(this, "Your answer is wrong Scores in Quiz", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This Method for Italy RadioButton contain if/else, scores variable,
     * Toast and setTextColor().
     */
    public void italyAnswerClick(View view) {
        if(italyAnswerId.isChecked()){
            italyAnswerId.setTextColor(Color.RED);
            Toast.makeText(this, "Your answer is wrong Scores in Quiz", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This Method for Intent Button
     */
    public void nextC(View view) {
        Intent nextButton3 = new Intent(nextPage3.this, nextPage4.class);
        if (nextButton3.resolveActivity(getPackageManager()) != null){
            startActivity(nextButton3);
        }
    }
}