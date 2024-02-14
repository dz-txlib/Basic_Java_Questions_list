// 11. Create a program to check if a number is within the range of 1 to 100.

import java.util.Scanner;

class Que11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num >= 1 && num <= 100) {
            System.out.println("Yes the nuber is under the range of 1 to 100 ");

        } else {
            System.out.println("No the nuber is not under the range of 100 ");

        }
        sc.close();
    }
}
