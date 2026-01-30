import java.util.Scanner;

public class Ejercicio11_Tema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dividendo: ");
        int dividendo = sc.nextInt();
        System.out.println("Introduce el divisor: ");
        int divisor = sc.nextInt();
        int contador = 0;

        while(dividendo >= divisor){
            dividendo -= divisor;
            contador++;
        }
        System.out.println("Resultado de la division: " + contador);
    }
}
