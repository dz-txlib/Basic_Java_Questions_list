// 24. Write a program to determine if a given string is a palindrome.

import java.util.Scanner;

class Que24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String name = sc.nextLine();
        System.out.println(name);
        String reverse = new StringBuilder(name).reverse().toString();

        System.out.println(reverse);
        if (name.equalsIgnoreCase(reverse)) {
            System.out.println("This String is palindrome ");

        } else {
            System.out.println("This String is not palindrome ");

        }

        sc.close();
    }

}
