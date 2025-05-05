public class Sqrt {
    public static int mySqrt(int x) {
        if (x == 0) return 0;
        // System.out.println("x is = " + x);
        double guess = x;
        // System.out.println("before while loop guess is = " + guess);
        while (guess * guess - x > 0.0001) {
            // System.out.println("guess sq -x " + (guess * guess - x));
            guess = (guess + x / guess) / 2;
            // System.out.println("guess is = " + guess);
        }

        return (int) guess; 
    }

    public static void main(String[] args) {
        int s1 = 100;
        System.out.println(mySqrt(s1)); // Output: 3
    }
}
