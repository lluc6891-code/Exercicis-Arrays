import java.util.Scanner;

public class Array_22 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Demanem quants nombres vol l'usuari
        System.out.print("Quants nombres vols a l'array? ");
        int mida = scanner.nextInt();

        // Demanem el rang dels nombres
        System.out.print("Nombre minim: ");
        int minim = scanner.nextInt();
        System.out.print("Nombre maxim: ");
        int maxim = scanner.nextInt();

        int[] array = new int[mida];

        // Omplim l'array amb nombres aleatoris sense repetir
        int i = 0;
        while (i < mida) {
            // Generem un nombre aleatori entre minim i maxim
            int nombreAleatori = (int)(Math.random() * (maxim - minim + 1)) + minim;

            // Comprovem si el nombre ja esta a l'array
            boolean repetit = false;
            for (int j = 0; j < i; j++) {
                if (array[j] == nombreAleatori) {
                    repetit = true;
                }
            }

            // Si no esta repetit l'afegim
            if (repetit == false) {
                array[i] = nombreAleatori;
                i++;
            }
        }

        // Mostrem l'array
        System.out.print("Array generat: ");
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
        System.out.println();
        scanner.close();
    }
}