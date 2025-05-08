import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
    public static int getRandomNumber() {

        int min = 1; 
        int max = 100;

        int randNumber = ThreadLocalRandom.current().nextInt(min, max);
        return randNumber;
    }
    public static int getRandomNumber2() {

        int min = 1; 
        int max = 100; 

        int randNumber = (int)(Math.random()*max);
        return randNumber;
    }
    public static int getRandomNumber3() {

        int min = 1; 
        int max = 100; 
        Random rand = new Random();

        int randNumber = rand.nextInt(max+1);
        return randNumber;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any number between 1 and 100: ");
        int randNumber = getRandomNumber();
        while(true){
            int input = scan.nextInt();
            if(input == randNumber){
                System.out.println("you guessed it right!!");
                break;
            }else
            if(input >= (randNumber+10) || input<= (randNumber-10)){
                System.out.println("cold!");
                System.out.println("Enter number again: ");
            }else{
                System.out.println("hot!");
                System.out.print("Enter number again: ");
            }
            
        }

    }
}