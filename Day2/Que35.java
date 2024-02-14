// 35. Write a program to calculate the BMI (Body Mass Index) based on user input.

import java.util.Scanner;

class Que35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight in KG");
        double weight = sc.nextDouble();
        System.out.println("Enter your height in Meters");
        double height = sc.nextDouble();

        double BMI = weight / (height * height);
        System.out.println(" Your BMI is " + BMI);
        sc.close();

    }

}
