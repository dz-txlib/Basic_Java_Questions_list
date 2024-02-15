// 5. Implement a program to calculate the average of 5 numbers using a for loop.

import java.util.Scanner;

class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter number " + i + " :");
            Double number = sc.nextDouble();
            sum += number;

        }

        double average = (sum) / 5;
        System.out.println("The average of the numbers is : " + average);

        sc.close();

    }

}
