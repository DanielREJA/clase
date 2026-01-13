import java.util.Scanner;

public class Ejercicio4_Tema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero y calculo su raiz:");
        int num = sc.nextInt();
        double raiz = Math.sqrt(num);
        int raiz1 = (int) raiz;
        System.out.println("La raiz de " + num + " es " + raiz1);
    }
}
