public class RomanToInteger {
    public static int convertor(char str) {
        switch (str) {
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

    public static int romanToInt(String s) {
        int total = convertor(s.charAt(0)); 

        for (int i = 1; i < s.length(); i++) {
            int curr = convertor(s.charAt(i));
            int prev = convertor(s.charAt(i - 1));

            if (curr > prev) {
                total += curr - 2 * prev; 
            } else {
                total += curr;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MMCCCXLVIII"));    
    }
}