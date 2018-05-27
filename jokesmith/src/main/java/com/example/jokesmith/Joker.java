package com.example.jokesmith;

import java.util.Random;

public class Joker {

    private final String[] jokes = new String[] {
            "What happens to a frog's car when it breaks down? \n" +
                    "It gets toad away.",
            "I submitted 10 puns to a joke-writing competition to see if any of them made the finals. \n" +
                    "Sadly, no pun in ten did.",
            "What's the difference between a hippo and a Zippo? \n" +
                    "One is really heavy, and the other is a little lighter.",
            "Can a kangaroo jump higher than the Empire State Building? \n" +
                    "Of course! The Empire State Building can't jump.",
            "If you ever get cold, stand in the corner of a room for a while. \n" +
                    "They're usually 90 degrees.",
            "What did the duck say when it bought lipstick? \n" +
                    "Put it on my bill.",
            "What's the best thing about Switzerland? \n" +
                    "I don't know, but the flag is a big plus.",
            "If you have 10 apples in one hand and 14 oranges in the other, what do you have? \n" +
                    "Really, really big hands.",
            "What do you call two monkeys that share an Amazon account? \n" +
                    "Prime mates.",
            "I took part in the suntanning Olympics... \n" +
                    "...but I only got bronze.",
            "Not only is my new thesaurus terrible... \n" +
                    "...it's also terrible.",
            "How does NASA organize a party? \n" +
                    "They planet.",
            "What do Alexander the Great and Winnie the Pooh have in common? \n" +
                    "Same middle name.",
            "I'm good friends with 25 letters of the alphabet. \n" +
                    "I don't know Y."
    };

    public String getJoke() {
        Random random = new Random();
        int index = random.nextInt(jokes.length);
        return jokes[index];
    }
}
