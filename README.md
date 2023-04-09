# Laboratory 1
## Function and Recursion
### 🔴Problem 1 
Description:

Finds the minimum value in the array

Explanation:

The main method creates an integer array arr and initializes it with some values.
It calls the findMin function passing the array and its length as arguments, and assigns the returned value to the variable min.
The findMin function takes an integer array arr and an integer n as input, and returns the minimum value in the first n elements of the array.
If n is equal to 1, the function returns the first element of the array.
Otherwise, it recursively checks the minimum of the first n-1 elements of the array and returns the minimum of that and the n-1th element.

### 🔴Problem 2
Description: 

Finds an average of numbers

Explanation:

The program starts by creating a new Scanner object to read input from the user. It then reads the integer n and creates a new double array of size n. Next, it uses a for loop to read n double values from the user and store them in the array.

Finally, the program calls the average function with the array and an index of 0, and prints the result divided by the length of the array.

The average function takes an array arr and an integer num as arguments and recursively calculates the sum of the elements in the array. If num is equal to the length of arr, the function returns 0. Otherwise, it returns the sum of the num-th element of arr and the result of calling the average function again with arr and num + 1.

### 🔴Problem 3
Description:

This code checks whether an integer entered by the user is a prime or composite number.

Explanation:

The code is an implementation of a Java program that checks whether a given integer number is prime or composite. The program takes user input for the number to be checked and uses a recursive function called isPrime to determine if the number is prime or composite.

The isPrime function checks if a number is divisible by any integer from 2 to n/2. If it finds any divisor, it returns false, indicating that the number is composite. If it reaches n/2 + 1 without finding any divisor, it returns true, indicating that the number is prime.

The program outputs either "Prime" or "Composite" based on the return value of the isPrime function. If the input number is 1, the program considers it as a special case and outputs "Prime".

### 🔴Problem 4 
Description:

Calculates the factorial of the input integer using a recursive function

Explanation:

This Java program calculates the factorial of a given number using a recursive function. The program prompts the user to enter a number, and then calls the factorial function to compute the factorial of that number. The factorial function is a recursive function that takes an integer parameter N, and returns the factorial of N. If N is less than or equal to 1, the function returns 1 (base case). If N is greater than 1, the function multiplies N by the factorial of N-1, which is computed recursively (recursive case). Finally, the program prints the result to the console.

### 🔴Problem 5
Description:

Calculates and outputs the nth number in the Fibonacci sequence using a recursive function fib



Explanation:

This Java code prompts the user to input an integer n, then calculates and outputs the nth number in the Fibonacci sequence using a recursive function fib. The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding ones, starting from 0 and 1. The fib function handles base cases for n=0 and n=1, and recursively calculates the nth Fibonacci number for larger values of n.

### 🔴Problem 6
Description:

Function that returns “a power of n”.

Explanation;
This Java program prompts the user to enter two integer values, num and power, and calculates num raised to the power of power using a recursive function called power.
Forex, if the user enters 2 for num and 3 for power, the power method calculates 2^3 recursively by multiplying 2 with 2^2, which is 2 multiplied by the result of 2^1, which is 2 multiplied by the result of 2^0, which is 1. Therefore, the result is 2 * 2 * 2 * 1 = 8. The program outputs "8" to the console.

### 🔴Problem 7
Description:

Returns given array in reverse order

Explanation:

This Java code reads input from the user using a Scanner object and then reverses and prints the integers in the input in reverse order. It recursively calls a private function reverseAndPrint to achieve this.

### 🔴Problem 8
Description:

Function that checking whether “s” is all consists of digits.

Explanation:

This code reads a string input from the user and checks if it consists only of digits using recursion. If the input string is empty or contains non-digit characters, the function returns false. Otherwise, it checks the first character of the string to see if it is a digit and then recursively calls itself with the remaining substring. If all characters are digits, the function returns true.

### 🔴Problem 9
Description:

finds Cn(binomial coefficient) using formula Cn=Cn−1+Cn−1where Cn=Cn=1.

Explanation:

### 🔴Problem 10
Description:

Function for finding GCD(a, b) using recursion

Explanation:









