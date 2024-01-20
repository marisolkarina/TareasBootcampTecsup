package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("1. Saving Account");
        System.out.println("2. Current Account");

        int tipoCuenta = sc.nextInt();
        int transaccion;
        double saldo=100;

        System.out.println("1. Depósito");
        System.out.println("2. Retiro");
        System.out.println("3. Salir");

        SavingsAccount savingsAccount = new SavingsAccount(0, 100);
        CurrentAccount currentAccount = new CurrentAccount(0, 100);

        do {
            System.out.println("Opción elegida: ");
            transaccion = sc.nextInt();

            if (transaccion == 3 || (transaccion!=1 && transaccion!=2)) {
                break;
            }

            double monto;

            if (transaccion == 1) {
                System.out.println("Ingrese el monto a depositar: ");
                monto = sc.nextDouble();
            } else {
                System.out.println("Ingrese el monto a retirar: ");
                monto = sc.nextDouble();
            }


            if (tipoCuenta == 1) {
                savingsAccount.setAmount(monto);
                bank.addAccount(savingsAccount);

                if (transaccion == 1) {
                    bank.depositarMonto(monto, savingsAccount);
                    System.out.println("Intereses ganados:  "+savingsAccount.calculateInterest());
                    System.out.println("Nuevo saldo: " + savingsAccount.getSaldo());
                    savingsAccount.calculateInterestRate();

                } else {
                    bank.retirarMonto(monto, savingsAccount);
                    System.out.println("Nuevo saldo: " + savingsAccount.getSaldo());
                }


            } else {
                currentAccount.setAmount(monto);
                bank.addAccount(currentAccount);

                if (transaccion == 1) {
                    bank.depositarMonto(monto, currentAccount);
                    System.out.println("Nuevo saldo: " + currentAccount.getSaldo());
                } else {
                    bank.retirarMonto(monto, currentAccount);
                    System.out.println("Nuevo saldo: " + currentAccount.getSaldo());
                    System.out.println("Intereses a cobrar por préstamo:  "+currentAccount.calculateInterest());
                    currentAccount.limitePrestamo();
                }

            }

            System.out.println("1. Depósito");
            System.out.println("2. Retiro");
            System.out.println("3. Salir");

        } while (transaccion!=3);



    }

}