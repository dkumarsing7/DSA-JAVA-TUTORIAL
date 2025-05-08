import java.util.Scanner;

public class Calculator1{
    public static int calculate(int a, int b, int op){
        switch (op) {

            case 1:
                return a+b;
            case 2:
                return a-b;
        
            default:
                return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(   "Choose option from below\n" +
                            "1. Add\n" +
                            "2. Sub\n" +
                            "3. Exit\n"
                        );
        int op = sc.nextInt();
        System.out.print("Enter num 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter num 2 : ");
        int b = sc.nextInt();
        System.out.print("Your result is : " + calculate(a, b, op));
    }
}