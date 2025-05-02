class Palindrome2 {
    public static boolean isPalindrome(int x) {
        String s="";
        s=s+x;
        int lo=0;
        int hi=s.length()-1;
        while(lo<hi){
            if(s.charAt(lo)!=s.charAt(hi)) return false;
            lo++;
            hi--;
        }
        return true;
    }

    public static void main(String[] args) {
        if(isPalindrome(121)){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("not palindrome");
        }
    }

}