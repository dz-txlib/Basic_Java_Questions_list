// 9. Create a program to generate and print the first 10 square numbers using a do-while loop.

class Que9 {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i + " square number is " + (i * i));

            i++;
        } while (i <= 10);
    }
}
