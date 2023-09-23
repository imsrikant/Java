
// copy element of one array into another array.
/**
 * d
 */
import java.io.PrintStream;
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
        printArr(arr);
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

    public static void printArr(int[] arr) {
        for (int i : arr) {
            extracted(arr, i);
        }
    }

    private static PrintStream extracted(int[] arr, int i) {
        return System.out.printf("Value: %d\n", arr[i]);
    }
}
