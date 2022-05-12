package com.company;

public class MailServiceFactory {

    public MailDeliveryService getMailService(int choice) {
        switch (choice) {
            case 1:
                return new DHL();
            case 2:
                return new Email();
            case 3:
                return new Pigeon();
        }
        return null;
    }
}
