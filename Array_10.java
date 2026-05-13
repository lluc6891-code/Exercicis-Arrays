
import java.util.Scanner;

public class Array_10 {

    public static void main(String[] args) {
        final int tamany = 10;
        double notes[] = new double[tamany];
        String nomsEstudiants[] = new String[tamany];

        // Emplenar arrays amb introduccions de teclat
        emplenarArray(notes, nomsEstudiants);

        // S'ensenyen les notes dels estudiants
        avaluacioNota(notes, nomsEstudiants);
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void emplenarArray(double[] notes, String[] nomsEstudiants) {
        String nom;
        double nota;
        Scanner nomsScanner = new Scanner(System.in);
        Scanner estudiantsScanner = new Scanner(System.in);
        for (int i = 0; i < nomsEstudiants.length; i++) {
            System.out.println("Introdueix el nom del estudiant numero " + (i + 1) + ": ");
            nom = nomsScanner.nextLine();
            nomsEstudiants[i] = nom;
            System.out.println("Introdueix la nota (amb decimals) del estudiant numero " + (i + 1) + ": ");
            nota = estudiantsScanner.nextDouble();
            notes[i] = nota;
        }
        nomsScanner.close();
        estudiantsScanner.close();
    }

    public static void avaluacioNota(double[] notes, String[] nomEstudiants) {
        //String avaluacio;
        for (int i = 0; i < notes.length; i++) {
            switch ((int) notes[i]) {
                case 1:
                case 2:
                case 3:
                case 4: {
                    System.out.println("L'alumne " + nomEstudiants[i] + " està suspés.");
                }
                break;
                case 5:
                case 6:
                    System.out.println("L'alumne " + nomEstudiants[i] + " està aprovat amb un Bé");
                    break;
                case 7:
                case 8:
                    System.out.println("L'alumne " + nomEstudiants[i] + " està aprovat amb un Notable");
                    break;
                case 9:
                case 10:
                    System.out.println("L'alumne " + nomEstudiants[i] + " està aprovat amb un Sobresortit");
                    break;
            }
        }
    }
}
