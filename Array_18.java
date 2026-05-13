
public class Array_18 {

    public static void main(String[] args) {

        int numeros[] = {5, 6, 2, 10, 1};

        ordenacionQuicksort(numeros, 0, numeros.length - 1);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }

    /**
     * Ordenant un array amb Quicksort
     *
     * @param array
     * @param esquerra
     * @param dreta
     */
    public static void ordenacionQuicksort(int array[], int esquerra, int dreta) {
        int i = esquerra;
        int j = dreta;
        int pivote = array[(i + j) / 2]; //determinamos el pivote
        do {
            while (array[i] < pivote) {
                i++;
            }
            while (array[j] > pivote) {
                j--;
            }
            if (i <= j) {
                //intercambio
                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        //llamada de funciones (recursivo)
        if (esquerra < j) {
            ordenacionQuicksort(array, esquerra, j);
        }
        if (i < dreta) {
            ordenacionQuicksort(array, i, dreta);
        }
    }

}
