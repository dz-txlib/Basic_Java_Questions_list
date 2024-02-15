// 17. Write a program to print the pattern: 1, 22, 333, 4444, 55555 using nested for loops.

public class Que17 {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(x);

            }
            System.out.println("");
            x++;
        }
    }

}
