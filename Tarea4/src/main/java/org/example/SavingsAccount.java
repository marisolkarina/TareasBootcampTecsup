package org.example;

public class SavingsAccount implements Account{

    private double amount;
    private double saldo=0;
    private final double interes=0.05;

    public SavingsAccount(double amount, double saldo) {
        this.amount = amount;
        this.saldo = saldo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void deposit(double amount) {
        saldo = saldo + amount + amount*interes;
    }

    @Override
    public void withdraw(double amount) {
        if (saldo >= amount) {
            saldo = saldo - amount;
        } else {
            System.out.println("Saldo insuficiente: "+saldo);
        }

    }

    @Override
    public double calculateInterest() {
        return interes*amount;
    }

    //método específico
    public void calculateInterestRate() {
        System.out.println("La tasa de interés mensual es fija: 0.05");
    }
}
