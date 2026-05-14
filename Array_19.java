
public class Array_19 {

    public static void main(String[] args) {

        //array a ordenar
        int numeros[] = {5, 6, 2, 10, 1};

        //cridada funció
        ordenacionQuicksort(numeros, 0, numeros.length - 1);

        //mostramos el contenido
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }

    /**
     * Utilitzant Quicksort
     *
     * @param array
     * @param esquerra
     * @param dreta
     */
    public static void ordenacionQuicksort(int array[], int esquerra, int dreta) {
        int i = esquerra;
        int j = dreta;
        int pivote = array[(i + j) / 2];
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
