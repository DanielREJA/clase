import java.awt.font.FontRenderContext;

public class Arrays {
    public static void main(String[] args) {
        // DECLARACION DE ARRAY
        int[] numeros = {1, 2, 3, 4}; //FORMA DE METER DATOS DIRECTAMENTE
        int[] numeros1 = new int[5]; //FORMA DECLARANDO LONGITUD DE ARRAY CON HUECOS INICIALIZADOS A 0

        // LEER DATOS DE UN ARRAY
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        System.out.println("Hola");
        System.out.println("Adios");

        // ESCRIBIR DATOS DENTRO DE UN ARRAY
        for (int i = 0; i < numeros1.length; i++) {
            numeros1[i] = 2;
        }
    }
}
