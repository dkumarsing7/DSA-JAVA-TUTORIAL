public class RomanToInteger {
    public static int convertor(char s){
        switch (s) {
            case 'M': return 1000;
            case 'D': return 500;
            case 'C': return 100;
            case 'L': return 50;
            case 'X': return 10;
            case 'V': return 5;
            case 'I': return 1;
            default: return 0;
        }
    }

    public static int romanToInt(String s){
        int result = convertor(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            int preString = convertor(s.charAt(i-1));
            int current = convertor(s.charAt(i));
            if(preString<current){
                result+=current -(2*preString);
            }else{
                result+=current;
            }
        }return result;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("MMCCCXLVIII"));    
    }
}