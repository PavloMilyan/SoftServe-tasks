package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner question = new Scanner(System.in);
        System.out.println("What is your name?");
        String message = question.nextLine();
        System.out.println("Where do you live " + message + "?");

        Scanner sQuestion = new Scanner(System.in);
        String sMessage = sQuestion.nextLine();
        System.out.println(message + " lives in "+ sMessage);
    }
}
