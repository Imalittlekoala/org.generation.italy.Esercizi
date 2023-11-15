public class VerificaNumeroPrimo {
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false; // 0 e 1 non sono numeri primi
        }

        //Verifica se il numero è divisibile per qualche munero da 2 a radice quadrata di numero
        for (int i=2; i <= Math.sqrt(numero); i++) {
            if (numero % i== 0) {
                return false; //se è divisibile non è primo
            }
        }

        return true; //se nessun divisore è stato trovato, il numero è primo
    }

    public static void main(String[] args) {
        int numeroDaVerificare = 59;

        if (isPrimo(numeroDaVerificare)) {
            System.out.println(numeroDaVerificare + " è un numero primo.");
        } else {
            System.out.println(numeroDaVerificare + " non è un numero primo.");
        }
    }
}
