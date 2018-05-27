package com.udacity.gradle.builditbigger;

import android.os.AsyncTask;
import android.util.Log;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;

import java.io.IOException;

public class JokeFetcher extends AsyncTask<JokeListener, Void, String> {

    private static final String TAG = JokeFetcher.class.getSimpleName();

    private static MyApi apiService = null;
    private JokeListener jokeListener;


    @Override
    protected String doInBackground(JokeListener... params) {
        if (apiService == null) {
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    .setRootUrl(BuildConfig.URL)
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> request) throws IOException {
                            request.setDisableGZipContent(true);
                        }
                    });
            apiService = builder.build();

        }
        jokeListener = params[0];
        String joke = "LOL";
        try {
            joke = apiService.getJoke().execute().getData();
        } catch (IOException e) {
            Log.d(TAG,e.getMessage());
        }

        return joke;
    }

    @Override
    protected void onPostExecute(String joke) {
        jokeListener.onJokeLoaded(joke);
    }
}
