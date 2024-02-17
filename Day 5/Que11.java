
// 11. Find the Second Largest Element in an Array.
import java.util.Arrays;

public class Que11 {

    public static void main(String[] args) {
        int[] arr = { 10, 5, 20, 15, 25 };

        Arrays.sort(arr);
        System.out.println("Second largest element: " + arr[arr.length - 2]);
    }
}
