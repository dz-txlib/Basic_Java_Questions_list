// 1. Write a program to check if a number is positive or negative.

import java.util.Scanner;

class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int a = sc.nextInt();

        if (a < 0) {
            System.out.println("number is positive ");
        } else {
            System.out.println("number is negative");

        }
        sc.close();
    }

}
