package com.goddardlabs.jokelibrary;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class JokeLibrary {
    private List<String> jokes = Arrays.asList(
            "A man walks into a doctor's office. He has a cucumber up his nose, a carrot in his left ear and a banana in his right ear. \"What's the matter with me?\" he asks the doctor. The doctor replies, \"You're not eating properly\"",
            "A man asked for a meal in a restaurant. The waiter brought the food and put it on the table. After a moment, the man called the waiter and said:\n" +
                    "\n" +
                    "\"Waiter! Waiter! There's a fly in my soup!\"\n" +
                    "\n" +
                    "\"Please don't speak so loudly, sir,\" said the waiter, \"or everyone will want one.\"",
            "What is the longest word in the English language?\n" +
                    "\n" +
                    "\"Smiles\". Because there is a mile between its first and last letters!",
            "There are 5 birds in a tree. A hunter shoots 2 of them dead. How many birds are left?\n" +
                    "\n" +
                    "2 birds. The other 3 fly away!",
            "What's the definition of a pessimist? A pessimist is a well-informed optimist.",
            "Mark called in to see his friend Angus (a Scotman) to find he was stripping the wallpaper from the walls. Rather obviously, he remarked \"You're decorating, I see.\" to which Angus replied \"No. I'm moving house.\"",
            "One day an Englishman, a Scotsman, and an Irishman walked into a pub together. They each bought a pint of Guinness. Just as they were about to enjoy their creamy beverage, three flies landed in each of their pints, and were stuck in the thick head. The Englishman pushed his beer away in disgust. The Scotsman fished the fly out of his beer, and continued drinking it, as if nothing had happened. The Irishman, too, picked the fly out of his drink, held it out over the beer, and started yelling, \"SPIT IT OUT, SPIT IT OUT YOU BAS**RD!!!!\"",
            "A man was injected with a deadly poison, but, it did not kill him. Why?\n" +
                    "\n" +
                    "He was already dead!",
            "A Scottish farmer was in his field digging up his tatties (a Scots word for potatoes). An American farmer looked over the fence and said\n" +
                    "\"In Texas we grow potatoes 5 times larger than that!\"\n" +
                    "\n" +
                    "The Scotsman replied \" Ah but we just grow them for our own mouths!\"");

    public String getRandomJoke() {
        int random = new Random().nextInt(jokes.size());
        return jokes.get(random);
    }
}
