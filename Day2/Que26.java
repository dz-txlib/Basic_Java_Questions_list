// 26. Create a program to calculate the factorial of a number using a while loop.

import java.util.Scanner;

class Que26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number : ");
        int number = sc.nextInt();
        int factorial = 0;
        int i = 0;
        while (i <= number) {
            factorial += i;
            i++;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
        sc.close();

    }

}
