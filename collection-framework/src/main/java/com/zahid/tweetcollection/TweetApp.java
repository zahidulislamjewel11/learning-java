package com.zahid.tweetcollection;
import java.util.ArrayList;
import java.util.List;

public class TweetApp implements Twitter {
    private List<Tweet> list = new ArrayList<Tweet>();


    @Override
    public void addTweet(Tweet tweet) {
        list.add(tweet);
    }

    @Override
    public void printTweets() {
        for(Tweet tweet:list) {
            System.out.println(tweet);
        }
    }
}
