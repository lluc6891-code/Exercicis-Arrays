
import java.util.Scanner;

public class Array_1 {

    public static void main(String[] args) {
        final int Tamany = 10;
        int numArray[] = new int[Tamany];

        emplenarArray(numArray);
        mostrarArray(numArray);
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void emplenarArray(int llista[]) {
        Scanner numScannerArray = new Scanner(System.in);
        int numero = 1;
        for (int i = 0; i < llista.length; i++) {
            System.out.println("Introdueix el nombre número " + numero + ":");
            llista[i] = numScannerArray.nextInt();
            numero++;
        }
        numScannerArray.close();
    }

    public static void mostrarArray(int llista[]) {
        for (int i = 0; i < llista.length; i++) {
            System.out.println("En l'índex " + i + " hi ha el valor " + llista[i]);
        }
    }
}
