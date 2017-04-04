package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class NumbersActivity extends AppCompatActivity {
Numbers translation = new Numbers();
    MediaPlayer mysound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        CustomAdapter numbersAdapter = new CustomAdapter(getApplicationContext(), translation.getNumbersMiwok(), translation.getNumbersEngilish(), translation.getimgId());
        final ListView numbersListView = (ListView) findViewById(R.id.numbersList);
        numbersListView.setAdapter(numbersAdapter);

        numbersListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = (String) numbersListView.getItemAtPosition(position);
                //Toast.makeText(this,"You selected : " + item, Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void play(View view){

        mysound = MediaPlayer.create(this, R.raw.number_one);
        mysound.start();

    }

    }

