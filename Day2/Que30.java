// 30. Write a program to check if a given number is an Armstrong number.

import java.util.Scanner;

public class Que30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int number = sc.nextInt(); // Change this to the number you want to check
        int originalNumber = number;
        int remainder;
        int result = 0;
        int numberOfDigits = String.valueOf(number).length();

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, numberOfDigits);
            originalNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
        sc.close();
    }

}
