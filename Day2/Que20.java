// 20. Implement a program to classify a triangle (equilateral, isosceles, or scalene) based on its sides.

import java.util.Scanner;

class Que20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the value of first side : ");
        int side1 = sc.nextInt();
        System.out.println(" Enter the value of second side : ");
        int side2 = sc.nextInt();
        System.out.println(" Enter the value of third side : ");
        int side3 = sc.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("This triangle is equilateral triangle");

        } else if (side1 == side2 && side2 != side3 || side1 == side3 && side2 != side3
                || side3 == side2 && side1 != side3) {
            System.out.println("This triangle is isosceles triangle");

        } else if (side1 != side2 && side2 != side3) {
            System.out.println("This triangle is scalene triangle");
        }
        sc.close();

    }
}
