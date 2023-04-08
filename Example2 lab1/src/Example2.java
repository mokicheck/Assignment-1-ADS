import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        // Create a new Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Read an integer n from the user
        int n = sc.nextInt();

        // Create a new integer array of size n
        double[] arr = new double[n];

        // Read n integers from the user and store them in the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the average function with the arr array and the index 0,
        // and print the result divided by the length of the array
        System.out.println(average(arr, 0) / arr.length);
    }

    /*This function takes an integer array arr and an integer num as arguments,
    and recursively calculates the sum of the elements in the array
     */
    private static double average(double[] arr, int num) {
        // If num is equal to the length of arr, return 0
        if (arr.length == num) {
            return 0;
        }
        // Otherwise, return the sum of the num-th element of arr and the result
        // of calling the average function again with arr and num + 1
        return arr[num] + average(arr, num + 1);
    }
}
