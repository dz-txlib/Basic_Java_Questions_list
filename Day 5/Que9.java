// 9. Merge Two Arrays. 

public class Que9 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 4, 5, 6 };

        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] mergedArray = new int[len1 + len2];

        System.arraycopy(arr1, 0, mergedArray, 0, len1);
        System.arraycopy(arr2, 0, mergedArray, len1, len2);

        System.out.println("Merged array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}
