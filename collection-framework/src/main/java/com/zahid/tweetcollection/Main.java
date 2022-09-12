package com.zahid.tweetcollection;
public class Main {
    public static void main(String[] args) {
        Twitter twitter = new TweetApp();
        Tweet tweet1 = new Tweet("Welcome to Java Programming", "Jewel81");
        Tweet tweet2 = new Tweet("Java is a great Programming Language", "zahid");
        twitter.addTweet(tweet1);
        twitter.addTweet(tweet2);
        twitter.printTweets();
    }
}
