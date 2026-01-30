package TEMA3;

import java.util.Scanner;

public class Ejercicio13_Tema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero positivo: ");
        int numero = sc.nextInt();

        int cifras = 0;
        while (numero > 0 ){
            numero /= 10;
            cifras++;
        }
        System.out.println("El numero tiene " + cifras + " cifras.");
    }
}
