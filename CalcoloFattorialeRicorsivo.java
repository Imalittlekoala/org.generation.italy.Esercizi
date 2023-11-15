public class CalcoloFattorialeRicorsivo {
    public static long calcolaFattorialeRicorsivo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Il numero deve essere non negativo");
        }

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcolaFattorialeRicorsivo(n - 1);
        }
    }

    public static void main(String[] args) {
        int numero = 9;
        long risultato = calcolaFattorialeRicorsivo(10);
        System.out.println("Il fattoriale di " + numero + " è: " + risultato);
    }
}
