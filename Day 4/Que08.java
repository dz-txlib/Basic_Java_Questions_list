// - Replace a specific substring in a string with another substring and print the modified string.

public class Que08 {

    public static void main(String[] args) {

        String originalString = "The quick brown fox jumps over the lazy dog";
        String substringToReplace = "quick";
        String replacementSubstring = "swift";

        String modifiedString = originalString.replace(substringToReplace, replacementSubstring);

        System.out.println("Original string: " + originalString);
        System.out.println("Modified string: " + modifiedString);

    }

}
