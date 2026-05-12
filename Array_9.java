
import java.util.Scanner;

public class Array_9 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        final int divisio = 23;

        Scanner dniScanner = new Scanner(System.in);
        System.out.println("Introdueix el DNI, amb el darrer caracter canviat a un nombre per coneixer a quina lletra coincideix: ");
        int dni = dniScanner.nextInt();
        dniScanner.close();

        int residu = dni % divisio;

        char letra = lletraDNI(residu);

        System.out.println("El teu DNI és: " + dni + letra);

    }

    public static char lletraDNI(int residu) {

        char lletresDNI[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return lletresDNI[residu];
    }
}
