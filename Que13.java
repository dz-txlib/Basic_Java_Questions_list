
// 13. Write a program to swap the values of two variables without using a third variable also dont use ' + ' operator.

class Que13 {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        // swapping
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a);
        System.out.println(b);
    }
}
