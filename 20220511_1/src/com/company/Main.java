package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Person[] people = {
	            new Person("Jack",28),
	            new Person("Nick",20),
	            new Person("Mike",30),
	            new Person("Andy",30),
	            new Person("Lena",25)
        };

		Person p1=new Person("P1",67);
		Person p2=new Person("P2",79);
		System.out.println(p1.compareTo(p2));
		System.out.println(p2.compareTo(p1));

		if(p2.compareTo(p1)>0){
			System.out.println(p2 + " старше " + p1);
		} else if (p2.compareTo(p1)<0) {
			System.out.println(p1 + " старше " + p2);
		} else {
			System.out.println("равны");
		}

        System.out.println(Arrays.toString(people));
		Arrays.sort(people);
		System.out.println(Arrays.toString(people));
		Arrays.sort(people,new ComparatorByName());
		System.out.println(Arrays.toString(people));
		Arrays.sort(people,new ComparatorByAge());
		System.out.println(Arrays.toString(people));
		Arrays.sort(people,new ComparatorByAge().reversed());
		System.out.println(Arrays.toString(people));
		Arrays.sort(people,new ComparatorByAge().thenComparing(new ComparatorByName().reversed()));
		System.out.println(Arrays.toString(people));

    }
}
