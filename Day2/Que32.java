// 32. Write a program to find the largest among five numbers using a switch statement.

import java.util.Scanner;

class Que32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter third number");
        int num3 = sc.nextInt();
        System.out.println("Enter fourth number");
        int num4 = sc.nextInt();
        System.out.println("Enter fifth number");
        int num5 = sc.nextInt();

        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            System.out.println("Number1 is maximum in all five numbers");
        }

        else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {

            System.out.println("Number2 is maximum in all five numbers");
        }

        else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {

            System.out.println("Number3 is maximum in all five numbers");
        }

        else if (num4 > num2 && num4 > num3 && num4 > num1 && num4 > num5) {

            System.out.println("Number4 is maximum in all five numbers");
        }

        else if (num5 > num2 && num5 > num3 && num5 > num1 && num5 > num1) {

            System.out.println("Number5 is maximum in all five numbers");
        }

        else {
            System.out.println("All numbers are equal ");
        }
        sc.close();
    }

}
