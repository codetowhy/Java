public class recFactorial {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            System.out.print(Factorial(i) + " ");
            i++;
        }
    }

    private static int Factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * Factorial(n - 1);
    }
}
