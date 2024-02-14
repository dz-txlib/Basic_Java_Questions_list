// 2. Implement a program to determine if a number is even or odd.

import java.util.Scanner;

class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("number is even  ");
        } else {
            System.out.println("number is odd");
        }
        sc.close();

    }

}
