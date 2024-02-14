// 28. Implement a program to determine the eligibility for a discount based on the user's membership.

import java.util.Scanner;

class Que28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Choose your Membership  : ");
        System.out.println("'a' elite ");
        System.out.println("'b' pro ");
        System.out.println("'c' free ");

        String Membership = sc.nextLine();

        switch (Membership) {
            case "a":
                System.out.println(" You have 30% discount ");
                break;
            case "b":
                System.out.println(" You have 20% discount ");

                break;
            case "c":

                System.out.println(" You have 5% discount ");
                break;
            default:

                System.out.println(" Please choose right key");

        }
        sc.close();
    }

}
