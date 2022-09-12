package com.zahid.twitterapi.tweet;

import java.util.ArrayList;
import java.util.List;

public class Twitter implements ITwitter {

    private List<Tweet> tweetList = new ArrayList<>();

    @Override
    public void addTweet(Tweet tweet) {
        tweetList.add(tweet);
        
    }

    @Override
    public void printAllTweets() {
        for(Tweet tweet: tweetList) {
            System.out.println(tweet);
        }
        
    }
    
}
