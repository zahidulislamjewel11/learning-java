package com.zahid.tweetnormal;
public class TweetApp implements Twitter {
    private static final int MAX_TWEET_SIZE = 10;
    private Tweet[] tweets = new Tweet[MAX_TWEET_SIZE];
    private int index = 0;


    @Override
    public void addTweet(Tweet tweet) {
        tweets[index++]=tweet;
    }

    @Override
    public void printTweets() {
        for(Tweet tweet:tweets) {
            System.out.println(tweet);
        }
    }
}
