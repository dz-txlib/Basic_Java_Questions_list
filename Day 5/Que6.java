// 6. Check if Array Contains a Specific Element

import java.util.Arrays;

public class Que6 {
    public static void main(String[] args) {
        String[] strings = { "One", "Two", "Three", "Four", "Five" };
        String toFind = "Four";

        boolean found = Arrays.stream(strings).anyMatch(t -> t.equals(toFind));

        if (found) {
            System.out.println(toFind + " is found.");
        } else {
            System.out.println(toFind + " is not found.");
        }
    }

}
