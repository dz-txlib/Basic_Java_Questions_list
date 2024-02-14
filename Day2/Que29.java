// 29. Create a program to find the minimum of three numbers using logical operators.

import java.util.Scanner;

class Que29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter third number");
        int num3 = sc.nextInt();

        if (num1 < num2 && num1 < num3) {
            System.out.println("Number1 is minimum in all three numbers");
        }

        else if (num2 < num1 && num2 < num3) {
            System.out.println("Number2 is minimum in all three numbers");
        }

        else if (num3 < num1 && num3 < num2) {
            System.out.println("Number3 is minimum in all three numbers");
        } else {
            System.out.println("All numbers are equal ");
        }
        sc.close();
    }

}
