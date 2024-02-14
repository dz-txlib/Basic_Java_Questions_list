// 13. Implement a program to find the roots of a quadratic equation.

import java.util.Scanner;

class Que13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the value of cofficient of x^2 : ");
        int a = sc.nextInt();
        System.out.println(" Enter the value of cofficient of x : ");
        int b = sc.nextInt();
        System.out.println(" Enter the value of constant : ");
        int c = sc.nextInt();

        int inner = (b * b) - (4 * a * c);
        double st = Math.sqrt(inner);

        double root1 = (-b - st) / (2 * a);
        double root2 = (-b + st) / (2 * a);

        System.out.println("Your first root is " + root1);
        System.out.println("Your second root is " + root2);

        sc.close();
    }

}
