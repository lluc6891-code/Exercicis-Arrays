
public class Array_17 {

    public static void main(String[] args) {

        int numeros[] = {5, 6, 2, 10, 1};

        ordenacioBimbolla(numeros);

        //mostrar el contenido
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
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

}
