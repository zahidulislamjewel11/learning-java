package com.zahid.switchcase;

public class SwitchCase3 {
    public static void main(String[] args) {
        dayName(4);
        dayName(1);
        dayName(6);
        dayName(9);
    }

    public static void dayName(int num) {
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Fridayday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day number");
                break;
        }
    }
}
