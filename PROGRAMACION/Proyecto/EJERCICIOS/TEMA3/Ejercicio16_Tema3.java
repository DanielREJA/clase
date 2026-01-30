package TEMA3;

import java.util.Scanner;

public class Ejercicio16_Tema3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        final double CONVERSION_RATE = 166.386;

        while (true) {
            System.out.println("Introduce una cantidad de pesetas(0 para salir): ");
            double pesetas = sc.nextDouble();

            if (pesetas== 0) {
                break;
            } else if (pesetas > 0){
                double euros = pesetas/CONVERSION_RATE;
                System.out.println(pesetas + " pesetas son " + euros + " euros.");
            } else {
                System.out.println("El valor introducido debe ser mayor que cero.");
            }
        }
    }
}
