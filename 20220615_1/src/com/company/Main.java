package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        User u1= new User("Jack",1980);
        User u2= new User("John",1977);
        User u3= new User("Nick",1991);
        User u4= new User("John",1977);
        User u5= new User("John",1986);

        List<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);

        System.out.println(users);
        System.out.println(removeDoubl(users));
        System.out.println("---------------------");
        System.out.println(users);
        removeDoubl2(users);
        System.out.println(users);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        /* /// error it's not work
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==2){
                list.remove(i);
            }
        }

         */
        /*
        for (Integer i:list) {
            if(i==2){
                list.remove(i);
            }
        }

         */

        //while (list.remove(Integer.valueOf(2)));

        Iterator<Integer> iterator=list.iterator();
        while (iterator.hasNext()){
            if(iterator.next()==2){
                iterator.remove();
            }
        }


        System.out.println(list);



        Set<User> users1 = new TreeSet<>();
        users1.add(u1);
        users1.add(u2);
        users1.add(u3);
        users1.add(u4);
        users1.add(u5);
        System.out.println(users1);


    }

    public static List<User> removeDoubl(List<User> list){
        if(list==null||list.isEmpty()) return list;
        return new ArrayList<User>(new HashSet<User>(list));
    }

    public static void removeDoubl2(List<User> list){
        if(list==null||list.isEmpty()) return;
        for (int i = 0; i < list.size() ; i++) {
            User u= list.get(i);
           while (Collections.frequency(list, u)>1){
               list.remove(u);
           }
        }

    }

}
