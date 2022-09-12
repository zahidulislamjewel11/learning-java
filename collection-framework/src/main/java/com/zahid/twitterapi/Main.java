package com.zahid.twitterapi;

import com.zahid.twitterapi.tweet.Tweet;
import com.zahid.twitterapi.tweet.Twitter;

public class Main {
    public static void main(String[] args) {
        Twitter twitter = new Twitter();

        twitter.addTweet(new Tweet("Once upon a time in the wild west.", "Zahid"));
        twitter.addTweet(new Tweet("A quick brown fox jumps over the lazy dong.", "Jewel"));
        twitter.addTweet(new Tweet("Always fogive, never forget.", "Robi"));

        twitter.printAllTweets();
    }
}
