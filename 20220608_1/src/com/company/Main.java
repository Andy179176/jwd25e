package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,1,3,6);
        list.set(1,10);
        System.out.println(list);

        List<Integer> list1 =List.of(1,2,34,2,1);
        //list1.set(0,19);

        List<Integer> list3= new ArrayList<>();
        list3.add(1);
        list3.add(16);
        list3.add(-1);

        List<Integer> list4= new ArrayList<>(list);

        System.out.println("-------------------------------");
        System.out.println(list);
        //reverse(list);
        Collections.reverse(list);

        System.out.println(list);
    }

    public static void reverse(List<Integer> list){
        int l = 0;
        int r = list.size()-1;

        while (l<r){
            Integer temp = list.get(r);
            list.set(r, list.get(l));
            list.set(l,temp);
            l++;
            r--;
        }
    }



}
