package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double radius;
        System.out.println("Enter the radius: ");
        radius = num.nextInt();

        double p = Math.PI * Math.pow(radius, 2);
        System.out.println("Your area is: "+ p);

        double d = 2 * Math.PI * radius;
        System.out.println("Your perimetr is: "+ d);
    }
}
