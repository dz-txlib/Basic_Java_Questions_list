// 7. Copy Elements from One Array to Another.

public class Que7 {
    public static void main(String[] args) {
        // Initialize the original array
        int[] arr1 = { 1, 2, 3, 4, 5 };

        // Create a new array with the same size as arr1
        int[] arr2 = new int[arr1.length];

        // Copy elements from arr1 to arr2
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        // Display elements of the original array
        System.out.println("Elements of the original array:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // Display elements of the new array
        System.out.println("Elements of the new array:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
