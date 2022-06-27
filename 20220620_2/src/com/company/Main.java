package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();

        map.put("a1",1);
        map.put("a2",1);
        map.put("a3",3);
        map.put("a4",4);
        //System.out.println(map.get("a1"));
        Set<String> keySet=map.keySet();
        for (String s :map.keySet()) {
            System.out.println(map.get(s));
        }
        System.out.println("------------------------");
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println("key " +entry.getKey() + " value " +entry.getValue());
        }

        System.out.println(map);

        List<String> names=Arrays.asList("qwe","ert","qwe","asss","ert","qwe");
        System.out.println(count(names));

    }
    public static Map<String,Integer> count(List<String> list){
       Map<String,Integer> result= new HashMap<>();
       if(list==null|| list.isEmpty()) return result;
        for (String str: list) {
            Integer i =result.getOrDefault(str,0);
            result.put(str,i+1);
        }
        return result;
    }

}
