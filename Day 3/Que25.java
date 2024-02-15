// 25. Write a program to find the smallest digit in a number using a for loop.

import java.util.Scanner;

public class Que25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    String x = sc.nextLine();
    int a = 0;
    int b = 0;
    int y = Integer.parseInt(x);
    b = y % 10;
    for (int i = x.length(); i > 1; i--) {
      y = y / 10;
      a = y % 10;
      if (a < b) {
        b = a;
        a = 0;

      } else {
        a = 0;

      }

    }

    System.out.println("The smallest number in " + x + " is " + b);

    sc.close();
  }
}
