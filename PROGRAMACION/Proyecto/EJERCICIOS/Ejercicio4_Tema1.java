public class Ejercicio4_Tema1  {
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        // Declaro primero la c para ir guardando la informacion de a y luego ya hacer el intercambio
        int c = a;
        a = b;
        b = c;
        // Comprobación
        System.out.println(b);
        System.out.println(a);
    }
}
