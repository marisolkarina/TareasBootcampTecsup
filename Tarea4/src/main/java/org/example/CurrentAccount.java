package org.example;

public class CurrentAccount implements Account{

    private double amount;
    private double saldo=0;
    private final double interesPrestamo=0.01;
    private double prestamo=0;

    public CurrentAccount(double amount, double saldo) {
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
        saldo = saldo + amount - interesPrestamo*prestamo;

    }

    @Override
    public void withdraw(double amount) {
        saldo = saldo - amount;
        if (saldo<0) {
            prestamo = Math.abs(saldo);
            System.out.println("Debes al banco: " + prestamo);

        }
    }

    @Override
    public double calculateInterest() {
        return Math.abs(interesPrestamo*prestamo);
    }
    //método específico
    public void limitePrestamo() {
        System.out.println("El límite de préstamos lo establece su banco");
    }
}
