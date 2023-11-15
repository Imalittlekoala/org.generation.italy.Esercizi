import java.util.ArrayList;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 60;
        int[] primes = findPrimes(n);

        System.out.println("Numeri primi compresi tra 1 e " + n + ":");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }

    public static int[] findPrimes(int n) {
        ArrayList<Integer> primesList = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primesList.add(i);
            }
        }

        int[] primesArray = new int[primesList.size()];
        for (int i = 0; i < primesList.size(); i++) {
            primesArray[i] = primesList.get(i);
        }

        return primesArray;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
