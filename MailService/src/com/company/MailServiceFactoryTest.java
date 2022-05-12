package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MailServiceFactoryTest {

    private MailServiceFactory factory;

    @BeforeEach
    public void setup() {
        factory = new MailServiceFactory();
    }

    @Test
    public void testEmail() {

        Assertions.assertInstanceOf(DHL.class, factory.getMailService(1));
    }

    @Test
    public void testPigeon() {
        Assertions.assertInstanceOf(Pigeon.class, factory.getMailService(3));
    }

    @Test
    public void testDHL() {
        Assertions.assertInstanceOf(Pigeon.class, factory.getMailService(3));
    }
}
