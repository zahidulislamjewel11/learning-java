package com.zahid.dateformatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo4 {
    public static void main(String[] args) {
        LocalDateTime curDateTime = LocalDateTime.parse("May 05, 2021 11:19 AM", DateTimeFormatter.ofPattern("MMMM d',' yyyy hh':'mm a"));
        System.out.println(curDateTime);
        System.out.println(curDateTime.format(DateTimeFormatter.ofPattern("MMMM d',' yyyy h':'mm a")));
    }
}
