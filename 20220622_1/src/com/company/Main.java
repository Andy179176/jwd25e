package com.company;

import java.util.*;
/*
First level: Дан список Person {name,age} Необходимо сформировать map, где ключ
возраст а значение - количество людей данного возраста.


Second level: Дан список Person {name,age} Необходимо сформировать map,
где ключ возраст а значение - список людей данного возраста.




Дана Map<String,String>,  String1,String2     String1+String2,

mapAB({"a": "Hi", "b": "There"}) , "a", "b" -> mapAB({"a": "Hi", "b": "There", "ab":"HiThere"})

 */




public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Jan", 25);
        Person p2 = new Person("Lena", 40);
        Person p3 = new Person("John", 30);
        Person p4 = new Person("Pierre", 80);
        Person p5 = new Person("Olga", 67);
        Person p6 = new Person("Nick", 40);
        Person p7= new Person("Serge", 20);
        Person p8= new Person("Oleg", 30);
        Person p9= new Person("Ivan", 20);
        Person p10= new Person("Ivan", 20);

        List<Person> list = new ArrayList<>();

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);
        list.add(p9);
        list.add(p10);

        System.out.println(list);

        System.out.println(countingByAge(list));
        System.out.println(countingByAge2(list));
        System.out.println(mapByAge(list));
        System.out.println(mapByAge1(list));
        System.out.println(mapByAge2(list));

        
        Map<String,String> map = new HashMap();
        map.put("a","The class ");
        map.put("b","is start");
        map.put("c","is finish ");
        map.put("d","is interest");

        createEntryIfKeysPresent(map,"a","c");
        System.out.println(map);



        

    }

    public static Map<Integer,Integer> countingByAge(List<Person> list){
        Map<Integer,Integer> map = new HashMap<>();
        if(list==null||list.isEmpty()) return map;

        for (Person p:list) {
            Integer age=p.getAge();
            if(map.containsKey(age)){
                map.put(age,map.get(age)+1);
            } else {
                map.put(age,1);
            }
        }
        return map;
    }

    public static Map<Integer,Integer> countingByAge1(List<Person> list){
        Map<Integer,Integer> map = new HashMap<>();
        if(list==null||list.isEmpty()) return map;


        for (Person p:list) {
            Integer age=p.getAge();
            Integer value = map.get(age);

            if(value!=null){
                map.put(age,value+1);
            } else {
                map.put(age,1);
            }
        }
        return map;
    }



    public static Map<Integer,Integer> countingByAge2(List<Person> list){
        Map<Integer,Integer> map = new HashMap<>();
        if(list==null||list.isEmpty()) return map;
        for (Person p:list) {
            Integer age=p.getAge();
            map.put(age,map.getOrDefault(age,0) +1);
        }
        return map;
    }

    public static Map<Integer,List<Person>> mapByAge(List<Person> list){
        Map<Integer,List<Person>> map = new HashMap<>();
        if(list==null||list.isEmpty()) return map;


        for (Person p:list) {
            Integer age=p.getAge();
            List<Person> value = map.get(age);
            if(value == null){
                value=new ArrayList<>();
                value.add(p);
                map.put(age,value);
            } else {
                value.add(p);
            }

        }
        return map;

    }


    public static Map<Integer,List<Person>> mapByAge1(List<Person> list){
        Map<Integer,List<Person>> map = new HashMap<>();
        if(list==null||list.isEmpty()) return map;

        for (Person p:list) {
            Integer age=p.getAge();
            List<Person> value = map.getOrDefault(age, new ArrayList<>());
            value.add(p);
            map.put(age,value);
        }
        return map;

    }

    public static Map<Integer,List<Person>> mapByAge2(List<Person> list){
        Map<Integer,List<Person>> map = new HashMap<>();
        if(list==null||list.isEmpty()) return map;

        for (Person p:list) {
            Integer age=p.getAge();
            map.putIfAbsent(age,new ArrayList<>());
            List<Person> value = map.get(age);
            value.add(p);
        }
        return map;

    }

    /*
    public static List<Person> peers(List<Person> list, int age){
        List listPeers=new LinkedList();
        for(Person p: list) {
            if(p.getAge()==age){
                listPeers.add(p);
            }
        }
        return listPeers;
    }

    public static Map<Integer, Integer> createMapNumbers(List<Person> list) {
        Map<Integer, Integer> map = new HashMap<>();
        if (list == null || list.isEmpty()) return map;
        for (Person p : list) {
            if (!map.containsValue(p)) {  //здесь проверяется только ключ?
                map.put(p.getAge(), peers(list, p.getAge()).size());

            }
        }
        return map;
    }

    public static Map<Integer, List<Person>> createMapLists(List<Person> list) {
        Map<Integer, List<Person>> map = new HashMap<>();
        if (list == null || list.isEmpty()) return map;
        for (Person p : list) {
            if (!map.containsValue(p)) {
                map.put(p.getAge(), peers(list, p.getAge()));

            }
        }


     */
    
    
    public static void createEntryIfKeysPresent(Map<String,String> map, String key1,String key2){
        if(key1==null || key2==null || map==null || map.isEmpty()) return;

        String value1= map.get(key1);
        String value2= map.get(key2);
        if(value1!=null&&value2!=null){
            map.put(key1+key2,value1+value2);
        }
        
    }

    }
