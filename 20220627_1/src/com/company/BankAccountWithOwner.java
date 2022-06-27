package com.company;

public class BankAccountWithOwner {
    private String IBANN;
    private Person owner;

    public BankAccountWithOwner(Person owner, String IBANN ) {
        this.owner = owner;
        this.IBANN = IBANN;
    }

    public String getIBANN() {
        return IBANN;
    }

    public Person getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return IBANN + " (" +owner +")";
    }
}
