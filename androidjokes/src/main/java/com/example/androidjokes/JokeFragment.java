package com.example.androidjokes;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class JokeFragment extends Fragment {

    public static final String JOKE_KEY = "joke";

    public JokeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_joke, container, false);
        TextView jokeText = root.findViewById(R.id.joke_text);
        Intent intent = getActivity().getIntent();
        if (intent.hasExtra(JOKE_KEY)) {
            jokeText.setText(intent.getStringExtra(JOKE_KEY));
        }
        return root;
    }
}
