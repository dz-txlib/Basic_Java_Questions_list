// 4. Write a program to find the maximum of three numbers.

import java.util.Scanner;

class Que04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");

        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("Enter third number");
        int c = sc.nextInt();

        System.out.print("Maximum number is ");
        if (a > b && a > c) {
            System.out.println(a);
        } else if (a > b && a > c) {
            System.out.println(b);
        } else {
            System.out.println(c);

        }
        sc.close();
    }

}
