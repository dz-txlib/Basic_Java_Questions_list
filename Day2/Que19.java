// 19. Write a program to check if a given year is a leap year using a switch statement.

import java.util.Scanner;

public class Que19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();
        int remainder = year % 400 == 0 || year % 100 == 0 || year % 4 == 0 ? 1 : 0;

        switch (remainder) {
            case 1:
                System.out.println(year + " is a leap year.");
                break;
            default:
                System.out.println(year + " is not a leap year.");
        }
        sc.close();
    }

}
