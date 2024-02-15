// 14. Implement a program to calculate the square root of a number using a do-while loop

import java.util.Scanner;

public class Que14 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The square root of " + n + " is: " + squareRoot(n));
        sc.close();
    }

    public static double squareRoot(int num) {
        double t;
        double sqrtRoot = num / 2.0;

        do {
            t = sqrtRoot;
            sqrtRoot = (t + (num / t)) / 2.0;
        } while (Math.abs(t - sqrtRoot) != 0);

        return sqrtRoot;

    }

}
