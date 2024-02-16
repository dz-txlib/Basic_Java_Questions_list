// - Convert a string to uppercase and lowercase, and print both versions.

import java.util.Scanner;

public class Que05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String name = sc.nextLine();
        String upperCaseName = name.toUpperCase();
        String lowerCaseName = name.toLowerCase();
        System.out.println("in upper case " + upperCaseName);
        System.out.println("in lower case " + lowerCaseName);

        sc.close();
    }
}
