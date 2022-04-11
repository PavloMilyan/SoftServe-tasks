package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n;
        System.out.println("Enter the number: ");
        n = num.nextInt();

        String a = Integer.toString(n);
        String res = a.substring(a.length()-1);
        boolean avb = false;
        for (int i=0; i<a.length(); i++){
            if(a.charAt(i)=='3'){
                avb = true; }
        }
        System.out.println(avb);

        ///////////

        for (int i = a.length() - 2; i >= 0; i--){
            res = res.concat(a.substring(i, i+1));}
        int n1 = Integer.parseInt(res);
        System.out.println("Reverse is " + n1);

        ///////////

        int number;
        String text = String.valueOf(n);
        text = text.substring(text.length()-1)+text.substring(1, text.length()-1)+text.substring(0, 1);
        number = Integer.parseInt(text);
        System.out.println("Change is " + number);

        ////////////

        System.out.println("1" + n + "1");


    }
}
