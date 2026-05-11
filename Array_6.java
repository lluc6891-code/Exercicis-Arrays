
import java.util.Scanner;

public class Array_6 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner fraseScanner = new Scanner(System.in);
        System.out.println("Introdueix una frase per convertir-ho a Array: ");
        String frase = fraseScanner.nextLine();
        char caracters[] = new char[frase.length()];
        for (int i = 0; i < frase.length(); i++) {
            caracters[i] = frase.charAt(i);
            System.out.println(caracters[i]);
        }

        fraseScanner.close();
    }
}
