package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
		QAEngineer q1=new QAEngineer("Q1",1002);
		QAEngineer q2=new QAEngineer("Q2",1003);
		Employee[] team={q1,q2};

		Manager teamLead=new Manager("TeamLead",3000,1000,team);
		Programmer p1=new Programmer("P1",1000,teamLead);

		Programmer p2=new Programmer("P2",1001,teamLead);
		Manager m1=new Manager("M1",10000,1000,team);


		//Employee employee=new Employee("employee",1000);
		Intern i1=new Intern("Oleg",500);

        Employee[] employees ={p1,p2,q1,q2, m1, i1};
		for (int i = 0; i < employees.length ; i++) {
			employees[i].paySalary();
			employees[i].doWork();
		}
		//System.out.println(m1);

		//m1.paySalary();
		System.out.println("----------------------------------");
		for (int i = 0; i < employees.length ; i++) {
			System.out.println(employees[i].toString());
		};

		System.out.println(p1);


		System.out.println("_______ team  -----------------");
		Manager manager1=new Manager("manager1",10000,1000);
		manager1.add(p1);
		manager1.add(q1);
		manager1.add(p2);
		manager1.add(q2);
		manager1.add(i1);

		System.out.println(Arrays.toString(manager1.getTeam()));

    }
}
