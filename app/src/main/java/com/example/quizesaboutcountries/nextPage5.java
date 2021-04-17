package com.example.quizesaboutcountries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class nextPage5 extends nextPage4 {

    /**
     * this Id for all RadioButtons in quiz 5
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_page5);
    }

    /**
     *
     */
    public void submitButton(View view) {

        /*
          this method to call Id of CheckBoxes
         */
        CheckBox cEgypt = findViewById(R.id.egypt2AnswerId);
        CheckBox cGhana = findViewById(R.id.ghanaAnswerId);
        CheckBox cTunisia = findViewById(R.id.tunisiaAnswerId);
        CheckBox cChina = findViewById(R.id.chinaAnswerId);

        if (cEgypt.isChecked()) {
            cEgypt.setTextColor(Color.GREEN);
        }
        if (cGhana.isChecked()) {
            cGhana.setTextColor(Color.GREEN);
        }
        if (cTunisia.isChecked()) {
            cTunisia.setTextColor(Color.GREEN);
        }
        if(cEgypt.isChecked() && cGhana.isChecked() && cTunisia.isChecked() && !cChina.isChecked()){
            Shared.scores++;
            Toast.makeText(this, "You Got " + Shared.scores + "/" + Shared.totalOfScores + " Scores in Quiz", Toast.LENGTH_LONG).show();
        } else{
            cChina.setTextColor(Color.RED);
            Toast.makeText(this, "Your answer is wrong Scores in Quiz", Toast.LENGTH_LONG).show();
        }
    }

    /**
     * This Method for Intent Button
     */
    public void nextE(View view) {
        Intent nextButton5 = new Intent(nextPage5.this, nextPage6.class);
        if (nextButton5.resolveActivity(getPackageManager()) != null){
            startActivity(nextButton5);
        }
    }
}