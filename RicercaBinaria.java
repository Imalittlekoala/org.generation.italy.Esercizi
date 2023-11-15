public class RicercaBinaria {
    public static int ricercaBinaria(int[] arr, int target) {
        int sinistra = 0;
        int destra = arr.length - 1;

        while (sinistra <= destra) {
            int medio = sinistra + (destra - sinistra) / 2;

            if (arr[medio] == target) {
                sinistra = medio + 1;
            } else {
                destra = medio - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrayOrdinato = {10,11,12,13,14,15,16,17,18,19,20};
        int elementoTarget = 15;

        int risultato = ricercaBinaria(arrayOrdinato, elementoTarget);

        if (risultato == -1) {
            System.out.println("Elemento non presente nell'array.");
        } else {
            System.out.println("Elemento trovato all'indice " + risultato);
        }
    }
}
