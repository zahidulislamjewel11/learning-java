package com.zahid.exceptionthrow.matrix;
import java.util.Random;

public class Matrix {
    Random random = new Random();

    public int[][] random(int m, int n)
    {
        int[][] c = new int[m][n];

        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++)
            {
                c[i][j] = random.nextInt(100);
            }

        }
        return c;
    }

    public int[][] multiply(int[][] a, int[][] b)
    {
        int mA = a.length;
        int nA = a[0].length;

        int mB = b.length;
        int nB = b[0].length;

        if(nA!=mB)
        {
            throw new RuntimeException("Illegal matrix dimensions");
        }

        int[][] c=new int[mA][nB];

        for (int i = 0; i < mA; i++) {
            for(int j=0;j<nB;j++)
            {
                for(int k=0;k<nA;k++)
                {
                    c[i][j] = c[i][j] + a[i][k]*b[k][j];
                }
            }

        }

        return c;
    }

    public int[][] add(int[][] a, int[][] b)
    {
        int m=a.length;
        int n=a[0].length;
        int[][] c=new int[m][n];

        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++)
            {
                c[i][j] = a[i][j]+b[i][j];
            }

        }
        return c;
    }

    public int[][] sub(int[][] a, int[][] b)
    {
        int m=a.length;
        int n=a[0].length;
        int[][] c=new int[m][n];

        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++)
            {
                c[i][j] = a[i][j]-b[i][j];
            }

        }
        return c;
    }


    public static void display(int x[][])
    {

        for (int i = 0; i < x.length; i++) {
            for(int j=0;j<x[i].length;j++)
            {
//                System.out.printf("%3d", x[i][j]);
                System.out.print(x[i][j]+"\t");
            }
            System.out.println();

        }
    }
}
