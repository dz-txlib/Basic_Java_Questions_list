// 10. Find Duplicate Elements in an Array

public class Que10 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };

        System.out.println("Duplicate elements in the given array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " ");
                    break; // Avoid printing duplicates multiple times
                }
            }
        }
    }
}
