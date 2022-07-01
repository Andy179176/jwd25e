package com.company;

public class ArgOfTheMethodException extends MyCheckedException {
 private int code;

    public ArgOfTheMethodException(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
