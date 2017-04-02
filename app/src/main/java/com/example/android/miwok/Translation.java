package com.example.android.miwok;

/**
 * Created by dario on 02.04.2017.
 */

public class Translation {
    String[] numbersMiwok = {"lutti", "otiiko", "tolokosu", "oyyisa", "massokka", "temmokka", "kenekaku", "kawinta", "wo'e", "na'aacha"};
    String[] numbersEngilish = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
    Integer[] imgId = {R.drawable.number_one, R.drawable.number_two, R.drawable.number_three, R.drawable.number_four, R.drawable.number_five, R.drawable.number_six, R.drawable.number_seven, R.drawable.number_eight, R.drawable.number_nine, R.drawable.number_ten};


/*    public Translation(String[] numbersMiwok, String[] numbersEngilish){
        this.numbersEngilish = numbersEngilish;
        this.numbersMiwok = numbersMiwok;

    }*/

    public String[] getNumbersMiwok() {
        return numbersMiwok;
    }

    public String[] getNumbersEngilish() {
        return numbersEngilish;
    }
}