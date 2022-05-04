package com.company;

public class Main {

    public static void main(String[] args) {
        String str="hello!";
	    StringTransformer tr1=new FirstCharToUpperCase();
        StringTransformer tr2=new AddRoundBracketsToString();

        StringTransformer[] transformers = {tr1,tr2};

        System.out.println(transformStringMethod("java is easy",transformers));



    }
    public static String transformStringMethod(String string,StringTransformer[] transformers){
        for (int i=0;i<transformers.length;i++){
            string=transformers[i].transform(string);
        }
        return string;
    }
}
