import java.util.Scanner;

public class Ejercicio1_Tema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el primer lado de un rectangulo: ");
        int lado1 = sc.nextInt();
        System.out.println("Dame el segundo lado de un rectangulo: ");
        int lado2 =sc.nextInt();
        System.out.println("El area de tu rectangulo es: " + lado1 * lado2);
    }
}
