package org.example;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();


    //agregar cuentas  a la lista del banco
    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void depositarMonto (double amount, Account account) {
        account.deposit(amount);
    }

    public void retirarMonto (double amount, Account account) {
        account.withdraw(amount);
    }
}
