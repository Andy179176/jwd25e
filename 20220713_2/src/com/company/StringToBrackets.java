package com.company;

public class StringToBrackets implements StringTransformer {

    @Override
    public String transform(String s){
        return "("+s + ")";
    }
}
