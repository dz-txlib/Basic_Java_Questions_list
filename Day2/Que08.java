// 8. Implement a program to determine the season (spring, summer, fall, winter) based on the month.

import java.util.Scanner;

class Que08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month");
        String Month = sc.nextLine();
        if (Month == "March" && Month == "Aipril" && Month == "May") {
            System.out.println("This is the season of Summer");
        } else if (Month == "June" && Month == "July" && Month == "August") {
            System.out.println("This is the season of Fall");
        } else if (Month == "September" && Month == "October" && Month == "November") {
            System.out.println("This is the season of Winter");
        } else {
            System.out.println("This is the season of Spring");

        }
        sc.close();
    }

}
