// 16. Implement a program to check if a given string is empty or not.

import java.util.Scanner;

class Que16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name ");
        String name = sc.nextLine();
        if (name.isEmpty()) {
            System.out.println("The string name is empty ");

        } else {

            System.out.println("The string name is not empty ");
        }
        sc.close();
    }

}
