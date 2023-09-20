
/**
 * g
 */
import java.util.Scanner;

public class g {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the natural number: ");
        number = scanner.nextInt();
        int sum = naturalSum(number);
        System.out.println("Sum: " + sum);
        scanner.close();
    }

    static int naturalSum(int number) {
        int sum = 1;
        if (number == 0) {
            return 0;
        } else {
            sum += naturalSum(number - 1);
        }
        return sum;
    }
}
