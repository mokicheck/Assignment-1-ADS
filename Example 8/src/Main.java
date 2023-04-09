import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        boolean isAllDigits = checkAllDigits(s);
        if (isAllDigits) {
            System.out.println("The string is all digits.");
        } else {
            System.out.println("The string is not all digits.");
        }
    }
    /**
     * The isAllDigits function checks whether the input string consists of digits only.
     *
     * @param s The input string to be checked
     * @return True if the input string consists of digits only, false otherwise
     */
    private static boolean checkAllDigits(String s) {
        // Base case: if the length of the string is 0, return true
        if (s.length() == 0) {
            return false; // empty string is not all digits
        } else if (s.length() == 1) {
            return Character.isDigit(s.charAt(0)); // check if single character is a digit
        } else {
            boolean firstCharIsDigit = Character.isDigit(s.charAt(0));
            boolean restOfStringIsDigits = checkAllDigits(s.substring(1));
            return firstCharIsDigit && restOfStringIsDigits; // all characters are digits only if first character is a digit and rest of the string is all digits
        }
    }
}
