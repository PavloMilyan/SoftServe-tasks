package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
            float a;
        System.out.println("Enter the first number: ");
        a = num1.nextFloat();

        Scanner num2 = new Scanner(System.in);
            float b;
        System.out.println("Enter the second number: ");
        b = num2.nextFloat();

        Scanner num3 = new Scanner(System.in);
            float c;
        System.out.println("Enter the third number: ");
        c = num3.nextFloat();

        if(-5 <= c && c <= 5 && -5 <= b && b <= 5 && -5 <= a && a <= 5) {
            System.out.println("Numbers belong to the range");
        } else System.out.println("Numbers are not in the range");

        /////

        float max = Math.max( Math.max(a,b), c);
        float min = Math.min( Math.min(a,b), c);

        System.out.println("Maximum is: " + max);
        System.out.println("Minimum is: " + min);
        }

    }
