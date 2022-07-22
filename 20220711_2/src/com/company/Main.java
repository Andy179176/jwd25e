package com.company;


import java.util.Arrays;

public class Main {
    int qwe;

    public static void main(String[] args) {

        Person p1 = new Person("Person1");
        Person p2 = new Person("Person2");
        Person[] persons ={
                new Person("P1"),
                new Person("P2"),
                new Person("P3"),
                new Person("P4"),
                new Person("P5"),
                new Person("P6"),
        };

        System.out.println(p1);
        System.out.println(p2);
        p1.num=10;
        System.out.println("-------- p1.num=10; ");
        System.out.println(p1);
        System.out.println(p2);

        p2.num=20;
        System.out.println("-------- p2.num=20; ");
        System.out.println(p1);
        System.out.println(p2);

        Person.num=30;
        System.out.println("-------- p3.num=20; ");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("------------------------------------------------");

        for (Person p: persons ) {
            System.out.println(p);
        }


        MySqlComnectionSinglton mySqlComnectionSinglton = MySqlComnectionSinglton.getPersonSinglton();
        mySqlComnectionSinglton.connect();
        MySqlComnectionSinglton2 mySqlComnectionSinglton2 = MySqlComnectionSinglton2.getPersonSinglton("192.168.11.1");
        mySqlComnectionSinglton2.connect();

    }



}
