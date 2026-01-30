package TEMA3;

import java.util.Scanner;

public class Ejercicio15_Tema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero nautral: ");
        int numero = sc.nextInt();

        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
    }
}
