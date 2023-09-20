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
        int sum = 0;
        // if (number == 0) {
        //     return 1;
        // } else {
        //     sum = sum + getSum(number % 10);
        // }
        // return sum;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
