// - Count and print the number of vowels and consonants in a given string.

public class Que14 {
    public static void main(String[] args) {

        String str = "Mohammad Talib";
        int vCount = 0;
        int cCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vCount = vCount + 1;
            } else {

                cCount = cCount + 1;
            }

        }
        System.out.println("Total vowels in " + str + " is " + vCount);
        System.out.println("Total constants in " + str + " is " + cCount);

    }
}
