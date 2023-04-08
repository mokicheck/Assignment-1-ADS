public class Main {
    public static void main(String[] args) {
        // Create an array of integers
        int[] arr = {5, 10, 1, 32, 3, 45};
        // Initialize a variable for the minimum value
        int min = findMin(arr, arr.length);
        System.out.println("Min of arr is: " + min + " " + arr.length);
    }
/* findMin func takes an integer array arr and an integer n as input,
and returns the minimum value in the first n elements of the array.
 */
    public static int findMin(int[] arr, int n){
        if (n==1)
                return arr [0];
        else{
            //checking the minimum of the first n-1 elements of the array (recursively)
            //The base case is when n is 1, in which case the function returns the first element of the array.
            int min = findMin(arr, n-1);
            return Math.min(min, arr[n-1]);
        }

    }
}
