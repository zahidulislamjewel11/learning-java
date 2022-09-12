package com.zahid.dateformatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo3 {
    public static void main(String[] args) {
        LocalDateTime curDateTime = LocalDateTime.now();
        System.out.println(curDateTime.format(DateTimeFormatter.ofPattern("MMMM d',' yyyy h':'mm a")));
    }
}
