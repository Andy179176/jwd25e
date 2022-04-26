package com.company;

public class Demo {

    public double min(double num1, double num2){
        return (num1>num2)?num2:num1;
    }

    public double min(double num1, double num2,double num3){
        double min12=min(num1,num2);
        return  min(min12,num3);
    }

    public double min(double[] array){
        double min= array[0];
        for (int i = 0; i <array.length ; i++) {
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }


}
