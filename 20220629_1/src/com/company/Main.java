package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args)  {



        try {
       exceptionMethod2(-2);
        } catch (ArgOfTheMethodException e){
            System.err.println("Cath!!!!!   "+ e.getCode() );

            e.printStackTrace();
        }



        try {
            qwe();
        } catch (FileNotFoundException e){
            System.out.println("FileNotFoundException схвачен и обезврежен в main() ");
        }

    }

    public static void qwe() throws FileNotFoundException{
        try {
            exceptionMethod();
        } catch (ArithmeticException e){
            System.out.println("ArithmeticException схвачен и обезврежен в qwe() ");
            return;
        }finally {
            System.out.println("----finally code is done ----");
        }
        System.out.println("Все ок");


    }

    public static void exceptionMethod2(int k) throws ArgOfTheMethodException {
        if(k<-5) throw new ArgOfTheMethodException(7);
        if(k<0) throw new ArgOfTheMethodException(777);
    }



    public static void exceptionMethod() throws FileNotFoundException {
        //

        try  {
            int res = 19 / 0;  //ArithmeticException
            FileReader fr = new FileReader("d:/10.txt");
            Thread.sleep(10);


        } catch (InterruptedException e) {
            System.err.println("ArithmeticException или InterruptedException схвачен и обезврежен в exceptionMethod ");
        } catch (IOException e){
            System.err.println("----IOException схвачен и обезврежен в exceptionMethod ");
        }


    }

}
