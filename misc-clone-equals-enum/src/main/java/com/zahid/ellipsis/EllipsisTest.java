package com.zahid.ellipsis;
public class EllipsisTest {

    public static void display(int ...x) {
        for(int y:x) {
            System.out.printf("%d ", y);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        display();
        display(4);
        display(4, 9);
        display(4, 9, 2);
//        display(new int[]{4, 9, 2, 3, 5}); // anonymous array
    }
}
