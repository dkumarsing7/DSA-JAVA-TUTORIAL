public class pattern8 {
    public static void main(String[] args) {
        for(int i=4; i>=0; i--){
            
            for(int j=5; j>=i; j--){
                System.out.print("  ");
                }
            
            for(int k=(2*i)+1; k>0; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }           
    
}
