package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner timeSpent1 = new Scanner((System.in));
        int t1;
        System.out.println("Enter the spent time for first call: ");
        t1 = timeSpent1.nextInt();

        Scanner timeSpent2 = new Scanner((System.in));
        int t2;
        System.out.println("Enter the spent time for second call: ");
        t2 = timeSpent2.nextInt();

        Scanner timeSpent3 = new Scanner((System.in));
        int t3;
        System.out.println("Enter the spent time for third call: ");
        t3 = timeSpent3.nextInt();

        Scanner callStandart1  = new Scanner((System.in));
        int c1;
        System.out.println("Enter first call price: ");
        c1 = callStandart1.nextInt();

        Scanner callStandart2 = new Scanner((System.in));
        int c2;
        System.out.println("Enter second call price: ");
        c2 = callStandart2.nextInt();

        Scanner callStandart3 = new Scanner((System.in));
        int c3;
        System.out.println("Enter third call price: ");
        c3 = callStandart3.nextInt();

        int f_price = t1*c1;
        int s_price = t2*c2;
        int t_price = t3*c3;

        int allCalls = f_price + s_price + t_price;
        System.out.println("Your first call worth: " + f_price);
        System.out.println("Your second call worth: " + s_price);
        System.out.println("Your third call worth: " + t_price);

        System.out.println("All your calls worth: " + allCalls);

    }
}
