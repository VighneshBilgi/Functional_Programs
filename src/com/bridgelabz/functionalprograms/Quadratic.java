package com.bridgelabz.functionalprograms;

import java.lang.Math;
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A value:");
        int a = sc.nextInt();

        System.out.println("Enter B value:");
        int b = sc.nextInt();

        System.out.println("Enter C value:");
        int c = sc.nextInt();

        int delta = b*b - 4*a*c;
        double root1 = (-b + Math.pow(delta,0.5))/(2*a);
        double root2 = (-b - Math.pow(delta,0.5))/(2*a);

        System.out.println("The Quadratic roots are : " + root1 +" and "+root2);

    }
}
