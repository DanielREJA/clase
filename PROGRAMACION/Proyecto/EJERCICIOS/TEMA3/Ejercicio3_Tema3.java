package PRACTICA;

import java.util.Scanner;

public class Ejercicio3_Tema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce letra o caracter");
        char caracter = sc.next().charAt(0);

        if (Character.isLetter(caracter)) {
            System.out.println("El caracter es alfabetico");
        } else if (Character.isDigit(caracter)) {
            System.out.println("El caracter es una cifra numerica");
        } else {
            System.out.println("El caracter es otro tipo de simbolo");
        }
    }

}
