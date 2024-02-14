// 23. Implement a program to check if a given number is a multiple of both 4 and 7. 

import java.util.Scanner;

class Que23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the number  : ");

        int a = sc.nextInt();
        if (a % 4 == 0 && a % 7 == 0) {
            System.out.println("number " + a + " is divisable by 4 and 7 ");
        } else {

            System.out.println("number " + a + " is not  divisable by 4 and 7 ");
        }
        sc.close();

    }

}
