// 7. Write a program to check if a number is prime using a for loop. 

import java.util.Scanner;

class Que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  :");
        Double check = sc.nextDouble();
        double sRoot = Math.sqrt(check);
        boolean result = false;

        for (int i = 2; i <= sRoot; i++) {
            if (check % i == 0) {
                result = true;
            }
        }
        if (result) {
            System.out.println("number " + check + " is not a prime number");
        } else {

            System.out.println("number " + check + " is a prime number");
        }

        sc.close();
    }

}
