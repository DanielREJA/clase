import java.util.Scanner;

public class Ejercicio3_Tema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero del 65/90 y del 97/122: ");
        int num = sc.nextInt();
        char letra = (char) num;
        System.out.println("Tu letra es: " + letra);
        if (letra == 'a') {
            System.out.println("Tu letra es una vocal");
        } else if (letra == 'e'){
            System.out.println("Tu letra es una vocal");
        } else if (letra == 'i'){
            System.out.println("Tu letra es una vocal");
        } else if (letra == 'o'){
            System.out.println("Tu letra es una vocal");
        } else if (letra == 'u'){
            System.out.println("Tu letra es una vocal");
        } else if (letra == 'A'){
            System.out.println("Tu letra es una vocal");
        } else if (letra == 'E'){
            System.out.println("Tu letra es una vocal");
        } else if (letra == 'I'){
            System.out.println("Tu letra es una vocal");
        } else if (letra == 'O'){
            System.out.println("Tu letra es una vocal");
        } else if (letra == 'U'){
            System.out.println("Tu letra es una vocal");
        } else {
            System.out.println("Tu letra no es una vocal");
        }
    }
}
