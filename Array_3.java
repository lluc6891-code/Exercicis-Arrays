
import java.util.Scanner;

public class Array_3 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Introdueix el tamany de nombres a ensenyar: ");
        int tamany = numScanner.nextInt();
        int[] num = new int[tamany];
        numScanner.close();

        // Funcions
        emplenarNombresPrimsAleatorisArray(num, 1, 100);

        mostrarArray(num);

        //Ensenyar el prim més gran
        int primGran = major(num);
        System.out.println("El primo más grande es el " + primGran);
    }

    public static void emplenarNombresPrimsAleatorisArray(int llista[], int a, int b) {
        int i = 0;
        while (i < llista.length) {
            int num = ((int) Math.floor(Math.random() * (a - b) + b));
            if (esPrim(num)) {
                llista[i] = num;
                i++;
            }
        }
    }

    private static boolean esPrim(int num) {

        //Un nombre negatiu, i un entre el 0 i el 1, no són prims.
        if (num <= 1) {
            return false;
        } else {

            int prova;
            int comptador = 0;
            //Es fa l'arrel cuadrada
            prova = (int) Math.sqrt(num);
            //Bucle per comptar els nombres divisibles.
            for (; prova > 1; prova--) {
                if (num % prova == 0) {
                    comptador += 1;
                }
            }
            return comptador < 1;
        }
    }

    public static void mostrarArray(int llista[]) {
        for (int i = 0; i < llista.length; i++) {
            System.out.println("En l'index " + i + " hi ha el valor " + llista[i]);
        }
    }

    public static int major(int llista[]) {
        int mayor = 0;
        for (int i = 0; i < llista.length; i++) {
            if (llista[i] > mayor) {
                mayor = llista[i];
            }
        }

        return mayor;
    }
}
