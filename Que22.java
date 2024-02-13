// 22. Write a program to find the factorial of a number.

public class Que22 {
    public static void main(String[] args) {
        int a = 5;
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial = factorial * i;

        }
        System.out.println("Factorial of a is " + factorial);
    }

}
