package com.example.quizesaboutcountries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class nextPage2 extends MainActivity {

    /**
     * this Id for EditText in quiz 2
     */
    EditText Answer1Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_page2);

        /*
          this method to call Id of EdutText
         */
        Answer1Id = this.findViewById(R.id.Answer1Id);
    }

    /**
     * This Method for Answer1on EditText contain if/else, getText(), toString(), trim(), equalsIgnoreCase(),
     * Toast and setTextColor().
     */
    public void Answer1onClick(View view) {
        if(Answer1Id.getText().toString().trim().equalsIgnoreCase("Dubai")){
            Answer1Id.setTextColor(Color.GREEN);
            Shared.scores++;
            Toast.makeText(this, "You Got " + Shared.scores + "/" + Shared.totalOfScores + " Scores in Quiz", Toast.LENGTH_LONG).show();
        } else {
            Answer1Id.setTextColor(Color.RED);
            Toast.makeText(this, "Your answer is wrong Scores in Quiz", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This Method for Intent Button
     */
    public void nextB(View view) {
        Intent nextButton2 = new Intent(nextPage2.this, nextPage3.class);
        if (nextButton2.resolveActivity(getPackageManager()) != null){
            startActivity(nextButton2);
        }
    }
}