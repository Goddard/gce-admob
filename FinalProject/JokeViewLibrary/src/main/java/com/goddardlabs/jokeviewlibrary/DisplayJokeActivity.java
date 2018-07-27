package com.goddardlabs.jokeviewlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.goddardlabs.jokeviewlibrary.Constants.JOKE_ID;

public class DisplayJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        TextView jokeTextView = findViewById(R.id.tv_joke_text);

        if(getIntent().getExtras() != null && getIntent().hasExtra(JOKE_ID)){
            String joke = getIntent().getStringExtra(JOKE_ID);
            jokeTextView.setText(joke);
        }

    }
}