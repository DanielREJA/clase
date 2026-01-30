import java.util.Scanner;

public class EjercicioDificilTema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salida = false;
        do {
            System.out.println("---------Calculadora---------");
            System.out.println(" - Elige una de las opciones");
            System.out.println(" - Suma           ( 1 )");
            System.out.println(" - Resta          ( 2 )");
            System.out.println(" - Multiplicacion ( 3 )");
            System.out.println(" - Division       ( 4 )");
            System.out.println(" - Raiz Cuadrada  ( 5 )");
            System.out.println(" - Potenica       ( 6 )");
            System.out.println(" - Salir          ( 0 )");
            System.out.println("------------------------------");
            int opcion = sc.nextInt();
            int num1, num2, resultado;

            switch (opcion){
                case 1:
                    System.out.println("Dame el primer numero de la suma ");
                    num1 = sc.nextInt();
                    System.out.println("Dame el segundo numero de la suma ");
                    num2 = sc.nextInt();
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es " + resultado );
                    break;
                case 2:
                    System.out.println("Dame el primer numero de la resta ");
                    num1 = sc.nextInt();
                    System.out.println("Dame el segundo numero de la resta ");
                    num2 = sc.nextInt();
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es " + resultado );
                    break;
                case 3:
                    System.out.println("Dame el primer numero de la multiplicacion ");
                    num1 = sc.nextInt();
                    System.out.println("Dame el segundo numero de la multiplicacion ");
                    num2 = sc.nextInt();
                    resultado = num1 * num2;
                    System.out.println("El resultado de la resta es " + resultado );
                    break;
                case 4:
                    System.out.println("Dame el numero que quieres divir");
                    int num7 = sc.nextInt();
                    System.out.println("Dame el divisor");
                    int num8 = sc.nextInt();
                    if (num8 == 0) {
                        System.out.println("Error, no puedo dividir por cero");
                        break;
                    }
                    resultado = num7/num8;
                    System.out.println("El resultado de la division es " + resultado);
                    break;
                case 5:
                    System.out.println("Dame el numero que quieres sacar la raiz ");
                    num1 = sc.nextInt();
                    double raiz = Math.sqrt((double)num1);

                    System.out.println("El resultado de la raiz es " + raiz );
                    break;
                case 6:
                    System.out.println("Dame el numero que quieres sacar la potencia ");
                    num1 = sc.nextInt();
                    System.out.println("Dame el exponente ");
                    num2 = sc.nextInt();
                    double potencia = Math.pow((double)num1,(double)num2);

                    System.out.println("El resultado de la potencia es " + potencia );
                    break;
                case 0:
                    salida = true;
                    break;
                default:
                    System.out.println("Tienes que introducir una de las opciones");
            }
        } while (!salida);


    }
}
