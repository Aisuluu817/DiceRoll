package com.example.diceroll;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random = new Random();
    int [] arrOfDiceNum = {
            R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.ic_dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6};
    String [] comments = {
            "One more time",
            "Roll again!",
            "Nice one!",
            "Continue",
            "Rollll",
            "Good job!",
            "Have a nice one",
            "Good",
            "Keep going",
            "YAY!"};

    int rollRight ;
    int rollLeft ;
    int commentRandom ;
    Button roll;
    ImageView imageViewRight;
    ImageView imageViewLeft;
    TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roll = (Button) findViewById(R.id.roll);
           imageViewLeft = findViewById(R.id.first);
           imageViewRight = findViewById(R.id.second);
           textView = findViewById(R.id.comments);
           roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 rollLeft = random.nextInt(6);
                rollRight = random.nextInt(6);
                 commentRandom = random.nextInt(10);

                imageViewLeft.setImageResource(arrOfDiceNum[rollLeft]);
                imageViewRight.setImageResource(arrOfDiceNum[rollRight]);
                textView.setText(comments[commentRandom]);
            }
        });
        if (savedInstanceState!= null) {
            rollLeft = savedInstanceState.getInt("left");
            rollRight = savedInstanceState.getInt("right");
        }

        imageViewLeft.setImageResource(arrOfDiceNum[rollLeft]);
        imageViewRight.setImageResource(arrOfDiceNum[rollRight]);

        textView.setText(comments[commentRandom]);
    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("left",rollLeft);
        outState.putInt("right",rollRight);
    }
    }