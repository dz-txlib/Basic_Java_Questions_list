// 27. Write a program to check if a given number is a Fibonacci number.

import java.util.Scanner;

class Que27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number : ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        boolean isFab = false;

        while (b <= num) {
            if (b == num) {
                isFab = true;
                break;

            }
            int temp = a;
            a = b;
            b = temp + b;
        }
        if (isFab) {
            System.out.println("This number is a fibonacci number");

        } else {

            System.out.println("This number is  not a fibonacci number");
        }
        sc.close();

    }

}
