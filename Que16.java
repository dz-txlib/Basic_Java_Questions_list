// 16. Create a program that takes user input for their age and prints it.

import java.util.Scanner; // This is predefined class in java 

class Que16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // sc is the object of Scanner class it is used to take user input
        System.out.println("Enter your age ");
        int age = sc.nextInt();

        // sc.nextInt() --> nextInt is the method we used to when we want integer in
        // input

        System.out.println("your age is " + age);

        sc.close(); // This is for clasing the Scanner
    }

}
