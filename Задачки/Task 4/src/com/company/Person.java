package com.company;

public class Person {
    private String name;
    private int birth_year;

    public Person(String name, int birth_year) {
        this.name = name;
        this.birth_year = birth_year;
    }

        public int getAge () {
            return 2022 - birth_year;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;

    }

}
