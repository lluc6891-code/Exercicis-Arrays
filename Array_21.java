
import java.util.Scanner;

public class Array_21 {

    static Scanner scanner = new Scanner(System.in);
    static String jugador1, jugador2;
    static int puntsJugador1 = 0, puntsJugador2 = 0;

    public static void main(String[] args) {

        // Demanem els noms dels jugadors
        System.out.println("=== JOC DE L'AHORCAT ===");
        System.out.print("Nom del jugador 1: ");
        jugador1 = scanner.nextLine().trim();
        System.out.print("Nom del jugador 2: ");
        jugador2 = scanner.nextLine().trim();

        // El jugador 1 comença
        int tornActual = 1;

        // El joc continua fins que algu arribi a 3 punts
        while (puntsJugador1 < 3 && puntsJugador2 < 3) {
            if (tornActual == 1) {
                // Jugador 1 escriu i jugador 2 endevina
                boolean encertat = torn(jugador1, jugador2);
                if (encertat) {
                    // Si endevina, el jugador 2 suma punt i ara escriu ell
                    puntsJugador2++;
                    tornActual = 2;
                } else {
                    // Si no endevina, el jugador 1 suma punt i torna a escriure
                    puntsJugador1++;
                }
            } else {
                // Jugador 2 escriu i jugador 1 endevina
                boolean encertat = torn(jugador2, jugador1);
                if (encertat) {
                    puntsJugador1++;
                    tornActual = 1;
                } else {
                    puntsJugador2++;
                }
            }
            // Mostrem la puntuacio despres de cada torn
            mostrarPuntuacio();
        }

        // Fi del joc
        System.out.println("\n=== FI DEL JOC ===");
        if (puntsJugador1 >= 3) {
            System.out.println("Ha guanyat " + jugador1 + "!");
        } else {
            System.out.println("Ha guanyat " + jugador2 + "!");
        }
    }

    // Metode que gestiona un torn complet (un jugador escriu i l'altre endevina)
    // Retorna true si el jugador endevina la paraula, false si no
    public static boolean torn(String jugadorEscriu, String jugadorEndevina) {

        // El jugador escriu la paraula i la pista
        System.out.println("\n--------------------------------------------------");
        System.out.println("Torn de " + jugadorEscriu + " per escriure la paraula.");
        System.out.print("Escriu la paraula secreta: ");
        String paraulaSecreta = scanner.nextLine().trim().toUpperCase();
        System.out.print("Escriu una pista: ");
        String pista = scanner.nextLine().trim();

        // Posem linies en blanc per que l'altre jugador no vegi la paraula
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }

        // Mostrem la informacio per al jugador que ha d'endevinar
        System.out.println("--------------------------------------------------");
        System.out.println("Torn de " + jugadorEndevina + " per endevinar.");
        System.out.println("Pista: " + pista);
        System.out.println("La paraula te " + paraulaSecreta.length() + " lletres.");

        // Inicialitzem les variables del joc
        int oportunitats = 6;
        char[] lletresTrobades = new char[paraulaSecreta.length()]; // Lletres que ha endevinat
        boolean[] lletresEndevinades = new boolean[paraulaSecreta.length()]; // Per saber si ha endevinat totes
        char[] lletresUsades = new char[26]; // Guardem les lletres que ja ha provat
        int totalUsades = 0;

        // Posem guions a les lletres que encara no ha endevinat
        for (int i = 0; i < lletresTrobades.length; i++) {
            lletresTrobades[i] = '_';
        }

        // Bucle principal del joc, continua mentre tingui oportunitats
        while (oportunitats > 0) {
            System.out.println("\nParaula: " + mostrarParaula(lletresTrobades));
            System.out.println("Oportunitats restants: " + oportunitats);

            // Mostrem les lletres que ja ha usat
            if (totalUsades > 0) {
                System.out.print("Lletres usades: ");
                for (int i = 0; i < totalUsades; i++) {
                    System.out.print(lletresUsades[i] + " ");
                }
                System.out.println();
            }

            // Demanem una lletra al jugador
            System.out.print("Introdueix una lletra: ");
            String entrada = scanner.nextLine().trim().toUpperCase();

            // Comprovem que no estigui buida
            if (entrada.isEmpty()) {
                System.out.println("Has d'introduir una lletra.");
                continue;
            }

            char lletra = entrada.charAt(0);

            // Comprovem si la lletra ja l'ha usat abans
            if (lletreaUsada(lletresUsades, totalUsades, lletra)) {
                System.out.println("Ja has usat la lletra '" + lletra + "'. No compta com a error.");
                continue;
            }

            // Afegim la lletra a la llista de lletres usades
            lletresUsades[totalUsades] = lletra;
            totalUsades++;

            // Comprovem si la lletra esta a la paraula
            boolean encert = false;
            for (int i = 0; i < paraulaSecreta.length(); i++) {
                if (paraulaSecreta.charAt(i) == lletra) {
                    lletresTrobades[i] = lletra;
                    lletresEndevinades[i] = true;
                    encert = true;
                }
            }

            // Avisem si ha encertat o no la lletra
            if (encert) {
                System.out.println("Correcte! La lletra '" + lletra + "' es a la paraula.");
            } else {
                oportunitats--;
                System.out.println("Incorrecte! La lletra '" + lletra + "' no es a la paraula.");
            }

            // Comprovem si ha endevinat tota la paraula
            if (paraulaEndevinada(lletresEndevinades)) {
                System.out.println("\n" + jugadorEndevina + " ha endevinat la paraula: " + paraulaSecreta);
                return true;
            }
        }

        // Si arriba aqui es que s'han acabat les oportunitats
        System.out.println("\nS'han acabat les oportunitats! La paraula era: " + paraulaSecreta);
        return false;
    }

    // Metode per mostrar la paraula amb guions i les lletres encertades
    public static String mostrarParaula(char[] lletresTrobades) {
        String resultat = "";
        for (int i = 0; i < lletresTrobades.length; i++) {
            resultat = resultat + lletresTrobades[i] + " ";
        }
        return resultat;
    }

    // Metode per comprovar si una lletra ja s'ha usat
    public static boolean lletreaUsada(char[] lletresUsades, int total, char lletra) {
        boolean trobat = false;
        for (int i = 0; i < total; i++) {
            if (lletresUsades[i] == lletra) {
                trobat = true;
            }
        }
        return trobat;
    }

    // Metode per comprovar si totes les lletres han estat endevinades
    public static boolean paraulaEndevinada(boolean[] lletresEndevinades) {
        boolean totesEndevinades = true;
        for (int i = 0; i < lletresEndevinades.length; i++) {
            if (lletresEndevinades[i] == false) {
                totesEndevinades = false;
            }
        }
        return totesEndevinades;
    }

    // Metode per mostrar la puntuacio dels dos jugadors
    public static void mostrarPuntuacio() {
        System.out.println("\nPUNTUACIO:");
        System.out.println(jugador1 + ": " + puntsJugador1 + " punt(s)");
        System.out.println(jugador2 + ": " + puntsJugador2 + " punt(s)");
        System.out.println("--------------------------------------------------");
    }
}
