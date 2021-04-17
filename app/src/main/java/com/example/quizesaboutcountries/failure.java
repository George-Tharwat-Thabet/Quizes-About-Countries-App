package com.example.quizesaboutcountries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class failure extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_failure);

        /*
          this method to Show Text contain Results of Quiz
         */
        Toast.makeText(this, "You need more effort Your result is " + Shared.scores + "/" + Shared.totalOfScores + "\nYou Failed", Toast.LENGTH_LONG).show();

    }
}