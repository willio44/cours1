package com.example.a533.myapplication;

import java.util.Random;

public class GuessNumber {

    private int currentNumber;
    private int max;

    public enum guessState{BIGGER, EQUAL, SMALLER};




    public GuessNumber(int max) {
        this.max = max;
        generateNewNumber();
    }

    public guessState testNumber(int guessedNumber){
        if (guessedNumber > currentNumber){
            return guessState.BIGGER;
        } else if (guessedNumber == currentNumber){
            generateNewNumber();
            return guessState.EQUAL;
        }
        else {
            return guessState.SMALLER;
        }

    }

    private void generateNewNumber(){
        currentNumber = new Random().nextInt(max+1);
    }

}
