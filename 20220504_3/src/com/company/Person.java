package com.company;

public class Person  implements StringTransformerService {
    String name;

    @Override
    public String transform(String string) {
        return "В одно ухо влетело "+string +" в другое вылетело "+string+"неПонимаюНиЧего!";
    }
}
