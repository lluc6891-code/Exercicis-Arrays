
import java.util.Scanner;

public class Array_2 {

    //@SuppressWarnings("resource")
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Introdueix el tamany de nombres a ensenyar: ");
        int tamany = numScanner.nextInt();
        int[] num = new int[tamany];
        //Invocant les funcions
        emplenarArrayRandom(num, 0, 9);

        mostrarArray(num);
        numScanner.close();
    }

    public static void emplenarArrayRandom(int llista[], int a, int b) {
        for (int i = 0; i < llista.length; i++) {
            llista[i] = ((int) Math.floor(Math.random() * (a - b) + b));
        }
    }

    public static void mostrarArray(int llista[]) {
        for (int i = 0; i < llista.length; i++) {
            System.out.println("En l'índex " + i + " hi ha el valor " + llista[i]);
        }
    }
}
