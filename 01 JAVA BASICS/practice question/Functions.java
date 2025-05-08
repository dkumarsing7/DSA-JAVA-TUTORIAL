import java.util.Scanner;

public class Functions {
    static void Greeting(){
        System.out.println("It is no parameter function");
        System.out.println("Welcome Deepak kumar !\nLet's Complete DSA");
        }
    static void sum(int a, int b){
        System.out.print("Sum of " + a + " and "+ b +  " is : " + (a + b));

    }
    public static void main(String[] args){
        Greeting();
        sum(3, 5);
    }
}
