// - Reverse a given string and print the result.

import java.util.Scanner;

public class Que15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  String ");
        String input = sc.nextLine();

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Original String is " + input);
        System.out.println("Reversed String is " + reversed);
        sc.close();
    }

}
