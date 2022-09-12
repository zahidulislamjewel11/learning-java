package com.zahid.dateformatter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeDemo2 {
    public static void main(String[] args) {
        LocalDate curDate = LocalDate.now();
        System.out.println(curDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(curDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(curDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));

        LocalTime curTime = LocalTime.now();
        System.out.println(curTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        System.out.println(curTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
    }
}
