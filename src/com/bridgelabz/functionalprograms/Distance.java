package com.bridgelabz.functionalprograms;

import java.lang.Math;

public class Distance {
    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        System.out.println("X value is :"+x);

        int y = Integer.parseInt(args[1]);
        System.out.println("Y value is :"+y);

        double e_dist = Math.pow((Math.pow(x,2)+Math.pow(y,2)),0.5);

        System.out.println("Euclidean Distance between (" + x + "," + y +") and (0,0) is :" + e_dist);

    }
}
