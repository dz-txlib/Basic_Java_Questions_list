// 12. Write a program to determine the grade of a student based on their marks.

import java.util.Scanner;

class Que12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter English marks");
        int English = sc.nextInt();
        System.out.println("Enter Maths marks");
        int Maths = sc.nextInt();
        System.out.println("Enter Science marks");
        int Science = sc.nextInt();
        System.out.println("Enter Hindi marks");
        int Hindi = sc.nextInt();
        System.out.println("Enter SOcial_Science marks");
        int SOcial_Science = sc.nextInt();

        int marks = (English + Hindi + SOcial_Science + Science + Maths) / 5;

        if (marks >= 90) {

            System.out.println("Your grade is A ");
        } else if (marks >= 80) {

            System.out.println("Your grade is B ");
        } else if (marks >= 70) {

            System.out.println("Your grade is C ");
        } else if (marks >= 60) {

            System.out.println("Your grade is D ");
        }
        sc.close();
    }
}
