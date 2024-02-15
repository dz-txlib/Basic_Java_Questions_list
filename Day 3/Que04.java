// 4. Write a program to find the factorial of a number using a do-while loop. 

import java.util.Scanner;

class Que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        int factorial = 1;
        int i = 1;
        do {
            factorial = factorial * i;
            i++;
        } while (i <= a);
        System.out.println("Factorial of " + a + " is " + factorial);
        sc.close();
    }

}
