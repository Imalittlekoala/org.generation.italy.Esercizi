public class CalcoloFattoriale {
    public static long calcolaFattorialeIterativo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Il numero deve essere non negativo");
        }

        long fattoriale = 1;

        for (int i = 1; i <= n; i++) {
            fattoriale *= i;
        }

        return fattoriale;
    }

    public static void main(String[] args) {
        int numero= 7;
        long risultato = calcolaFattorialeIterativo(14);
        System.out.println("Il fattoriale di " + numero+" è:" + risultato);
    }
}
