// 34. Write a program to calculate the sum of digits in a given number.

import java.util.Scanner;

class Que34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;

        }
        System.out.println("the sum of digits of a given number is  " + sum);
        sc.close();
    }

}
