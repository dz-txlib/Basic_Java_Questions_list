// 30. Implement a program to print the pattern: 1, 1, 2, 3, 5, 8 using a for loop.

public class Que30 {
    public static void main(String[] args) {
        int n = 6; // Number of terms in the pattern
        int firstTerm = 1, secondTerm = 1;

        System.out.print("Fibonacci Pattern: ");
        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
