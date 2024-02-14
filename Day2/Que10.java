// 10. Implement a program to calculate the discount based on the purchase amount. 

import java.util.Scanner;

class Que10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount");
        double amount = sc.nextInt();
        double discount = 0;

        if (amount >= 5000) {
            discount = 0.20;
            System.out.println("Your discount is " + ((amount * discount)));
        } else if (amount >= 2000) {
            discount = 0.15;

            System.out.println("Your discount is " + ((amount * discount)));
        } else if (amount >= 1000) {
            discount = 0.10;

            System.out.println("Your discount is " + ((amount * discount)));
        }

        else {
            discount = 0.05;

        }
        sc.close();
    }
}
