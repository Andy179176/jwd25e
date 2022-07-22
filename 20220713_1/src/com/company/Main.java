package com.company;

public class Main {

    public static void main(String[] args) {







    }
    public static void method(){   // Local
        class MyDate{
            private int day;
            private int month;
            private int year;

            public MyDate(int day, int month, int year) {
                this.day = day;
                this.month = month;
                this.year = year;
            }
        }
        MyDate date1= new MyDate(10,10,2000);

    }
}
