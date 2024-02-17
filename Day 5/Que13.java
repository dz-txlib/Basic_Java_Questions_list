// 13. Find the Row with the Maximum Sum in a 2D Array.

public class Que13 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int maxSum = Integer.MIN_VALUE;
        int maxSumRow = -1;

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum > maxSum) {
                maxSum = rowSum;
                maxSumRow = i;
            }
        }

        System.out.println("Row with maximum sum: " + maxSumRow);
    }

}
