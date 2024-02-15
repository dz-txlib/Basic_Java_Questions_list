// 15. Create a program to print the prime numbers between 1 and 50 using a for loop.

public class Que15 {
    public static void main(String[] args) {
        int low = 1, high = 50;

        System.out.println("Prime numbers between " + low + " and " + high + " are:");
        while (low <= high) {
            boolean isPrime = true;

            // Check for divisibility from 2 up to low/2
            for (int i = 2; i <= low / 2; i++) {
                if (low % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && low > 1) {
                System.out.print(low + " ");
            }

            low++;
        }
    }
}
