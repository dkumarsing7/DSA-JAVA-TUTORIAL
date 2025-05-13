public class sorting {
    public static int[] bubblesSort(int[] arr) {
        System.out.println("Sorting using Bubble Sort");
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 1; j <= len - i - 1; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        System.out.println("Sorting using Selection Sort");
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        System.out.println("Sorting using Insertion Sort");
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }

    public static void printArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 6, 4, 4, 2, 1, 7, 1 };
        printArr(bubblesSort(arr));
        printArr(selectionSort(arr));
        printArr(insertionSort(arr));
    }
}