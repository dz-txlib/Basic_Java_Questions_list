// 12. Create a program to calculate the sum of even numbers from 1 to 50 using a for loop.

public class Que12 {
    public static void main(String[] args) {
        int i = 2;
        int sum = 0;
        while (i <= 50) {
            if (i % 2 == 0) {
                sum += i;

            }
            i++;

        }
        System.out.println("The sum of even numbers from 1 to 50 is " + sum);

    }
}
