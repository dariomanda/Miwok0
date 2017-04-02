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
Translation translation = new Translation();
    MediaPlayer mysound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        CustomAdapter numbersAdapter = new CustomAdapter(getApplicationContext(), translation.getNumbersMiwok(), translation.getNumbersEngilish(), translation.getimgId());
        ListView numbersListView = (ListView) findViewById(R.id.numbersList);
        numbersListView.setAdapter(numbersAdapter);


    }

    public void play(View view){

        mysound = MediaPlayer.create(this, R.raw.number_one);
        mysound.start();

    }

    }

