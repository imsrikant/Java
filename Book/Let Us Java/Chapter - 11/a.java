
// twenty five element search a value and how many times it repeated
/**
 * a
 */
import java.util.Scanner;

public class a {

    public static void main(String[] args) {
        double[] arr;
        arr = new double[25];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter the element %d: ", (i + 1));
            arr[i] = scanner.nextDouble();
        }
        System.out.print("Enter the value for search: ");
        double value = scanner.nextDouble();
        System.out.printf("The number of time value is present is %d.", (howManyTimes(arr, value)));
        scanner.close();
    }

    static int howManyTimes(double[] arr, double value) {
        int count = 0;
        if (isPresent(arr, value)) {
            for (double arrElement : arr) {
                if (arrElement == value) {
                    count++;
                }
            }
        }
        return count;
    }

    static boolean isPresent(double[] arr, double value) {
        boolean isTrue = false;
        for (double arrElement : arr) {
            if (arrElement == value) {
                return isTrue = true;
            }
        }
        return isTrue;
    }
}
