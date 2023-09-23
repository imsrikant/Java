
// copy element of one array into another array.
/**
 * d
 */
import java.util.Scanner;

public class d {

    public static void main(String[] args) {
        int[] arr;
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        size = scanner.nextInt();
        arr = new int[size];
        arrEntry(arr);
        int[] newArr = copyArr(arr);
        System.out.println("Old Array");
        printArr(arr);
        System.out.println("New Array");
        printArr(newArr);
        scanner.close();
    }

    public static void arrEntry(int[] arr) {
        Scanner scanner = new Scanner(System.in);
       for (int i = 0; i < arr.length; i++) {
           System.out.printf("Enter the value for %d: ", (i + 1));
           arr[i] = scanner.nextInt();
       }
        scanner.close();
    }

    public static int[] copyArr(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

    
}
