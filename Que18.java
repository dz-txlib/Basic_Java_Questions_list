
// 18. Declare a variable to store the result of 5 divided by 2. What is the result ? 
// Explain the concept of type casting in Java ?

class Que18 {
    public static void main(String[] args) {
        float var = (float) 5 / 2;
        System.out.println(var);

        // type casting is used to convert the data type of any variable

        // there are two types of type casting

        // 1. Implicit type casting :-it is used to
        // convert small data type to big data type
        int a = 45;
        long b = a;
        System.out.println(b);

        // 2. Explicit type casting :-it is used to
        // convert big data type to small data type
        long x = 45;
        int y = (int) x;
        System.out.println(y);

    }
}
