package com.company;

public class Main {

    public static void main(String[] args) {

        Person p1=new Person("Ivan",20);
        Person p2=new Person("Oleg",30);
        Person p3=new Person("Ivan",20);

        String str1="hello";
        String str2="hello";
        String str3= new String("hello");
        String str111;


        //System.out.println(str1==str2);
        //System.out.println(p1==p3);

        System.out.println(str1==str2);
        str3=str3.intern();
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));

        Person p4=p1.newPerson();
        System.out.println(p4);

        int a=10;
        int b=10;
        int c=1;

        }
}
