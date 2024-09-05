package entities.bank.account;

import entities.bank.Client;

public class TransationAccount extends Account{
    private double overdraft;

    public TransationAccount(long accountNumber, double balance, Client client, double overdraft) {
        super(accountNumber, balance, client);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    /**/
    public boolean withdraw(double amount){
        if (balance + overdraft > amount){
            balance -= amount;
            return true;
        }
        return false;
    };

    public boolean transfer(double amount, Account destination){
        if (balance + overdraft > amount){
            this.withdraw(amount);
            destination.balance += amount;
            return true;
        }
        return false;
    };
}
