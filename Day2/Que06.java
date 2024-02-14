// 6. Create a program to determine the eligibility of a person to vote based on their age.

import java.util.Scanner;

class Que06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println(" You are egligible  to vote ");
        } else {

            System.out.println(" You are not egligible  to vote  ");
        }
        sc.close();
    }
}
