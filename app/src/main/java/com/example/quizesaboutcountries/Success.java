package com.example.quizesaboutcountries;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Success extends nextPage6 {

    /**
     * This ImageView is called showPhoto
     */
    ImageView showPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        /*
          this method to call Id of ImageView
         */
        showPhoto = findViewById(R.id.photo);

    }

    /**
     * This Method for Button it onClick called congrate to Visible
     */
    public void congrate(View view) {
        showPhoto.setVisibility(View.VISIBLE);

        /*
          this method to Show Text contain Results of Quiz
         */
        Toast.makeText(this, "Congratulations! Your result is " + Shared.scores + "/" + Shared.totalOfScores + "\nYou succeeded", Toast.LENGTH_LONG).show();
    }
}