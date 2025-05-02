import java.util.Scanner;

public class reverse{
    public static String reverse(String x){
        String result="";
        for (int i=x.length()-1;i>=0;i--){
            result+=x.charAt(i);
            }
        
        if(result.equals(x)){
            return result;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String to reverse : ");;
        String text = sc.nextLine();
        System.out.print(reverse(text));;
    }
}