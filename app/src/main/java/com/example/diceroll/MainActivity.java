package com.example.diceroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    int [] arrOfDiceNum = {R.drawable.dice1, R.drawable.dice2, R.drawable.ic_dice3,R.drawable.dice4, R.drawable.dice5,R.drawable.dice6};
    Random random = new Random();
    String [] comments = {"One more time", "Roll again!", "Nice one!", "Continue", "Rollll", "Good job!","Have a nice one", "Good", "Keep going", "YAY!"};



    public void roll(View view) {

        ImageView imageViewRight = findViewById(R.id.first);
        ImageView imageViewLeft = findViewById(R.id.second);
        TextView textView = findViewById(R.id.comments);

        int rollRight = random.nextInt(6);
        int rollLeft = random.nextInt(6);
        int commentRandom = random.nextInt(10);

        imageViewRight.setImageResource(arrOfDiceNum[rollRight]);
        imageViewLeft.setImageResource(arrOfDiceNum[rollLeft]);
        textView.setText(comments[commentRandom]);

    }
}