package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 1, b = 3, c = 5, x = 4, y = 2;

        if(a <= y && b <= x){
            System.out.println("Brick goes through the hole");
        } else System.out.println("Brick does not go through the hole");
        if(b <= y && a <= x){
            System.out.println("Brick goes through the hole");
        } else System.out.println("Brick does not go through the hole");

        if(c <= y && a <= x){
            System.out.println("Brick goes through the hole");
        } else System.out.println("Brick does not go through the hole");
        if(a <= y && c <= x){
            System.out.println("Brick goes through the hole");
        } else System.out.println("Brick does not go through the hole");

        if(b <= y && c <= x){
            System.out.println("Brick goes through the hole");
        } else System.out.println("Brick does not go through the hole");
        if(c <= y && b <= x){
            System.out.println("Brick goes through the hole");
        } else System.out.println("Brick does not go through the hole");

    }
}
