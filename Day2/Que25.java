// 25. Implement a program to check if a number is negative, positive, or zero using a switch statement. 

import java.util.Scanner;

class Que25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number : ");
        int a = sc.nextInt();
        String result;
        switch (Integer.signum(a)) {
            case 1:
                result = "The number is positive";
                break;
            case -1:
                result = "The number is negative";
                break;
            default:
                result = "The number is zero";

        }
        System.out.println(result);
        sc.close();

    }
}
