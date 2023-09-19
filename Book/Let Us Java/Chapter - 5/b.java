// raise the number to the power of other number
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        System.out.print("Enter the power: ");
        long p = sc.nextLong();
        long power = 1;
        for (long i = 1; i <= p; i++) {
            power *= n;
        }
        System.out.println(n + " raised to the power of " + p + " is " + power);
        sc.close();
    }
}
