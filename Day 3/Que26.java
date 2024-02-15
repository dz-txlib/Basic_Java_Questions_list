// 26. Create a program to print the multiplication table for a given number using a while loop.

import java.util.Scanner;

public class Que26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int x = sc.nextInt();

        int i = 1;
        while (i < 11) {
            System.out.println(x + " X " + i + " = " + x * i);
            i++;
        }
        sc.close();
    }

}
