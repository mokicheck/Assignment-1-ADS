import java.util.Scanner;
/*
@static int i = 2 - declares a static variable i with a value of 2.
 */
public class Main {
    static int i = 2;

    // Main function that reads user input and calls isPrime function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1 || isPrime(n))
            System.out.println("Prime");
        else
            System.out.println("Composite");
    }

    /*
    @isPrime - function to check if a number is prime or composite
    @
     */
    public static boolean isPrime(int n) {
        // If i reaches n/2 + 1 without finding a divisor, n is prime
        if(i == n/2 + 1)
            return true;
        // If n is divisible by i, n is composite
        if(n % i == 0)
            return false;
        // Increase i and call isPrime recursively
        i++;
        return isPrime(n);
    }
}
