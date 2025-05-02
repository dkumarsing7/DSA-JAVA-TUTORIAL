import java.util.Scanner;

public class intReverse {
    static int intReverse(int num) {
        int result = 0;
        while (num != 0) {
            int digit = num % 10;

            // Check for overflow before actual multiplication and addition
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
                return 0;
            }

            result = result * 10 + digit;
            num /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int input = sc.nextInt();
        System.out.println("Reverse of " + input + " is " + intReverse(input));
    }
}
