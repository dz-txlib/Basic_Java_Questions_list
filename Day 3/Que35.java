// 35. Implement a program to print the pattern: A, BB, CCC, DDDD using nested for loops.

public class Que35 {
    public static void main(String[] args) {
        char c = '@';
        int a = (int) c;
        ;
        int x = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {

                char m = (char) a;
                System.out.print(m);
            }
            a++;
            System.out.println("");
            x++;
        }
    }

}
