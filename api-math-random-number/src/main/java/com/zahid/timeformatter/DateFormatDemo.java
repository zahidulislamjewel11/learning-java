package com.zahid.timeformatter;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df;
        System.out.println(date);
        System.out.println(date.getTime());

        df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.JAPAN);
        System.out.println("Japan: " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.KOREA);
        System.out.println("Korea: " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.LONG, Locale.UK);
        System.out.println("Korea: " + df.format(date));

        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        System.out.println("Korea: " + df.format(date));
    }
}