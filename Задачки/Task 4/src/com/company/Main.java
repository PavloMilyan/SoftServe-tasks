package com.company;

public class Main {

    public static void main(String[] args) {
        //Person [] persons = { new Person("Oleg", 1998), new Person("Yuriy", 2002),
        //new Person("Vasyl", 1986), new Person("Taras", 1995),
        //new Person("Andriy", 2000)};

            Person persons = new Person("Oleg", 2000);

            System.out.println("Name is: " + persons.getName());
            System.out.println("Age is: " + persons.getAge());

            persons.setName("Ivan");
            System.out.println("New name is: " + persons.getName());
            }
        }

