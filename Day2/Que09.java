// 9. Create a program to check if a year is a leap year.

import java.util.Scanner;

class Que09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int days = sc.nextInt();
        switch (days) {
            case 365:
                System.out.println("This is not a leap year because it has " + days + " days");
                break;
            case 366:
                System.out.println("This is a leap year because it has " + days + " days");
                break;
            default:
                System.out.println("Enter valid days  , a year only have 365 or 366 days");
                break;

        }
        sc.close();
    }
}
