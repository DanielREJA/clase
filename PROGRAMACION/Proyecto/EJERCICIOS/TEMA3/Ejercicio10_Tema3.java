package TEMA3;

import java.util.Scanner;

public class Ejercicio10_Tema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdce el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Introdce el segundo numero");
        int num2 = sc.nextInt();

        int resultado = 0;
        for(int i = 0; i < num2; i++) {
            resultado += num1;
        }
        System.out.println(num1 + " * " + num2 + " = " + resultado);
    }
}
