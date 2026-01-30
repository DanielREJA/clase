package TEMA3;

import java.util.Scanner;

public class Ejercicio2_tema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero del dia de la semana (1-7): ");
        int dia = sc.nextInt();

        switch (dia)  {
            case 1:
                System.out.println("Lunes - musica");
                break;
            case 2:
                System.out.println("Martes - Natacion");
                break;
            case 3:
                System.out.println("Miercoles - Ingles");
                break;
            case 4:
                System.out.println("Jueves - natacion");
                break;
            case 5:
                System.out.println("Viernes - Sin actividades");
                break;
            case 6:
                System.out.println("sabado - deporte escolar");
                break;
            case 7:
                System.out.println("Domingo - Sin actividades");
                break;
            default:
                System.out.println("Valor erroneo");
                break;
        }

    }
}
