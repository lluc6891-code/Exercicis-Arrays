
import java.util.Scanner;

public class Array_8 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Introdueix el tamany de nombres a ensenyar: ");
        int tamany = numScanner.nextInt();
        int[] num = new int[tamany];

        // Introduir el nombre per especificar el nombre final d'un grup de nombres
        int ultimDigit;
        do {
            Scanner digitScanner = new Scanner(System.in);
            System.out.println("Introdueix un nombre per cercar el darrer digit dels nombres: ");
            ultimDigit = digitScanner.nextInt();
            digitScanner.close();
        } while (!(ultimDigit >= 0 && ultimDigit <= 9));

        numScanner.close();

        emplenarNombresDigitsAleatorisArray(num, 1, 300);
        int acabatsEn[] = numAcabatsEn(num, ultimDigit);
        mostrarArrayAcabatsEn(acabatsEn);
    }

    public static void emplenarNombresDigitsAleatorisArray(int llista[], int a, int b) {
        int i = 0;
        while (i < llista.length) {
            int num = ((int) Math.floor(Math.random() * (a - b) + b));
            llista[i] = num;
            i++;
        }

    }

    public static void mostrarArrayAcabatsEn(int llista[]) {
        for (int i = 0; i < llista.length; i++) {
            //Sense incluir un 0
            if (llista[i] != 0) {
                System.out.println("El nombre " + llista[i] + " acaba en el nombre desitjat: ");
            }
        }

    }

    public static int[] numAcabatsEn(int num[], int darrerNombre) {

        //Array que almacenara los numeros terminados en el numero pedido
        int acabatsEn[] = new int[num.length];

        int nombreFinal = 0;

        for (int i = 0; i < acabatsEn.length; i++) {

            // Es resta el nombre per el mateix nombre, sense unitats. Per exemple, 325-320=5
            nombreFinal = num[i] - (num[i] / 10 * 10);

            //Si el nombre és correcte, s'afegeix
            if (nombreFinal == darrerNombre) {
                acabatsEn[i] = num[i];
            }
        }

        return acabatsEn;
    }

}
