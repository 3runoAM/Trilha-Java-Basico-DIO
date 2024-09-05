package entities.bank.account;

import entities.bank.Client;

public abstract class Account {
    protected long accountNumber;
    protected double balance;
    protected Client client;

    public Account(long accountNumber, double balance, Client client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public boolean deposit(double amount) {
        balance += amount;
        return true;
    }

    public double checkBalance(){
        return balance;
    };

}