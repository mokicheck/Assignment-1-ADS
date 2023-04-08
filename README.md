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

### Problem 3
The code is an implementation of a Java program that checks whether a given integer number is prime or composite. The program takes user input for the number to be checked and uses a recursive function called isPrime to determine if the number is prime or composite.

The isPrime function checks if a number is divisible by any integer from 2 to n/2. If it finds any divisor, it returns false, indicating that the number is composite. If it reaches n/2 + 1 without finding any divisor, it returns true, indicating that the number is prime.

The program outputs either "Prime" or "Composite" based on the return value of the isPrime function. If the input number is 1, the program considers it as a special case and outputs "Prime".

### Problem 4 
This Java program calculates the factorial of a given number using a recursive function. The program prompts the user to enter a number, and then calls the factorial function to compute the factorial of that number. The factorial function is a recursive function that takes an integer parameter N, and returns the factorial of N. If N is less than or equal to 1, the function returns 1 (base case). If N is greater than 1, the function multiplies N by the factorial of N-1, which is computed recursively (recursive case). Finally, the program prints the result to the console.


