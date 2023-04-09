import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // Calculate the binomial coefficient
        int result = binomialCoefficient(n, k);

        System.out.println(result);
    }

    /**
     * Calculates the binomial coefficient C(n, k) using recursion.
     *
     * @n The first parameter of the binomial coefficient
     * @k The second parameter of the binomial coefficient
     * @return The result of the binomial coefficient C(n, k)
     */
    private static int binomialCoefficient(int n, int k) {
        // Base case: C(n, 0) = 1, C(n, n) = 1
        if (k == 0 || k == n) {
            return 1;
        }

        // Recursive case: C(n, k) = C(n-1, k) + C(n-1, k-1)
        return binomialCoefficient(n - 1, k) + binomialCoefficient(n - 1, k - 1);
    }
}
