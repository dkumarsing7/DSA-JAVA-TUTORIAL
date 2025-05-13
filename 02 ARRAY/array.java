import java.util.Scanner;

public class array {

    public static void arrInput() {
        int[] array = new int[3];
        // int array[] = new int[3];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        // array[3] = 30;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
        }
    }

    public static void arrloop() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] number = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.println(number[i]);
        }
        System.out.println("Enter the values of array : ");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
            }
        System.out.println("values of array are : ");
        for (int i = 0; i < size; i++) {
            System.out.println(number[i]);
        }

    }

    public static void arrSearch(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to search in array : ");
        int search = sc.nextInt();
        int[] arr = {1,2,3,4,5};
        int len = arr.length;
        for(int i=0; i<len; i++){
            if(arr[i] == search){
                System.out.print(search + " found at index at " + arr[i]);
            }
        }
    }
 
    public static void strBuilder(){
        String word = "Tony Stark";
        StringBuilder sb = new StringBuilder(word);
        sb.insert(0, "d");
        sb.delete(0, 1);
        sb.replace(0, 1, "Tony T");
        System.out.println(word);
        System.out.println(sb);
    }
    public static void main(String[] args) {
        // arrInput();
        // arrloop();
        // arrSearch();
        // strBuilder();

    }
}