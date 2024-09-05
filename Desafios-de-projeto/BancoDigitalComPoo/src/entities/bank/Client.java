package entities.bank;

import entities.bank.account.SavingAccount;
import entities.bank.account.TransationAccount;

import java.util.Objects;

public class Client {
    private final String name;
    private final String cpf;
    private final String address;
    private final int phone;
    private TransationAccount transactionAccount;
    private SavingAccount savingAccount;

    public Client(String name, String cpf, String address, int phone) {
        this.name = name;
        this.cpf = cpf;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public TransationAccount getTransactionAccount() {
        return transactionAccount;
    }

    public SavingAccount getSavingAccount() {
        return savingAccount;
    }

    protected void setTransactionAccount(TransationAccount transactionAccount) {
        this.transactionAccount = transactionAccount;
    }

    protected void setSavingAccount(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }

    public String toString() {
        return "Client: [Name: %s, CPF: %s, Address: %s, Phone: %s]".formatted(name, cpf, address, phone);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(getCpf(), client.getCpf());
    }
}
