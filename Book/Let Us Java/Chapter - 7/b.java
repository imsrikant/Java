/**
 * b
 */
import java.util.Scanner;
public class b {

    public static void main(String[] args) {
        long number, power;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        System.out.print("Enter the power: ");
        power = sc.nextInt();
        long value = findPower(number, power);
        System.out.println("Value: " + value);
        sc.close();
    }

    public static long findPower(long number, long power) {
        long value = 1;
        for (int i = 0; i < power; i++) {
            value *= number;
        }
        return value;
    }
}
