package com.company;
/*
Есть два класса:
public class BankAccountWithOwner {
String IBANN;
Person owner;
}
public class Person {
String name;
}
нужно написать функцию, которая возвращает мапу, где значением является Person, а
значением - список его банковских счетов.
*/


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Person p1= new Person("Jack");
        Person p2= new Person("John");
        Person p3= new Person("Nick");
        Person p4= new Person("Anna");
        Person p5= new Person("Rick");

        List<BankAccountWithOwner> list = List.of(
          new BankAccountWithOwner(p1,"p1_1111"),
          new BankAccountWithOwner(p2,"p2_1112"),
          new BankAccountWithOwner(p1,"p1_1122"),
          new BankAccountWithOwner(p3,"p3_1101"),
          new BankAccountWithOwner(p3,"p3_1102"),
          new BankAccountWithOwner(p3,"p3_1104"),
          new BankAccountWithOwner(p4,"p4_4444"),
          new BankAccountWithOwner(p5,"p4_5555")

        );

        System.out.println(mapAccountToPerson(list));

    }

    public static Map<Person,List<String>> mapAccountToPerson(List<BankAccountWithOwner> list){
        Map<Person,List<String>> res= new HashMap<>();
        if (list==null||list.isEmpty()) return res;

        for (BankAccountWithOwner ba:list) {
            List<String> value=res.get(ba.getOwner());
            if(value==null) value=new ArrayList<>();
            value.add(ba.getIBANN());
            res.put(ba.getOwner(),value);
        }

        return res;
    }



}
