// 15. Write a program to convert a given month number to its corresponding name.

import java.util.Scanner;

class Que15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the month number : ");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println(a + " This is January");
                break;
            case 2:
                System.out.println(a + " This is Feburary");
                break;
            case 3:
                System.out.println(a + " This is March");
                break;
            case 4:
                System.out.println(a + " This is Aipril");
                break;
            case 5:
                System.out.println(a + " This is May");
                break;
            case 6:
                System.out.println(a + " This is June");
                break;
            case 7:
                System.out.println(a + " This is July");
                break;
            case 8:
                System.out.println(a + " This is August");
                break;
            case 9:
                System.out.println(a + " This is September");
                break;
            case 10:
                System.out.println(" This is October");
                break;
            case 11:
                System.out.println(" This is November");
                break;
            case 12:
                System.out.println(" This is December");
                break;
        }
        sc.close();
    }
}
