import java.util.Scanner;
public class AddDigits {
    public static int AddDigit(int num){
        int len = ((int)(Math.log10(num)))+1;
        String str = "";
        str += num;
        int result = 0;
        for(int i=0; i<len; i++){
            result += str.charAt(i) - '0';
        }
       int again = ((int)(Math.log10(result)+1)); 
        if(again>1){result = AddDigit(result);}
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(sc);
        int input = sc.nextInt();
        System.out.print("answer : " + AddDigit(input));
    }
}
