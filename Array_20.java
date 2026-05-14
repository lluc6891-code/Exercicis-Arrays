
public class Array_20 {

    public static void main(String[] args) {
        int[] matriu = {4, 3, 2, 9, 1, 7};
        // Ordenar de la matriu
        ordenacioBimbolla(matriu);
        // Cerca binària
        int resultat = cercaBinaria(matriu, 7);
        if (resultat != -1) {
            System.out.println("Element trobat a l'índex: " + resultat);
        } else {
            System.out.println("Element no trobat.");
        }

    }

    public static void ordenacioBimbolla(int lista[]) {
        int cuentaintercambios = 0;
        for (boolean ordenado = false; !ordenado;) {
            for (int i = 0; i < lista.length - 1; i++) {
                if (lista[i] > lista[i + 1]) {
                    int variableauxiliar = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = variableauxiliar;
                    cuentaintercambios++;
                }
            }

            if (cuentaintercambios == 0) {
                ordenado = true;
            }
            cuentaintercambios = 0;
        }
    }

    public static int cercaBinaria(int[] lista, int elementBuscat) {
        int esquerra = 0;
        int dreta = lista.length - 1;

        while (esquerra <= dreta) {
            int mig = esquerra + (dreta - esquerra) / 2;

            if (lista[mig] == elementBuscat) {
                return mig;
            } else if (lista[mig] < elementBuscat) {
                esquerra = mig + 1;
            } else {
                dreta = mig - 1;
            }
        }

        return -1; // Element no trobat
    }
}
