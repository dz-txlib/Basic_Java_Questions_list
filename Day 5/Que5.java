// 5. Reverse an Array. 

public class Que5 {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println("Reversed array is:");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

    }
}
