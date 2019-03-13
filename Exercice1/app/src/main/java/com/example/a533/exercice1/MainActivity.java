package com.example.a533.exercice1;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.graphics.Color;


public class MainActivity extends AppCompatActivity {
    int DefaultColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DefaultColor = findViewById(R.id.editText_number1).getSolidColor();
    }

    public void compareNumber(View button){
        EditText editTextCompareNumber1 = findViewById(R.id.editText_number1);
        EditText editTextCompareNumber2 = findViewById(R.id.editText_number2);
        editTextCompareNumber2.setBackgroundColor(Color.alpha(DefaultColor));
        editTextCompareNumber1.setBackgroundColor(Color.alpha(DefaultColor));
        int number1 = Integer.parseInt((editTextCompareNumber1.getText().toString()));
        int number2 = Integer.parseInt((editTextCompareNumber2.getText().toString()));

        if(number1 == number2 ){
            Toast.makeText(this, "Equal", Toast.LENGTH_SHORT).show();
        }  else if(number1 > number2 ){
            Toast.makeText(this, "Number 1 plus grand ", Toast.LENGTH_SHORT).show();
            editTextCompareNumber1.setBackgroundColor(Color.rgb(0,200,0));
        }else {
            Toast.makeText(this, "Number 2 plus grand ", Toast.LENGTH_SHORT).show();
            editTextCompareNumber2.setBackgroundColor(Color.rgb(0,200,0));
        }

    }
}





   /* protected void onCreate(Bundle savedInstanceState) {
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
    }*/