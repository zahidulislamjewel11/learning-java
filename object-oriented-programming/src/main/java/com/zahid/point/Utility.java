package com.zahid.point;
public class Utility {

    public static double getDeterminant(Point P, Point Q, Point R) {
        int x1 = P.x;
        int y1 = P.y;

        int x2 = Q.x;
        int y2 = Q.y;

        int x3 = R.x;
        int y3 = R.y;
        
        int d1 = x1*y2 + x2*y3 + x3*y1;
        int d2 = y1*x2 + y2*x3 + y3*x1;

        double D = Math.abs(0.5 * (d1 - d2));

        return D;
        
    }
}