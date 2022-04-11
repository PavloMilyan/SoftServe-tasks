package com.company;

public class Main {

    public static void main(String[] args) {

        Cat f_cat = new Cat("Mikky", 3);
        Cat s_cat = new Cat("Kitty", 2);
        Cat t_cat = new Cat("Bitty", 5);

        System.out.println("Name is: " + f_cat.getName());
        System.out.println("Age is: " + s_cat.getAge());

        s_cat.setName("Murzik");
        System.out.println("New name is: " + s_cat.getName());
        System.out.println("Name and age is: " + s_cat.toString());
        System.out.println(f_cat.equals(s_cat));

        }
    }




