package com.company;

public class Box3<T1 extends Number ,T2 extends Number> {
    private T1 value1;
    private T2 value2;
    String str;
    T1 value3;

    public Box3(T1 value1, T2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double additional(){
        return value1.doubleValue()+value2.doubleValue();
    }




}
