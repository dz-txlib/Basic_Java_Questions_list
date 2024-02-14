// 3. Create a program to compare two numbers and print the larger one.

import java.util.Scanner;

class Que03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int a = sc.nextInt();

        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        sc.close();
    }

}
