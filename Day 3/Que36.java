// 36. Write a program to check if a given number is a palindrome using nested while loops.

public class Que36 {
    public static void main(String[] args) {
        int n = 454; // It is the number variable to be checked for palindrome
        int temp = n; // Store the original number

        int r, sum = 0;
        while (n > 0) {
            r = n % 10; // Get the last digit
            sum = (sum * 10) + r; // Reverse the number
            n = n / 10; // Remove the last digit
        }

        if (temp == sum) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome");
        }
    }

}
