// 2. Find the Sum of Array Elements. 

import java.util.Scanner;

public class Que2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements in the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Initialize the array
        int[] arr = new int[n];

        // Read the elements from the user
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate the sum of array elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // Print the result
        System.out.println("Sum of array elements is: " + sum);
        sc.close();
    }

}
