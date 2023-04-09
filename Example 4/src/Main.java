import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }

    /*
    @factorial - Recursive function to calculate factorial
     */
    public static int factorial(int N) {
        // Base case: if N is 0 or 1, return 1
        if (N <= 1) {
            return 1;
        }
        // Recursive case: multiply N by the factorial of N-1
        return factorial(N-1) * N;
    }
}
