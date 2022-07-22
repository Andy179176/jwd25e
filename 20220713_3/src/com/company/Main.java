package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List<String> list = List.of("Jack", "John", "Georg III", "Filipp I");
	    Comparator<String> com1 = (s1,s2) -> s1.length() - s2.length();
	    Comparator<String> com2 = (s1,s2) -> s2.compareTo(s1);

	    printSortList(list,com2);
    }

    public static void printSortList(List<String> list, Comparator<String> comparator){
        List<String> newList = new ArrayList<>(list);
        newList.sort(comparator);
        for (String s: newList) {
            System.out.println(s);
        }

    }


}
