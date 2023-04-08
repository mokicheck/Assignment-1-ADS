# Laboratory 1
## Function and Recursion
### Problem 1 
Explanation of the code

The main method creates an integer array arr and initializes it with some values.
It calls the findMin function passing the array and its length as arguments, and assigns the returned value to the variable min.
The findMin function takes an integer array arr and an integer n as input, and returns the minimum value in the first n elements of the array.
If n is equal to 1, the function returns the first element of the array.
Otherwise, it recursively checks the minimum of the first n-1 elements of the array and returns the minimum of that and the n-1th element.

### Problem 2
The program starts by creating a new Scanner object to read input from the user. It then reads the integer n and creates a new double array of size n. Next, it uses a for loop to read n double values from the user and store them in the array.

Finally, the program calls the average function with the array and an index of 0, and prints the result divided by the length of the array.

The average function takes an array arr and an integer num as arguments and recursively calculates the sum of the elements in the array. If num is equal to the length of arr, the function returns 0. Otherwise, it returns the sum of the num-th element of arr and the result of calling the average function again with arr and num + 1.
