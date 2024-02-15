// 29. Create a program to check if a given number is a multiple of 4 using a do-while loop. 

public class Que29 {
    public static void main(String[] args) {
        String s = "16";
        int x = Integer.parseInt(s);
        int y = 0;
        int i = s.length();
        do {
            y = x % 4;
            x = x / 10;

        } while (i <= 0);
        if (y == 0) {
            System.out.println(s + " is divisable by 4 ");
        } else {

            System.out.println(s + " is not divisable by 4 ");
        }
    }
}
