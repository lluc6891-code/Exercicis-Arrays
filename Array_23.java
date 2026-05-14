
import java.util.Scanner;

public class Array_23 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Demanem la mida del vector
        System.out.print("Quants nombres vols introduir? ");
        int mida = scanner.nextInt();

        int[] origen = new int[mida];
        int[] destinacio = new int[mida];

        // Omplim el vector origen amb els valors que vulgui l'usuari
        for (int i = 0; i < mida; i++) {
            System.out.print("Introdueix el nombre " + (i + 1) + ": ");
            origen[i] = scanner.nextInt();
        }

        // Posem tots els valors de destinacio a 0
        for (int i = 0; i < destinacio.length; i++) {
            destinacio[i] = 0;
        }

        // Comprovem quins nombres son parells i majors que 25 i els posem a destinacio
        for (int i = 0; i < origen.length; i++) {
            boolean esParell = false;
            boolean esMajor = false;

            // Comprovem si es parell
            if (origen[i] % 2 == 0) {
                esParell = true;
            }

            // Comprovem si es major que 25
            if (origen[i] > 25) {
                esMajor = true;
            }

            // Si es parell i major que 25 el posem a destinacio
            if (esParell == true && esMajor == true) {
                destinacio[i] = origen[i];
            }
        }

        // Mostrem el vector origen
        System.out.println("\nVector origen:");
        for (int i = 0; i < origen.length; i++) {
            System.out.print(origen[i] + " ");
        }

        // Mostrem el vector destinacio
        System.out.println("\nVector destinacio:");
        for (int i = 0; i < destinacio.length; i++) {
            System.out.print(destinacio[i] + " ");
        }

        // Mostrem els nombres que compleixen la condicio
        System.out.println("\nNombres parells i majors que 25:");
        for (int i = 0; i < destinacio.length; i++) {
            if (destinacio[i] != 0) {
                System.out.print(destinacio[i] + " ");
            }
        }
        System.out.println();
        scanner.close();
    }
}
