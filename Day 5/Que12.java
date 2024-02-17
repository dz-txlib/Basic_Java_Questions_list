
// 12. Implement Binary Search on a Sorted Array.
import java.util.Arrays;

public class Que12 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int key = 30;

        int result = Arrays.binarySearch(arr, key);

        if (result >= 0) {
            System.out.println("Element " + key + " found at index " + result);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }
}
