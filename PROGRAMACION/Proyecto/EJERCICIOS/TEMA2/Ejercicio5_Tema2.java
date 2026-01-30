import java.util.Random;
import java.util.Scanner;

public class Ejercicio5_Tema2 {
    public static void main(String[] args) {
        Random ra = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un numero entero: ");
        int numero = sc.nextInt();

        System.out.println("Dame otro numero entero: ");
        int numero2 = sc.nextInt();

        double aleatorio1 = Math.random() * numero2;
        double aleatorio2 = Math.random() * numero;
        double aleatorio3 = Math.random() * numero;
        int num1 = (int) aleatorio1;
        int num2 = (int) aleatorio2;
        int num3 = (int) aleatorio3;

        System.out.println("Te voy a generar 3 numeros aleatorios: ");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
