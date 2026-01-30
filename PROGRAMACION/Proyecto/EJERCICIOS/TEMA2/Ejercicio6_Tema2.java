import java.util.Scanner;

public class Ejercicio6_Tema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero entero: ");
        int num1 = sc.nextInt();

        System.out.println("Dame otro numero entero: ");
        int num2 = sc.nextInt();

        int mayor = Math.max(num1,num2);
        int menor = Math.min(num1,num2);

        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
        System.out.println("¿El mayor es multiplo del menor? " + (mayor % menor == 0));
    }
}
