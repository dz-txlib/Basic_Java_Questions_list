// 27. Write a program to check if a number is a perfect square using a for loop.

import java.util.Scanner;

public class Que27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int x = sc.nextInt();

        double sqr = Math.sqrt(x);
        int sr = (int) sqr;
        if ((sr * sr) == x) {

            System.out.println(x + " is a perfect square number ");

        } else {
            System.out.println(x + " is not a perfect square number ");

        }
        sc.close();

    }
}
