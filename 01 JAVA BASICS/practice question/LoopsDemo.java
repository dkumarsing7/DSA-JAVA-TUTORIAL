public class LoopsDemo {
    public static void main(String[] args){
        System.out.println("---------- FOR LOOP ----------");
        for(int i=0; i<10; i++){
            System.out.print(i+" ");
        }
        System.out.println("");
            
        System.out.println("---------- WHILE LOOP ----------");
        int x = 0;
        while(x<10){
            System.out.print(x + " ");
            x++;    
        }
        System.out.println("");
        System.out.println("---------- DO WHILE LOOP ----------");
        int y = 0;
        do{
            System.out.print(y + " ");
            y++;
        }while(y<10);
    }   
}
