// 31. Create a program to check if a given number is a power of two.

import java.util.Scanner;

public class Que31 {

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");

        int num1 = sc.nextInt();
        System.out.println("Enter second number");

        int num2 = sc.nextInt();

        System.out.println(isPowerOfTwo(num1) ? num1 + " is a power of 2." : num1 + " is not a power of 2.");
        System.out.println(isPowerOfTwo(num2) ? num2 + " is a power of 2." : num2 + " is not a power of 2.");

        sc.close();
    }

}
