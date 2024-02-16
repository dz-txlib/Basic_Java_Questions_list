// - Compare two strings and print whether they are equal or not.

import java.util.Scanner;

public class Que06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first  String ");
        String first = sc.nextLine();
        System.out.println("Enter the second String ");
        String second = sc.nextLine();
        if (second.equals(first)) {
            System.out.println("They are equal");
        } else {

            System.out.println("They are not equal");
        }
        sc.close();

    }
}
