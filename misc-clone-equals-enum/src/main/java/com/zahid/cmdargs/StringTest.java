package com.zahid.cmdargs;

public class StringTest {
    public static void main(String[] args) {
        String line = "Java Programming is Fun";
        String newLine = ". So is C & CPP.";
        System.out.println(line);
        System.out.println(line.length());
        System.out.println(line.substring(5, 16));
        System.out.println(line.toUpperCase());
        System.out.println(line.toLowerCase());
        String finalLine = line.concat(newLine);
        System.out.println(finalLine);   
        System.out.println();

        String name1 = "Zahid";
        String name2 = "zahid";
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.equalsIgnoreCase(name2));
        System.out.println();

        System.out.println(name1.compareTo(name2));
        System.out.println(name1.startsWith("s"));
        System.out.println(name1.startsWith("Z"));
        System.out.println(name1.endsWith("t"));
        System.out.println(name1.endsWith("d"));
        System.out.println();

        String dialog = " A man can be destroyed but not defeated   ";
        System.out.println(dialog.length());
        System.out.println(dialog.strip());
        System.out.println(dialog.length());
        System.out.println();   

        int num = 492;
        System.out.println(num);
        System.out.println(num + 8);
        System.out.println(String.valueOf(num) + 8);
        System.out.println(Integer.toString(num) + 8);
        System.out.println();

        String number = "816";
        System.out.println(number);
        System.out.println(number + 4);
        System.out.println(Integer.parseInt(number) + 4);
        System.out.println();

        String newDialog = dialog.strip();
        System.out.println(newDialog);
        System.out.println(newDialog.indexOf('t'));
        System.out.println(newDialog.lastIndexOf('t'));
        System.out.println();

        System.out.println();

        new StringTest().testObjectReference();
    }

    public void testObjectReference() {
        System.out.println(this);
        System.out.println(this.hashCode());
        System.out.println(this.getClass());
        System.out.println(this.getClass().getName());
        System.out.println(this.getClass().getSimpleName());
        System.out.println(this.getClass().getCanonicalName());
        System.out.println(this.getClass().getPackageName());
        System.out.println(this.getClass().getTypeName());
        System.out.println();

    }
}











