// Convert a sentence to CamelCase and print the result. 

import java.util.Scanner;

public class Que17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  String ");
        String inputSentence = sc.nextLine();
        // This is example String inputSentence = "THIS STRING SHOULD BE IN CAMEL CASE";

        String[] words = inputSentence.split("[\\W_]+");
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i == 0) {
                word = word.isEmpty() ? word : word.toLowerCase();
            } else {
                word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            }
            builder.append(word);
        }

        System.out.println("CamelCase result: " + builder.toString());
        sc.close();
    }

}

// explaination :- 

/*We split the input sentence into words using regular expression [\\W_]+,
 which matches any non-word character (including whitespace and underscores).

For each word:

If it’s the first word, convert it to lowercase.

Otherwise, capitalize the first character and convert the rest to lowercase.

Finally, we print the CamelCase result.

Test this program with different sentences!  */