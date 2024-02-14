// 21. Create a program to check if a character is an uppercase or lowercase letter.

class Que21 {
    public static void main(String[] args) {
        char name = 'A';

        int a;
        a = (int) name;
        System.out.println(a);
        if (a <= 65 || a > 97) {
            System.out.println("name is upper case latter");

        } else if (a <= 97 || a > 123) {
            System.out.println("name is lower case latter");

        }
    }

}
