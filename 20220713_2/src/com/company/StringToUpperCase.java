package com.company;

public class StringToUpperCase implements StringTransformer {

    @Override
    public String transform(String s){
        return s.toUpperCase();
    }

}
