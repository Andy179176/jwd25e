package com.company;

public class Main {

    public static void main(String[] args) {
        String str="hello!";
	    StringTransformerService tr1=new FirstCharToUpperCase();
        StringTransformerService tr2=new AddRoundBracketsToString();

        StringTransformerService[] transformers = {tr1,tr2};

        System.out.println(transformStringMethod("java is easy",transformers));

        System.out.println(transformStringMethod("hello",tr1));
        System.out.println(transformStringMethod("hello java",tr2));
        System.out.println(transformStringMethod("hello java",new Person()));


    }
    public static String transformStringMethod(String string,StringTransformerService[] transformers){
        for (int i=0;i<transformers.length;i++){
            string=transformers[i].transform(string);
        }
        return string;
    }

    public static String transformStringMethod(String string,StringTransformerService transformers){
            return string=transformers.transform(string);
        }
}



