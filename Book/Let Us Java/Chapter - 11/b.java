// twenty five number to input check how many times positive, negative, even and odd is present

/**
 * b
 */
import java.util.Scanner;

public class b {

    public static void main(String[] args) {
        int[] arr;
        arr = new int[25];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter the element %d: ", (i + 1));
            arr[i] = scanner.nextInt();
        }
        evenAndOdd(arr);
        positiveOrNot(arr);
        scanner.close();
    }

    static void evenAndOdd(int[] arr) {
        int countEven = 0, countOdd = 0;
        for (int arrElement : arr) {
            if (arrElement % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Even: " + countEven);
        System.out.println("Odd: " + countOdd);
    }

    static void positiveOrNot(int[] arr) {
        int countPositive = 0, countNegative = 0;
        for (int arrElement : arr) {
            if (arrElement > 0) {
                countPositive++;
            } else if (arrElement == 0) {
                continue;
            } else {
                countNegative++;
            }
        }
        System.out.println("Positive: " + countPositive);
        System.out.println("Negative: " + countNegative);
    }
}
