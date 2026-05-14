
import java.util.Scanner;

public class Array_24 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Numero de jugadors fixes
        int numJugadors = 3;

        // Array per guardar els numeros de cada jugador (3 jugadors, 4 numeros cada un)
        int[][] numeros = new int[numJugadors][4];

        // Demanem els numeros a cada jugador
        for (int i = 0; i < numJugadors; i++) {
            System.out.println("\n--- Jugador " + (i + 1) + " ---");
            numeros[i] = demanaNumerosJugador();
        }

        // Demanem els numeros a l'arbitre
        System.out.println("\n--- Torn de l'arbitre ---");
        int a = demanaNumeroArbitre("Introdueix el valor A: ");
        int b = demanaNumeroArbitre("Introdueix el valor B: ");

        // Ens assegurem que A sigui menor que B
        if (a > b) {
            int aux = a;
            a = b;
            b = aux;
        }

        // Mostrem els numeros de cada jugador
        System.out.println("\n--- Numeros introduits per cada jugador ---");
        for (int i = 0; i < numJugadors; i++) {
            System.out.print("Jugador " + (i + 1) + ": ");
            for (int j = 0; j < 4; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        // Mostrem els numeros de l'arbitre
        System.out.println("\nNumeros de l'arbitre: A = " + a + ", B = " + b);

        // Calculem els encerts de cada jugador
        int[] encerts = new int[numJugadors];
        for (int i = 0; i < numJugadors; i++) {
            encerts[i] = calculaEncerts(numeros[i], a, b);
        }

        // Mostrem els encerts de cada jugador
        System.out.println("\n--- Encerts de cada jugador ---");
        for (int i = 0; i < numJugadors; i++) {
            System.out.println("Jugador " + (i + 1) + ": " + encerts[i] + " encerts");
        }

        // Calculem la mitjana
        double mitjana = calculaMitjana(encerts);
        System.out.println("\nMitjana d'encerts de tots els jugadors: " + mitjana);

        // Busquem el guanyador
        int guanyador = buscaGuanyador(encerts);
        System.out.println("\nHa guanyat el Jugador " + (guanyador + 1) + " amb " + encerts[guanyador] + " encerts!");
    }

    // Metode per demanar els 4 numeros d'un jugador
    public static int[] demanaNumerosJugador() {

        int[] nums = new int[4];

        // Demanem 4 numeros a l'usuari
        for (int i = 0; i < 4; i++) {
            boolean valid = false;

            // Repetim fins que el numero sigui valid
            while (valid == false) {
                System.out.print("Introdueix el numero " + (i + 1) + " (rang 1-10): ");
                int num = scanner.nextInt();

                // Comprovem si el numero esta dins del rang
                boolean esMajorOIgual = false;
                boolean esMenorOIgual = false;

                if (num >= 1) {
                    esMajorOIgual = true;
                }
                if (num <= 10) {
                    esMenorOIgual = true;
                }

                if (esMajorOIgual == true && esMenorOIgual == true) {
                    nums[i] = num;
                    valid = true;
                } else {
                    System.out.println("Numero incorrecte! Ha de ser entre 1 i 10.");
                }
            }
        }

        return nums;
    }

    // Metode per demanar el numero de l'arbitre
    public static int demanaNumeroArbitre(String missatge) {

        int num = 0;
        boolean valid = false;

        // Repetim fins que el numero sigui valid
        while (valid == false) {
            System.out.print(missatge);
            num = scanner.nextInt();

            // Comprovem si el numero esta dins del rang
            boolean esMajorOIgual = false;
            boolean esMenorOIgual = false;

            if (num >= 1) {
                esMajorOIgual = true;
            }
            if (num <= 10) {
                esMenorOIgual = true;
            }

            if (esMajorOIgual == true && esMenorOIgual == true) {
                valid = true;
            } else {
                System.out.println("Numero incorrecte! Ha de ser entre 1 i 10.");
            }
        }

        return num;
    }

    // Metode per calcular els encerts d'un jugador
    public static int calculaEncerts(int[] nums, int a, int b) {

        int encerts = 0;

        // Comprovem un per un si cada numero esta dins de l'interval
        for (int i = 0; i < nums.length; i++) {
            boolean esMajorOIgualA = false;
            boolean esMenorOIgualB = false;

            if (nums[i] >= a) {
                esMajorOIgualA = true;
            }
            if (nums[i] <= b) {
                esMenorOIgualB = true;
            }

            if (esMajorOIgualA == true && esMenorOIgualB == true) {
                encerts++;
            }
        }

        return encerts;
    }

    // Metode per calcular la mitjana dels encerts
    public static double calculaMitjana(int[] encerts) {

        // Sumem tots els encerts
        int suma = 0;
        for (int i = 0; i < encerts.length; i++) {
            suma = suma + encerts[i];
        }

        // Dividim entre el numero de jugadors
        double mitjana = (double) suma / encerts.length;

        return mitjana;
    }

    // Metode per buscar el jugador amb mes encerts
    public static int buscaGuanyador(int[] encerts) {

        int posicioGuanyador = 0;

        // Comparem els encerts de cada jugador amb el maxim actual
        for (int i = 0; i < encerts.length; i++) {
            boolean teMesEncerts = false;

            if (encerts[i] > encerts[posicioGuanyador]) {
                teMesEncerts = true;
            }

            if (teMesEncerts == true) {
                posicioGuanyador = i;
            }
        }

        return posicioGuanyador;
    }
}
