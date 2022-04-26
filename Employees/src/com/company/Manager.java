package com.company;

public class Manager extends Employee {
    private double bonus;
    EmployeeTeam team=new EmployeeTeam();

    public void add(Employee e){
        team.add(e);
    }
    public Employee[] getTeam(){
        return team.getTeam();
    }


    public Manager(String name, double salary, double bonus, Employee[] team) {
        super(name, salary);
        this.bonus = bonus;
        //this.team=team;
    }



    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " The bonus is " + bonus;

    }



    public void doWork() {
        System.out.println("I am a manager I get big salary");
        System.out.println("and I say  work to my team");
        Employee[] temp=team.getTeam();
        for (int i = 0; i < temp.length ; i++) {
            if(temp[i]!=null) temp[i].doWork();
        }
    }

    @Override
    public void paySalary() {
        System.out.println(getName() + " get " + (getSalary() + bonus));
    }


}

