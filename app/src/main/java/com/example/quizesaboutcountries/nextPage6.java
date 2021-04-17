package com.example.quizesaboutcountries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class nextPage6 extends nextPage5 {

    /**
     * this Id for EditText in quiz 6
     */
    EditText Answer3Id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next_page6);

        /*
          this method to call Id of EditText
         */
        Answer3Id = this.findViewById(R.id.Answer3Id);

    }

    /**
     * This Method for Answer1on EditText contain if/else, getText(), toString(), trim(), equalsIgnoreCase(),
     * Toast and setTextColor().
     */
    public void Answer3onClick(View view) {
        if(Answer3Id.getText().toString().trim().equalsIgnoreCase("Russia")){
            Answer3Id.setTextColor(Color.GREEN);
            Shared.scores++;
            Toast.makeText(this, "You Got " + Shared.scores + "/" + Shared.totalOfScores + " Scores in Quiz", Toast.LENGTH_LONG).show();
        } else {
            Answer3Id.setTextColor(Color.RED);
            Toast.makeText(this, "Your answer is wrong Scores in Quiz", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This Method for Intent Button
     * This first if/else for scores equals == totalOfScores to transfer the user to Success Activity
     * This second if/else for scores not equals != totalOfScores to transfer the user to failure Activity
     */
    public void nextF(View view) {
        if (Shared.scores == Shared.totalOfScores){
            Intent nextButton6 = new Intent(nextPage6.this, Success.class);
            if (nextButton6.resolveActivity(getPackageManager()) != null){
                startActivity(nextButton6);
            }
        }

        if (Shared.scores != Shared.totalOfScores){
            Intent nextButton6 = new Intent(nextPage6.this, failure.class);
            if (nextButton6.resolveActivity(getPackageManager()) != null){
                startActivity(nextButton6);
            }
        }
    }
}