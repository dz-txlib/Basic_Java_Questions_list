// 6. Create a program to print the Fibonacci series up to 10 terms using a for loop.

class Que6 {
    public static void main(String[] args) {
        int number = 10;
        ;
        int firsterm = 0;
        int secondterm = 1;
        int i = 3;

        System.out.print("fabonacci series  : " + firsterm + " , " + secondterm);

        do {
            int nextTerm = firsterm + secondterm;

            System.out.print("  ,  " + nextTerm);
            firsterm = secondterm;
            secondterm = nextTerm;
            i++;
        } while (i <= number);
    }

}
