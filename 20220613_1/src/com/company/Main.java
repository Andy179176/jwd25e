package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> hashSet= new HashSet<>();
        hashSet.add(2);
        hashSet.add(10);
        hashSet.add(8);
        hashSet.add(2);
        hashSet.add(1);
        hashSet.add(9);

        System.out.println(hashSet);

        Set<Person> people = new HashSet<>();
        Person p1=new Person("Ivan", 33);
         people.add(new Person("Jack",23));
         people.add(new Person("Nick",22));
         people.add(new Person("Jack",23));
         people.add(new Person("John",30));
         people.add(p1);


        Map<Person, Integer> map = new HashMap<>();
        people.forEach((p)->map.merge(p,1,(count,incr)-> count+incr));
        System.out.println(map);

        System.out.println(people);
        people.remove(p1);
        p1.age =34;
        people.add(p1);
        System.out.println(people.contains(p1));
        System.out.println(people);


    }
}
