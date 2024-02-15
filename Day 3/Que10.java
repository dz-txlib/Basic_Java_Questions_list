// 10. Write a program to find the GCD of two numbers using a for loop.

class Que10 {
    public static void main(String[] args) {
        // Define the two numbers for which we want to find the GCD
        int x = 12, y = 8;

        int gcd = 1; // Initialize the GCD variable

        // Run a loop from 1 to the smallest of both numbers
        for (int i = 1; i <= x && i <= y; i++) {
            // Check if both conditions are satisfied (x is divisible by i and y is
            // divisible by i)
            if (x % i == 0 && y % i == 0) {
                gcd = i; // Store the value of i as the GCD
            }
        }

        // Print the GCD
        System.out.printf("GCD of %d and %d is: %d", x, y, gcd);
    }

}
