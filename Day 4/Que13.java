// - Write a program to check if a given string is a palindrome.

import java.util.Scanner;

public class Que13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  String ");
        String input = sc.nextLine();

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        input = input.toLowerCase(); // Convert to lowercase for case-insensitive comparison
        boolean result = (input.equals(reversed));

        if (result) {

            System.out.println(" \"" + input + "\" a palindrome? ");
        } else {

            System.out.println(" \"" + input + "\" not a palindrome? ");

        }
        sc.close();
    }
}
