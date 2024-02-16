// - Extract and print all the numbers from a given alphanumeric string.

import java.util.Scanner;

public class Que19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  String ");
        String inputString = sc.nextLine();
        // example :- String inputString = "abc12$%3d4e5f6";
        StringBuilder extractedNumbers = new StringBuilder();

        for (char ch : inputString.toCharArray()) {
            if (Character.isDigit(ch)) {
                extractedNumbers.append(ch);
            }
        }

        System.out.println("Extracted numbers: " + extractedNumbers.toString());

        sc.close();
    }

}

// Explanation:

// We take the input alphanumeric string (inputString).

// We iterate through each character in the string.

// If the character is a digit (using Character.isDigit(ch)),
// we append it to the extractedNumbers StringBuilder.

// Finally, we print the extracted numbers.

// Test this program with different input strings! 😊