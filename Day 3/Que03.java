// 3. Create a program to print the multiplication table for a given number using a for loop.

import java.util.Scanner;

class Que03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " X " + i + " = " + x * i);

        }
        sc.close();

    }

}
