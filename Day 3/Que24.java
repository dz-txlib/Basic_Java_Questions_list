// 24. Implement a program to print the pattern: 1, 2, 4, 8, 16 using a while loop.

public class Que24 {
    public static void main(String[] args) {
        int i = 0;
        int x = 2;

        while (i <= 4) {
            int y = (int) Math.pow(x, i);

            System.out.print(y + " ");
            // 1 2 4 8 16

            i++;
        }
    }

}
