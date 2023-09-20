
/**
 * g
 */
import java.util.Scanner;

public class recurcise {
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
        // create a recursive function to calculate the sum of natural numbers
        if (number == 0) {
            return 0;
        } else {
            return number + naturalSum(number - 1);
        }
    }
}
