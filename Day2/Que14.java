// 14. Create a program to check if a number is a prime number.

import java.util.Scanner;

public class Que14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int i = 2;
        boolean check = false;
        if (num < 2) {
            System.out.println(num + " is not a prime number.");
        } else {

            while (i <= num / 2) {
                if (num % i == 0) {
                    check = true;
                    break;
                }
                ++i;
            }
            if (!check)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
        sc.close();
    }

}
