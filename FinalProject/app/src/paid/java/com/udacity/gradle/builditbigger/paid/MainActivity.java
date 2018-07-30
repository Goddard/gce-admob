package com.udacity.gradle.builditbigger.paid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import com.goddardlabs.jokeviewlibrary.DisplayJokeActivity;
import com.udacity.gradle.builditbigger.JokeAsyncTask;
import com.udacity.gradle.builditbigger.OnTaskCompleted;
import com.udacity.gradle.builditbigger.R;

import static com.goddardlabs.jokeviewlibrary.Constants.JOKE_ID;


public class MainActivity extends AppCompatActivity implements OnTaskCompleted {
    public ProgressBar loadingProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadingProgressBar = findViewById(R.id.progressBar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTaskCompleted(String jokeResult) {
        Intent intent = new Intent(this, DisplayJokeActivity.class);
        intent.putExtra(JOKE_ID, jokeResult);

        loadingProgressBar.setVisibility(View.GONE);
        startActivity(intent);
    }

    public void tellJoke(View view) {
//        Toast.makeText(this, "derp", Toast.LENGTH_SHORT).show();
        loadingProgressBar.setVisibility(View.VISIBLE);
        new JokeAsyncTask(this).execute(new Pair<Context, String>(this, "Manfred"));
    }
}