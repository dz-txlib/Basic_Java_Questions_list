// - Format a string using placeholders and print the result.

import java.util.Scanner;

public class Que18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  String ");
        String name = sc.nextLine();
        // example String name = "Alice";
        int age = 30;

        // Using placeholders with String.format
        String formattedString = String.format("Hello, my name is %s and I am %d years old.", name, age);
        System.out.println(formattedString);
        sc.close();
    }

}
