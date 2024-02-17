// 14. Find the Column with the Minimum Sum in a 2D Array.

public class Que14 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, -1, -4, -20 },
                { -8, -3, 4, 2, 1 },
                { 3, 8, 10, 1, 3 },
                { -4, -1, 1, 7, -6 }
        };

        int minSum = Integer.MAX_VALUE;
        int minSumColumn = -1;

        for (int j = 0; j < matrix[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < matrix.length; i++) {
                colSum += matrix[i][j];
            }
            if (colSum < minSum) {
                minSum = colSum;
                minSumColumn = j;
            }
        }

        System.out.println("Column with minimum sum: " + minSumColumn);
    }

}
