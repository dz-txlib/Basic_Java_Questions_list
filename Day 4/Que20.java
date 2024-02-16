// - Split a sentence into words, reverse each word, and then join them back into a sentence.

import java.util.Scanner;

public class Que20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  String ");
        String inputSentence = sc.nextLine();
        // example String inputSentence = "Java programming is fun";
        String[] words = inputSentence.split(" ");

        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reversedSentence.append(reversedWord).append(" ");
        }

        // Remove the trailing space
        String finalSentence = reversedSentence.toString().trim();
        System.out.println("Reversed sentence: " + finalSentence);
        sc.close();
    }

}

/*
 * Explanation:
 * 
 * We split the input sentence into words using the space character as the
 * delimiter.
 * 
 * For each word, we reverse it using new
 * StringBuilder(word).reverse().toString().
 * 
 * Finally, we join the reversed words back into a sentence.
 * 
 * Test this program with different input sentences! 😊
 */