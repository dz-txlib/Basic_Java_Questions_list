// 20. Write a program to print the sum of odd numbers from 1 to 50 using a for loop.

public class Que20 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                continue;
            }
            sum += i;

        }
        System.out.println("The sum of odd integers between 1 to 50 is " + sum);
    }

}
