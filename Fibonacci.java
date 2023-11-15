public class Fibonacci {
    public static void printFibonacci(int n) {
        int a = 0, b = 1;

        System.out.println("I primi " + n + " numeri di Fibonacci: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int temp = a;
            a = b;
            b = temp + b;
        }
    }

    public static void main(String[] args) {
        int n = 50;
        printFibonacci(n);
    }
}
