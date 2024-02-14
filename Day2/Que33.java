// 33. Implement a program to determine the day of the week using if-else statements. 

import java.util.Scanner;

class Que33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the day number : ");
        int a = sc.nextInt();

        if (a == 1) {
            System.out.println("Today is Sunday");
        }

        else if (a == 2) {

            System.out.println(" Today is Monday");
        }

        else if (a == 3) {

            System.out.println(" Today is Tuesday");
        }

        else if (a == 4) {

            System.out.println(" Today is Wednesday");
        }

        else if (a == 5) {

            System.out.println(" Today is Thursday");
        }

        else if (a == 6) {

            System.out.println(" Today is Friday");
        }

        else if (a == 7) {

            System.out.println(" Today is Saturday");
        }

        else {
            System.out.println("You entered the wrong number");
        }
        sc.close();
    }
}
