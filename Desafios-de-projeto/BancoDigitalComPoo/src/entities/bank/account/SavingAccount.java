package entities.bank.account;

import entities.bank.Client;

public class SavingAccount extends Account {
    private double withdrawFee;

    public SavingAccount(long accountNumber, double balance, Client client, double withdrawFee) {
        super(accountNumber, balance, client);
        this.withdrawFee = withdrawFee;
    }

    public double getWithdrawFee() {
        return withdrawFee;
    }

    public boolean withdraw(double amount) {
        if(amount + withdrawFee > balance) {
            balance -= amount + withdrawFee;
            return true;
        }
        return false;
    }

    public boolean transfer(double amount, Account destination){
        if (balance > amount){
            this.withdraw(amount);
            destination.balance += amount;
            return true;
        }
        return false;
    };
}
