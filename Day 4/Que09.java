// - Split a string into an array of substrings based on a specific delimiter and print the result.

public class Que09 {
    public static void main(String[] args) {
        String firstName = "Mohammad";

        char name[] = { 's', 'f', 'h', 'g', 'a', 'q', 'w', 'x' };
        for (int i = 0; i < firstName.length(); i++) {

            name[i] = firstName.charAt(i);
        }

        for (int i = 0; i < name.length; i++) {

            System.out.print(name[i]);
        }
    }
}
