import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int entero = 3;
        double decimal = 3.14;
        char caracter = 'a';
        char caracter1 = 'b';
        boolean verdaderoFalso = true;
        String frase1 = "Hola que tal";
        String frase2 = "Hola que TAL";


        // COMPARACIÓN DE DATOS PRIMITIVOS
        System.out.println(entero == decimal);
        System.out.println(caracter1 == caracter);

        // COMPARACION DE STTRINGS FIJANDOME EN SI TIENE MAYUSCULAS Y
        // MINUSCULAS (da false porque "tal" en una esta en mayusculas y en otra no)
        System.out.println(frase1.equals(frase2));

        //COMPARACIÓN DE STRING SIN IMPORTAR LAS MAYUSCULAS Y MINUSCULAS
        System.out.println(frase1.toLowerCase().equals(frase2.toLowerCase()));





        // ESTO ES UN IF
        System.out.println("Hola usuario dime la edad");
        int edadUsu = sc.nextInt();

        if (edadUsu >= 18){
            System.out.println("Eres mayor de edad");
        } else if (edadUsu >= 16) {
            System.out.println("Te permito entrar sin beber alcohol");
        }else {
            System.out.println("Vete a la calle pringado");
        }



        // ESTO ES UN SWITCH-CASE
        System.out.println("Dime que nota has sacado");
        int nota = sc.nextInt();

        switch (nota){
            case 10,9:
                System.out.println("Tienes un sobresaliente");
                break;
            case 8,7:
                System.out.println("Tienes notable");
                break;
            case 6:
                System.out.println("Tienes un bien");
                break;
            case 5:
                System.out.println("Has aprobado por los pelos");
                break;
            case 4,3,2,1,0:
                System.out.println("Estas suspenso chaval");
                break;
            default:
                System.out.println("No has introducido correctamente ningun valor entre 0-9");
        }


        System.out.println("Quiero que pongas la edad mayor a 18");
        edadUsu = sc.nextInt();
        boolean semaforo = true;

        while (semaforo){
            if (edadUsu >= 18){
                semaforo = false;
            }else {
                System.out.println("Quiero que pongas la edad mayor a 18");
                edadUsu = sc.nextInt();
            }

        }











    }
}
