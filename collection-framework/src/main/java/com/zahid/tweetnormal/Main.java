package com.zahid.tweetnormal;
public class Main {
    public static void main(String[] args) {
        Twitter twitter = new TweetApp();
        Tweet tweet = new Tweet("Welcome to Java Programming", "Jewel81");
        twitter.addTweet(tweet);
        twitter.printTweets();
    }
}
