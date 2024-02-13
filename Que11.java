// 11. . Can you assign a float value to a double variable without explicit casting? 

class Que11 {
    public static void main(String[] args) {
        float f = (float) 12.5;
        double d;
        d = f;
        /*
         * Yes we can assign float value to a double variable without
         * using explicit type casting this is called implicit type casting
         */
        System.out.println(d);
    }
}
