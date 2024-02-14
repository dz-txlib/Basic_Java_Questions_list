// /18. Write a program to determine the largest among three numbers using the ternary operator.

import java.util.Scanner;

public class Que18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number ");
        int n1 = sc.nextInt();
        System.out.println("Enter first number ");
        int n2 = sc.nextInt();
        System.out.println("Enter first number ");
        int n3 = sc.nextInt();

        // Using ternary operator to find the largest
        int largest = (n1 >= n2 && n1 >= n3) ? n1 : (n2 >= n1 && n2 >= n3) ? n2 : n3;

        System.out.println(largest + " is the largest number.");

        sc.close();
    }

}
