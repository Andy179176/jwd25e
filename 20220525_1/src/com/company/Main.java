package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Jack",35);
        Person p2 = new Person("Lena",27);
        Person p3 = new Person("John",30);

        List<Person> list = new LinkedList<>();

        list.add(p1);
        list.add(p2);
        list.add(p3);
        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.size());
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i) + "   ");
        }
        System.out.println();

        list.remove(0);
        System.out.println(list);







        int[] array={1,2,3,4};
        array=Arrays.copyOf(array,10);
        //array =Arrays.copyOfRange(array,0,2);
        System.out.println(Arrays.toString(array));
        System.arraycopy(array,0,array,6,2);

        System.out.println(Arrays.toString(array));

        System.out.println("------------------------------");
        PersonLinkedList myList = new PersonLinkedList();
        myList.add(p1);
        myList.add(p2);
        myList.add(p3);
        System.out.println(myList.size());
        myList.print();


    }
   // TODO
    public List<Person> getPersonsWithShortName(List<Person> list){

    }

}
