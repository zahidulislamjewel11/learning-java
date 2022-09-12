package com.zahid.enum1;

public class EnumExample {

    public static void main(String[] args) {
        Day d1 = Day.SAT;
        Day d2 = Day.SUN;
        displayDay(d1);
        displayDay(d2);
        System.out.println();

        Day[] days = Day.values();
        
        for(Day day: days) {
            displayDay(day);
        }
    }

    public static void displayDay(Day day) {
        switch (day) {
            case SAT:
                System.out.println("Saturday");
                break;
            case SUN:
                System.out.println("Sunday");
                break;
            case MON:
                System.out.println("Monday");
                break;
            case TUE:
                System.out.println("Tuesday");
                break;
            case WED:
                System.out.println("Wednesday");
                break;
            case THU:
                System.out.println("Thursday");
                break;
            case FRI:
                System.out.println("Friday");
                break;
        
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}