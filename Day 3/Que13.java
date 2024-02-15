// 13. Write a program to check if a given string is a palindrome using a for loop.

import java.util.Scanner;

public class Que13 {
    public static void main(String[] args) {
        String inputString, reversedString = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        inputString = sc.nextLine();

        int length = inputString.length();
        for (int i = length - 1; i >= 0; i--) {
            reversedString += inputString.charAt(i);
        }

        if (inputString.equals(reversedString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
        sc.close();
    }
}
