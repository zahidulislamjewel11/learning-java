package com.zahid.exceptionthrow.matrix;
import org.w3c.dom.ls.LSOutput;

public class MatrixTest {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        int a[][] = matrix.random(5, 5);
        int b[][] = matrix.random(5, 5);

        System.out.println("Multiplication: ");
        int[][] multiply = matrix.multiply(a, b);
        matrix.display(multiply);
//        matrix.display(matrix.multiply(a, b));
        System.out.println();

        System.out.println("Addition: ");
        int[][] add = matrix.add(a, b);
        matrix.display(add);
        System.out.println();

        System.out.println("Subtraction: ");
        int[][] sub = matrix.sub(a, b);
        matrix.display(sub);
        System.out.println();
    }

}
