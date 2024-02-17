// 3. Find the Largest Element in an Array.

public class Que3 {
    public static void main(String[] args) {
        int[] arr = { 10, 324, 45, 90, 9808 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element in the given array is: " + max);
    }
}
