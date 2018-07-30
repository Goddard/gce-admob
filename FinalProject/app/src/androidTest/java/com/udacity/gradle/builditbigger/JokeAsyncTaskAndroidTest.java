package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.ConditionVariable;
import android.test.AndroidTestCase;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;

import java.util.concurrent.ExecutionException;

public class JokeAsyncTaskAndroidTest extends AndroidTestCase implements OnTaskCompleted {

    private JokeAsyncTask jokeAsyncTask;
    private ConditionVariable waiter;

    @Override protected void setUp() throws Exception {
        super.setUp();
        jokeAsyncTask = new JokeAsyncTask(this);
        waiter = new ConditionVariable();
    }

    public void testJokeFetchedIsNotEmpty() {
        jokeAsyncTask.execute(new Pair<Context, String>(this.getContext(), "test"));
        waiter.block();
    }

    @Override
    public void onTaskCompleted(String joke) {
        Log.i("Async Test", joke);
        assertFalse(TextUtils.isEmpty(joke));
        waiter.open();
    }
}