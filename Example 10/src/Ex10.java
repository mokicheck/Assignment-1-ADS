import java.util.Scanner;

public class Ex10 {
    /**
     * Main function prompts user to input two integers and prints their GCD
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find their GCD:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = findGCD(a, b);
        System.out.printf("GCD of %d and %d is %d", a, b, gcd);
    }

    /**
     * Recursive function to find GCD of two integers using Euclidean algorithm
     * @return GCD of a and b
     */
    private static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}
