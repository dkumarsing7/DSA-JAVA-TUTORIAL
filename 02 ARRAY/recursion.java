public class recursion {
    public static void printNum(int n) {
        if (n != 0) {
            System.out.println(n);
            printNum(n - 1);
        }
    }

    public static void numSum(int n, int sum) {

        if (n > 0) {
            sum += n;
            numSum(n - 1, sum);
        }
        if (n < 0) {
            sum += n;
            numSum(n + 1, sum);
        } else {
            System.out.println(sum);
        }

    }

    public static void main(String[] args) {
        // printNum(5);
        numSum(-5, 0);
    }
}
