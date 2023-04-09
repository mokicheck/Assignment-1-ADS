import java.util.Scanner;

public class main {
    /**
     * The main function reads user input, checks if n is greater than zero,
     * reads another integer and calls the reverseAndPrint function.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n>0){
            int num = scan.nextInt();
            reverseAndPrint(n-1,scan);
            System.out.print(" "+num);
        }
    }
    /**
     * The reverseAndPrint function takes an integer and a Scanner object as input parameters.
     * It reads user input, recursively calls itself with a decreased value of num,
     * and prints the integers in reverse order.
     */
    private static void reverseAndPrint(int num, Scanner scan) {
        if (num > 0){
            int n = scan.nextInt();
            reverseAndPrint(num - 1, scan);
            System.out.print(" " + n);
        }
    }
}