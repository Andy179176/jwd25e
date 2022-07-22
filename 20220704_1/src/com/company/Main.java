package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Box box1= new Box(Integer.valueOf(1));
        Box box2= new Box("string");



        Integer o1=(Integer)box1.getValue();
        box1.setValue(o1+10);

        System.out.println(((String) box2.getValue()).length());


        System.out.println(box1);
        System.out.println(box2);


        Box2<Integer> box21= new Box2<>(Integer.valueOf(1));
        Box2<String> box22= new Box2<>("string");


        box21.setValue(box21.getValue()+10);
        System.out.println("----------------------");

        List<Box2> list= new ArrayList<>();
        list.add(box21);
        list.add(box22);

        for (Box2 b:list ) {
            System.out.println(b);
        }


        Box3<Integer,Integer> box31= new Box3<>(5,8);
        System.out.println(box31.additional());
    }
}
