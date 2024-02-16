// - Check if a given string contains a specific substring and print the result.

public class Que10 {
    public static void main(String[] args) {
        String fullName = "Mohammad Talib";
        String lastName = "Talib";
        if (fullName.contains(lastName)) {
            System.out.println("String " + fullName + " contains " + lastName);

        } else {

            System.out.println("String '" + fullName + "' does not contains " + lastName);
        }

    }

}
