// 32. Create a program to calculate the average of odd numbers from 1 to 50 using a while loop.

public class Que32 {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;

        while (i <= 50) {
            sum += i;
            i = i + 2;

        }
        System.out.println("The sum of odd integers between 1 to 50 is " + sum);

    }
}
