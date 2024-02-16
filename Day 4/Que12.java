// - Convert a string containing an integer to an actual integer and perform a mathematical operation.

public class Que12 {
    public static void main(String[] args) {
        String one = "323";
        String two = "456";
        int oneInt = Integer.parseInt(one);
        int twoInt = Integer.parseInt(two);
        int three = oneInt + twoInt;
        System.out.println(three);
    }
}
