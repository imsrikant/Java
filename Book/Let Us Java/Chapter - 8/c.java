import java.util.Scanner;

/**
 * c
 */
public class c {

    public static void main(String[] args) {
        int number, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number up to five digits: ");
        number = scanner.nextInt();
        sum = getSum(number);
        System.out.println("Sum: " + sum);
        scanner.close();
    }

    static int getSum(int number) {
        if (number == 0) {
            return 0;
        } else {
            return number % 10 + getSum(number / 10);
        }
    }
}
