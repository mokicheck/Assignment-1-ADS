public class Main {
    public static void main(String[] args){
        // Create an array of integers
        int[] ints = {5, 10, 1, 32, 3, 45};

        // Initialize a variable for the minimum value
        int min = Integer.MAX_VALUE;

        // Iterate over all the elements in the array
        for (int n : ints){
            // If the current value is less than the current minimum value, update the minimum value
            if(n < min){
                min = n;
            }
        }

        // Print the minimum value found in the array
        System.out.println("Your min value is: " + min);
    }
}
