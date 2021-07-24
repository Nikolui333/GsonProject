package com.semenov.gsonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text);

        GsonParser gsonParser = new GsonParser();
        Example example = gsonParser.parser(this);

        String res = example.quote.body;
        Log.d("log1",res);
        textView.setText(res);

    }
}