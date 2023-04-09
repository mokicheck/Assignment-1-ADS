import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Add user input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fib(n);

        System.out.println(result);
    }
    /*
    @fib - fibonacci,  calculates the nth Fibonacci number.
     */

    public static int fib(int n){
        //Handle base cases: The fib function now correctly handles the base cases when n=0 or n=1.
        if(n<=1) return n;

        // Calculate nth Fibonacci number
        return  fib(n-1 ) + fib(n-2);
    }
}
