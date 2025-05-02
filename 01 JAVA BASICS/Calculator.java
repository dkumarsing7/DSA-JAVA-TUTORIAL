import java.util.Scanner;

public class Calculator {
        static int calculate(int a, int b, String op){
        switch (op) {
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                if(b != 0){
                    return a/b;            
                }else{System.out.print("Can't divide by zero");}
            default:
                System.out.print("Please enter a valid input");
                return 0;
        }
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter operation to perform : ");
        String op = scan.nextLine();
        System.out.print("Enter operator 1 : ");
        int a = scan.nextInt();
        System.out.print("Enter operator 2 : ");
        int b = scan.nextInt();
        int result = calculate(a,b,op);
        System.out.print(result);


    }
}
