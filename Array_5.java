
import java.util.Scanner;

public class Array_5 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner seleccioScanner = new Scanner(System.in);
        char lletres[] = new char[26];
        for (int i = 65, j = 0; i <= 90; i++, j++) {
            lletres[j] = (char) i;
        }
        String cadena = "";
        int opcio = -1;

        do {
            System.out.println("Introdueix un nombre entre 0 i " + (lletres.length - 1));
            opcio = seleccioScanner.nextInt();

            if (!(opcio >= 0 && opcio <= lletres.length - 1)) {
                System.out.println("Error, introdueix un altre nombre entre 0 i " + (lletres.length - 1));
            } else {
                if (opcio != -1) {
                    cadena += lletres[opcio];
                }
            }
        } while (opcio != -1);
        System.out.println(cadena);
        seleccioScanner.close();
    }
}
