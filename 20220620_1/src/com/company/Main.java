package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> list1= new ArrayList<>();
        list1.add("a");
        list1.add("a");
        list1.add("b");
        list1.add("c");

        List<String> list2= new ArrayList<>();
        list2.add("v");
        list2.add("a");
        list2.add("n");
        list2.add("c");

        System.out.println(getSame(list1,list2));


    }

    public static List<String> getSame(Collection<String> coll1, Collection<String> coll2){

        coll1.retainAll(coll2);

        return new ArrayList<String>(coll1);
    }
}
