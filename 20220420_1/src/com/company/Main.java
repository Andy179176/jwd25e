package com.company;

public class Main {

    public static void main(String[] args) {
        Demo demo=new Demo();
        System.out.println(demo.min(18,10));
        System.out.println(demo.min(18,10,7));
        System.out.println(demo.min(new double[]{12.0,6.0,7.0,18.2,3.1}));


    }
}
