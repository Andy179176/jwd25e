package com.company;

public class Person {
    public static final double QWERTY=0.75;  // constant

    private final int id;
    private  static int personNumber=0;
    static int num=0;
    private String name;


    public Person(String name) {
        this.name = name;
        personNumber+=10;
        id=personNumber;
    }

    @Override
    public String toString() {
        return id + ".  "+name + "   " + num;
    }




}

