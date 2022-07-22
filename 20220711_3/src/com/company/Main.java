package com.company;

public class Main {

    public static void main(String[] args) {


        BuilderExample test = new BuilderExample.Builder(11,22).param3(33).param5(55).build();
        BuilderExample test1 = new BuilderExample.Builder(111,222).param4(44).build();
        System.out.println(test);
    }
}
