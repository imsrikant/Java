/**
 * a
 */
import java.util.Scanner;
public class a {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number for factorial: ");
        number = sc.nextInt();
        int fact = findFactorial(number);
        System.out.println("Factorial: " + fact);
        sc.close();
    }

    public static int findFactorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}
