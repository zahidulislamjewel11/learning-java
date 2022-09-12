package com.zahid.dateformatter;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate curDate = LocalDate.now();
        System.out.println(curDate);

        LocalTime curTime = LocalTime.now();
        System.out.println(curTime);
    }
}