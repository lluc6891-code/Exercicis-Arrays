
public class Array_4 {

    public static void main(String[] args) {
        int[] nombres = new int[100];

        int total = 0;
        double mitjana;

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = i + 1;
        }
        // Ensnyar la suma, calcular la mitjana i mostrar el resultat
        System.out.println("El resultat dels nombres del 0 al 100 és: " + total);

        mitjana = (double) total / nombres.length;

        System.out.println("La mitjana dels nombres del 0 al 100 és: " + mitjana);
    }
}
