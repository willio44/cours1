package com.example.a533.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final int maxRandom = 10;
    private GuessNumber guessNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        guessNumber = new GuessNumber(maxRandom);

    }

    public void guess(View button){
        EditText editTextGuessedNumber = findViewById(R.id.editText_guessedNumber);
        GuessNumber.guessState guessState = guessNumber.testNumber(Integer.parseInt(editTextGuessedNumber.getText().toString()));
        if(guessState == GuessNumber.guessState.BIGGER){
            Toast.makeText(this, "Number is too big", Toast.LENGTH_SHORT).show();
        } else if(guessState == GuessNumber.guessState.EQUAL){
            Toast.makeText(this, "You got it!", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Number is too small", Toast.LENGTH_SHORT).show();
        }
    }
}
