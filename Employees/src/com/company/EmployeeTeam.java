package com.company;

public class EmployeeTeam {

    private int capacity = 2;
    private int curIndex=0;
    Employee[] team = new Employee[capacity];


    public void add(Employee e){
        if (curIndex==capacity){
            increaseToSize(capacity*2);
        }
        team[curIndex++]=e;
    }

    private void increaseToSize(int size){
        if(size>capacity){
            Employee[] temp = new Employee[size];
            for (int i = 0; i <team.length ; i++) {
                temp[i]=team[i];
            }
            capacity=size;
            team=temp;
        }
    }

    public Employee[] getTeam() {

        return team;

    }


}
