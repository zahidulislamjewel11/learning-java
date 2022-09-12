package com.zahid.stringbuilder;

public class StringBuilderTest {
    public static void main(String[] args) {
        int a = 300;
        double b = 3.14;
        short c = 5;
        char d = 'A';

        // StringBuilder sb = new StringBuilder();
        StringBuffer sb = new StringBuffer();
        sb.append(a).append("\n").append(b).append("\n").append(c).append("\n").append(d);

        String result = sb.toString();
        System.out.println(result);

        StringBuilder builder = new StringBuilder("A quick brown fox");
        String str = builder.reverse().toString();
        System.out.println(str);
    }
}
