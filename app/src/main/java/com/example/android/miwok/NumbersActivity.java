package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class NumbersActivity extends AppCompatActivity {

    MediaPlayer mysound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        String[] numbersMiwok = {"lutti", "otiiko", "tolokosu", "oyyisa", "massokka", "temmokka", "kenekaku", "kawinta", "wo'e", "na'aacha"};
        String[] numbersEngilish = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        int[] imgId = {R.drawable.number_one, R.drawable.number_two, R.drawable.number_three, R.drawable.number_four, R.drawable.number_five, R.drawable.number_six, R.drawable.number_seven, R.drawable.number_eight, R.drawable.number_nine, R.drawable.number_ten};

        CustomAdapter numbersAdapter = new CustomAdapter(getApplicationContext(), numbersMiwok, numbersEngilish, imgId);
        ListView numbersListView = (ListView) findViewById(R.id.numbersList);
        numbersListView.setAdapter(numbersAdapter);


    }

    public void play(View view){

        mysound = MediaPlayer.create(this, R.raw.number_one);
        mysound.start();

    }

    }

