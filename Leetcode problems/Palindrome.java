public class Palindrome {
    public static boolean isPalindrome(int x) {
        if(x<0){return false;}
        int result = 0;
        int num = x;
        while(x != 0){
            int rem = x%10; 
            
            if(result>Integer.MAX_VALUE/10 || result<Integer.MIN_VALUE/10){
                return false;
            }       
            result = result*10 + rem;
            x/=10;
        }
        if(num == result){return true;}else{return false;}
    }
    public static void main(String[] args) {
         if(isPalindrome(121)){
            System.out.print("pallindrome");
            }
        else{
             System.out.print("not pallindrome");
         }
    }
}