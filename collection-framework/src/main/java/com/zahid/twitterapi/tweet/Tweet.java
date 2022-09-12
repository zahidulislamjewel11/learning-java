package com.zahid.twitterapi.tweet;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Tweet {

    private String text;
    private String user;
    private LocalDateTime dateTime;

    public Tweet(String text, String user) {
        this.text = text;
        this.user = user;
        this.dateTime = LocalDateTime.now();
    }

    
}