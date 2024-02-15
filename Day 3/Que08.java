// 8. Implement a program to print the reverse of a number using a while loop.

class Que8 {
    public static void main(String[] args) {
        int num = 6765;
        int mod = 0;
        int reverse = 0;
        while (num != 0) {
            mod = num % 10;
            reverse = reverse * 10 + mod;
            num /= 10;

        }
        System.out.println(reverse);

    }

}
