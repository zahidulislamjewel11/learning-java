package com.zahid.methodoverloading.maxima;

public class Maxima {
    int max(int x,int y) {
        return x>y?x:y;
    }

    int max(int x,int y, int z) {
        return x>y && x>z?x:(y>z?y:z);
    }

    float max(float x,float y) {
        return x>y?x:y;
    }
}
