// 19. Create a program to check if a number is a palindrome using a while loop.

import java.util.Scanner;

public class Que19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        String s = sc.nextLine();
        String r = "";
        int i = s.length() - 1;

        while (i >= 0) {
            r += s.charAt(i);
            i--;
        }
        if (s.equals(r)) {
            System.out.println("Number " + s + " and Number " + r + " are pallindrome");
        } else {

            System.out.println("Number " + s + " and Number " + r + " are not pallindrome");
        }
        sc.close();
    }
}
