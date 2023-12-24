package Tarea1;

import java.util.Scanner;

//Factorial de un número: Calcula el factorial de un número ingresado por el usuario. El factorial de un número n (representado como
//n!) es el producto de todos los enteros positivos menores o iguales a n.
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, fact=1;
        n = sc.nextInt();
        for (int i=1;i<=n;i++) {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
