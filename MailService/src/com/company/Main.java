package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	•   Create interface MailDeliveryService with one method void sendMail ()
	•   Create class DHL that should implement the interface MailDeliveryService.
	    Its way to send mail is print something like: “Put a letter in an envelope, put a stamp, send”
	•   Create class Email that should implement the interface MailDeliveryService.
	    Its way to send mail is print something like: “Send by internet”
	•   Create class Pigeon that should implement the interface MailDeliveryService.
	    Its way to send mail is print something like: “Pigeon?! In the twenty-first century,
	    really?!!! 	You are crazy! I'm flying away”
	•   Create class Sender with the method send in it.
	    As argument this method takes the MailDeliveryService and send the mail using given service.
	•   Your program should ask user (use Scanner) how to send mail and send it using Sender.
	*/
        int choice=inputChoice();

        MailServiceFactory factory = new MailServiceFactory();
        MailDeliveryService mailService =
                              factory.getMailService(choice);
        Sender sender = new Sender();
        System.out.println(sender.send(mailService));

    }

    public static int inputChoice(){
        int choice=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Which service to use to send mail?");
            System.out.println("1.DHL  2.EMAIL  3.PIGEON");
            choice = sc.nextInt();
        }while (choice<1 || choice>3);
        sc.close();
        return choice;
    }
}
