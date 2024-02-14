// 5. Implement a program to check if a number is divisible by 5 and 7.

import java.util.Scanner;

class Que05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int a = sc.nextInt();
        
        if (a % 5 == 0 && a % 7 == 0) {
            System.out.println("a is divisable by 5 and 7 ");
        } else {

            System.out.println("a is not  divisable by 5 and 7 ");
        }
        sc.close();
    }

}
