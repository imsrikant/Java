// transpose of matrix 4X4 row into column and column into row

/**
 * e
 */
import java.util.Scanner;
public class e {

    public static void main(String[] args) {
        final int size = 4;
        int[][] arr = give2dArr(size, size);
        enter2dValue(arr);
        System.out.println("Array.");
        print2dArr(arr);
        System.out.println("Transpose Array.");
        transpose2dArr(arr);
    }

    static int[][] give2dArr(int rows, int columns) {
        int[][] temp = new int[rows][columns];
        return temp;
    }

    static void enter2dValue(int[][] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Enter the value for row %d X column %d: ", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
    }
    static void transpose2dArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[j][i]);
            }
            System.out.println();
        }
    }
    static void print2dArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }


}
