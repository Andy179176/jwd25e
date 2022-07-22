package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        StringToUpperCase toUpperCase=new StringToUpperCase();
        StringToBrackets toBrackets = new StringToBrackets();

        StringTransformer toLowerCase = new StringTransformer() {
            @Override
            public String transform(String string) {
                return  string.toLowerCase();
            }
        };


        System.out.println(stringHandler("Jack", toUpperCase));
        System.out.println(stringHandler("Jack", toBrackets));
        System.out.println(stringHandler("Jack", toLowerCase));


        /* not Functional Interface */
        String res=stringHandler("rtyuio", new StringToBrackets(){
            public String transform(String string) {
                return super.transform(string) + "QWERTYU";
            }

        });
        System.out.println(res);



        System.out.println(stringHandler(" duhuo      ", new StringTransformer() {
            @Override
            public String transform(String string) {
                return string.trim();
            }
        }));


        System.out.println(stringHandler(" duhuo      ",(String s) -> {return s.trim();}));
        System.out.println(stringHandler(" duhuo      ",(s) -> {return s.trim();}));
        System.out.println(stringHandler(" duhuo      ",s -> {return s.trim();}));
        System.out.println(stringHandler(" duhuo      ",s -> s.trim() ));
        System.out.println(stringHandler(" duhuo      ",String::trim));

        StringTransformer st1= s -> s.trim();
        System.out.println(stringHandler(" duhuo      ",st1));

        StringTransformer st2= s->{
            if(s.length()>3) {
                s=s.toLowerCase();
            } else {
                s=s.toLowerCase()+"!";
            }
            return s;
        };

        System.out.println(stringHandler("h",st2));
        System.out.println(stringHandler("QWERTYUIO",st2));

        System.out.println("----------------------------------------------------");
        List<String> list = List.of("QWER","asd","ASDFGHJK","wertyui");
        list.stream()
            .filter(s->s.length()>3)
            .map(String::toLowerCase)
            .sorted(String::compareTo)
            .collect(Collectors.toList());


    }




    public static String stringHandler(String s, StringTransformer service){
        return service.transform(s);
    }
}


