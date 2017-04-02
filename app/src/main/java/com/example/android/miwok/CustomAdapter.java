package com.example.android.miwok;

import android.content.Context;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.resource;
import static com.example.android.miwok.R.id.numbers;

/**
 * Created by dario on 02.04.2017.
 */

public class CustomAdapter extends BaseAdapter {
    LayoutInflater inflater;
    Context context;
    String numbersMiwok[];
    String numbersEnglish[];
    int[] imgId;


    public CustomAdapter(Context applicationContext, String[] numbersMiwok, String[] numbersEngilish, int[] imgId) {
        this.context = context;
        this.numbersMiwok = numbersMiwok;
        this.numbersEnglish = numbersEngilish;
        this.imgId = imgId;
        inflater = (LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount() {
        return numbersMiwok.length;
    }


    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View customView, ViewGroup parent) {
        customView  = inflater.inflate(R.layout.custom_row, null);

        TextView miwok = (TextView) customView.findViewById(R.id.miwok);
        TextView english = (TextView) customView.findViewById(R.id.english);
        ImageView img = (ImageView) customView.findViewById(R.id.img);

        miwok.setText(numbersMiwok[i]);
        english.setText(numbersEnglish[i]);
        img.setImageResource(imgId[i]);
        return customView;
    }
}
