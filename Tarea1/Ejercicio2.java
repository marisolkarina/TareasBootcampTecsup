package Tarea1;
//Suma de números impares: Suma todos los números impares del 1 al 100.
public class Ejercicio2 {
    public static void main(String[] args) {
        int suma=0;
        for (int i=1;i<=100;i++) {
            if (i%2!=0) {
                suma = suma + i;
            }
        }
        System.out.println(suma);
    }
}
