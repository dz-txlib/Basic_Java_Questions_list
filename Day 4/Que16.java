// - Remove duplicate characters from a string and print the modified string.

import java.util.Scanner;

public class Que16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  String ");
        String input = sc.nextLine();
        char[] str = input.toCharArray();
        int length = str.length;
        int index = 0;
        for (int i = 0; i < length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }
            if (j == i) {
                str[index++] = str[i];
            }
        }
        System.out.println(
                "After remove duplicate characters from the string  it looks like : " + String.valueOf(str, 0, index));

        sc.close();
    }

}
