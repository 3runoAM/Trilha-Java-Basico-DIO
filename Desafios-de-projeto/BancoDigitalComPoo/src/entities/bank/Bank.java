package entities.bank;

import entities.bank.account.Account;
import entities.bank.account.SavingAccount;
import entities.bank.account.TransationAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Bank {
    private final String nome;
    private List<Account> accounts;
    private List<Client> clients;

    public Bank(String nome) {
        this.nome = nome;
        this.accounts = new ArrayList<Account>();
        this.clients = new ArrayList<Client>();
    }

    public String getNome() {
        return nome;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public void addClient(Client client) {
        this.clients.add(client);
    }

    public Optional<Client> searchClient(String cpf){
        return clients.stream()
                .filter(c -> c.getCpf().equals(cpf))
                .findFirst();
    }

    public Optional<Account> searchAccount(long accountNumber) {
        return accounts.stream()
                .filter(a -> a.getAccountNumber() == accountNumber)
                .findFirst();
    }

    public boolean setSavingAccount(SavingAccount account, Client client) {
        if (client.getSavingAccount() == null) {
            client.setSavingAccount(account);
            return true;
        }
        return false;
    }

    public boolean setTransactionAccount(TransationAccount account, Client client) {
        if (client.getTransactionAccount()== null) {
            client.setTransactionAccount(account);
            return true;
        }
        return false;
    }
}
