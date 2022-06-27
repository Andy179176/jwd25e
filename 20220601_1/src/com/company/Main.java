package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        Integer n=100;
        Integer n2=100;
        Integer n3=Integer.valueOf("14");
        //

        n++;



        System.out.println(n==n2);
        System.out.println(n.equals(n2));
        Integer n1=new Integer(10);
        m(n);

        Boolean bool=true;
        Character ch='c';

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(18);
        list.add(2);

        Iterator<Integer> iterator=list.iterator();
        ListIterator<Integer> listIterator=list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



        for (Integer i : list) {

        }

    }

    public static void m(int i){
        System.out.println(i);
    }
}
