// 22. Write a program to find the sum of digits of a number using a do-while loop. 

public class Que22 {
    public static void main(String[] args) {
        int num = 324;
        int sum = 0;

        do {
            int digit = num % 10;
            sum += digit;
            num = num / 10;

        } while (num != 0);
        System.out.println(sum);
    }
}
