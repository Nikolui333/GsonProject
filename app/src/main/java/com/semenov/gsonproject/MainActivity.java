package com.semenov.gsonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GsonParser gsonParser = new GsonParser();
        Example example = gsonParser.parser(this);

        Log.d("log1",example.toString());

    }
}