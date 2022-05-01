package com.company;

import java.util.Scanner;

public class Person {
    String name;
    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;

        Person person = (Person) obj;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return name +" (" + age +
                ')';
    }

    public void print(){

    }

    public  Person newPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name=sc.nextLine();
        System.out.println("Возраст:");
        int age=sc.nextInt();
        return new Person(name,age);
    }



}
