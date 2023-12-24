package Tarea1;

import java.util.Scanner;
//Suma de dígitos: Suma todos los dígitos de un número ingresado por el usuario. No usar la conversión a String para resolver el problema.
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, d, suma=0;
        n= sc.nextInt();
        while (n!=0) {
            d = n%10;
            n = n/10;
            suma = suma + d;
        }
        System.out.println(suma);
    }
}
