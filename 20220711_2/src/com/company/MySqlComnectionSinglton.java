package com.company;

public class MySqlComnectionSinglton {
    private String host;
    private static final MySqlComnectionSinglton COMNECTION= new MySqlComnectionSinglton("192.168.0.1");

    private MySqlComnectionSinglton(String host) {
        this.host = host;
    }

    public static MySqlComnectionSinglton getPersonSinglton() {
        return COMNECTION;
    }
    public void connect(){
        System.out.println("connect to host " + host);
    }

}
