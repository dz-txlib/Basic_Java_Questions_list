// 8. Remove an Element from an Array.

import java.util.Arrays;

public class Que8 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] newArr = new int[arr.length - 1];
        int indexToRemove = 3;

        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i != indexToRemove) {
                newArr[k] = arr[i];
                k++;
            }
        }

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Array after removal: " + Arrays.toString(newArr));
    }
}
