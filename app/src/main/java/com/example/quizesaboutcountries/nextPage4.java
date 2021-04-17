package com.example.quizesaboutcountries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class nextPage4 extends nextPage3 {

    /**
     * this Id for EditText in quiz 4
     */
    EditText Answer2Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_page4);

        /*
          this method to call Id of EditText
         */
        Answer2Id = this.findViewById(R.id.Answer2Id);

    }

    /**
     * This Method for Answer2on EditText contain if/else, getText(), toString(), trim(), equalsIgnoreCase(),
     * Toast and setTextColor().
     */
    public void Answer2onClick(View view) {
        if(Answer2Id.getText().toString().trim().equalsIgnoreCase("America")){
            Answer2Id.setTextColor(Color.GREEN);
            Shared.scores++;
            Toast.makeText(this, "You Got " + Shared.scores + "/" + Shared.totalOfScores + " Scores in Quiz", Toast.LENGTH_LONG).show();
        } else {
            Answer2Id.setTextColor(Color.RED);
            Toast.makeText(this, "Your answer is wrong Scores in Quiz", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This Method for Intent Button
     */
    public void nextD(View view) {
        Intent nextButton4 = new Intent(nextPage4.this, nextPage5.class);
        if (nextButton4.resolveActivity(getPackageManager()) != null){
            startActivity(nextButton4);
        }
    }
}