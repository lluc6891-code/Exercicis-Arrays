
import java.util.Scanner;

public class Array_7 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner textScanner = new Scanner(System.in);
        System.out.println("Introdueix una frase per convertir-ho a Array: ");
        String text = textScanner.nextLine();
        int tamany = Integer.parseInt(text);
        textScanner.close();

        int array1[] = new int[tamany];
        int array2[];

        emplenarNombresArray(array1, 10, 100);

        array2 = array1;

        array1 = new int[tamany];

        emplenarNombresArray(array1, 10, 100);

        int array3[] = multiplicador(array1, array2);

        System.out.println("Array1: ");
        mostrarArray(array1);

        System.out.println("Array2: ");
        mostrarArray(array2);

        System.out.println("Array3: ");
        mostrarArray(array3);

        System.gc();

    }

    public static void emplenarNombresArray(int llista[], int a, int b) {
        for (int i = 0; i < llista.length; i++) {

            llista[i] = ((int) Math.floor(Math.random() * (a - b) + b));
        }
    }

    public static void mostrarArray(int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println("En l'índex " + i + " hi ha el valor " + lista[i]);
        }
    }

    public static int[] multiplicador(int array1[], int array2[]) {
        int array3[] = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] * array2[i];
        }
        return array3;

    }
}
