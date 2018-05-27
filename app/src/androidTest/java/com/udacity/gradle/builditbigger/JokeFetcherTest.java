package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class JokeFetcherTest {
    @Rule
    public final ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void JokeFetcher_GetJoke() {
        JokeFetcher fetcher = new JokeFetcher();
        fetcher.execute(mActivityRule.getActivity());

        String joke;
        try {
            joke = fetcher.get();
            assertEquals(!joke.equals(""), !joke.isEmpty());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}