
import java.util.Arrays;
import java.util.Scanner;

public class Array_11 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        //Introducimos un numero
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Introduiex un nombre per veure si és capicua: ");
        String nombre = numScanner.nextLine();
        numScanner.close();

        
        int digitos[] = convierteNumeroAArray(nombre, nombre.length());

        if (EsCapicua(digitos)) {
            System.out.println("El nombre " + nombre + " és capicua");
        } else {
            System.out.println("El nombre " + nombre + " no és capicua");
        }
    }

    public static int[] convierteNumeroAArray(String numero, int longitud) {

        int digitos[] = new int[longitud];

        for (int i = 0; i < digitos.length; i++) {
            digitos[i] = Character.getNumericValue(numero.charAt(i));
        }
        return digitos;
    }

    public static boolean EsCapicua(int llista[]) {

        
        int listaprueba[] = new int[llista.length];

    
        for (int i = 0, j = 1; j <= llista.length; i++, j++) {
            listaprueba[i] = llista[llista.length - j];
        }

       
        if (Arrays.equals(llista, listaprueba)) {
            return true;
        }

        return false;

    }

}
