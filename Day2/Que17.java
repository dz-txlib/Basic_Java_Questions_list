// . Create a program to determine the day of the week based on a given number (1 for Sunday, 2 for Monday, etc.). 

import java.util.Scanner;

class Que17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the day number : ");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println(a + " Today is Sunday");
                break;
            case 2:
                System.out.println(a + " Today is Monday");
                break;
            case 3:
                System.out.println(a + " Today is Tuesday");
                break;
            case 4:
                System.out.println(a + " Today is Wednesday");
                break;
            case 5:
                System.out.println(a + " Today is Thursday");
                break;
            case 6:
                System.out.println(a + " Today is Friday");
                break;
            case 7:
                System.out.println(a + " Today is Saturday");
                break;
            default:
                System.out.println("Enter valid number between 1 to 7 ");

        }
        sc.close();

    }
}
