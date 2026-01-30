package TEMA3;

import java.util.Scanner;

public class Ejercicio17_Tema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[]facturacion = new double[12];
        double totalAnual = 0;

        for (int i = 0; i < 12; i++) {
            System.out.println("Introduce la facturacion del mes " + (i + 1) + ":");
            facturacion[i] = sc.nextDouble();
            totalAnual += facturacion[i];
        }

        System.out.println("El total anual es: " + totalAnual);

    }
}
