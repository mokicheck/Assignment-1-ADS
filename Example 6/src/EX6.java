import java.util.Scanner;

public class EX6 {

    public static void main(String[] args) {
        // Add user input
        Scanner sc = new Scanner(System.in);
        System.out.println(power(sc.nextInt(), sc.nextInt()));
    }
/*
@power -  refers to raising a number to a certain exponent, resulting in a new value
 */
    private static int power(int num, int power) {
        // Handle base case: The power function now correctly handles the base case when the power is 0.
        if (power == 0) return 1;

        // Calculate power recursively: The power function now correctly calculates the result of num raised to the power of power recursively.
        return num * power(num, power - 1);
    }
}
