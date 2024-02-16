// - Access and print characters at various positions in a string.

public class Que11 {
    public static void main(String[] args) {
        String firstName = "Mohammad ";

        for (int i = 0; i < firstName.length() - 1; i++) {
            System.out.println("At Position " + (i + 1) + " " + firstName.charAt(i));

        }
    }

}
