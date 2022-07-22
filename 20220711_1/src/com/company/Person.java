package com.company;

public class Person {
    static int num=0;

    private String name;
    private MyDate birthday = new MyDate();

    class MyDate {
        private int day;
        private int month;
        private int year;

        public MyDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public MyDate() {
            // read the birthday from DB by Person.name
        }
    }
    public Person(String name) {
        this.name = name;


    }

    @Override
    public String toString() {
        return name + "   " + num;
    }
}




