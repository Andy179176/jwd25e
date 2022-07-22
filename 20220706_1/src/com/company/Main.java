package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    List<Integer> listInt= List.of(1,4,2,4,1,3,7,1);
	List<Integer> l1=removeDuplicates(listInt);
	//List<String> l2=removeDuplicates(List.of("q","rty","yu","q","rty"));
        System.out.println(l1);
      //  System.out.println(l2);
        HashMap map;

    }

    public static <T>  List<T> removeDuplicates(List<T> list){
        System.out.println(y);
        return new ArrayList<>(new HashSet<T>(list));
    }

}
