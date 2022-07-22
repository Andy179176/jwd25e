package com.company;

public class MySqlComnectionSinglton2 {
    private String host;
    private static  MySqlComnectionSinglton2 COMNECTION = null;

    private MySqlComnectionSinglton2(String host) {
        this.host = host;
    }

    public static MySqlComnectionSinglton2 getPersonSinglton(String host) {
        if(COMNECTION==null) {
            COMNECTION= new MySqlComnectionSinglton2(host);
        }
        return COMNECTION;
    }

    public void connect(){
        System.out.println("connect to host " + host);
    }

}
