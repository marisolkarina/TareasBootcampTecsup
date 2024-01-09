package ClasesAbstractas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radio;
        System.out.print("Radio: ");
        radio = sc.nextFloat();

        Circulo circulo = new Circulo("Amarillo",radio);
        System.out.println("Perímetro = "+circulo.perimetro());
        System.out.println("Área = "+circulo.area());
    }
}
