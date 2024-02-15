// 31. Implement a program to print the reverse of a string using a do-while loop. 

import java.util.Scanner;

public class Que31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        String reversedString = "";
        int length = inputString.length();
        int index = length - 1;

        do {
            reversedString += inputString.charAt(index);
            index--;
        } while (index >= 0);

        System.out.println("Reversed string: " + reversedString);
        sc.close();
    }

}
