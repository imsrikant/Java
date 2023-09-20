
import java.util.Scanner;
public class firstRec {
    public static void main(String[] args) {
        int a, fact;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = scanner.nextInt();
        fact = rec(a);
        System.out.println("Factorial: " + fact);
        scanner.close();
    }

    static int rec(int num) {
        int fact;
        if (num == 1) {
            return 1;
        } else {
            fact = num * rec(num - 1);
        }
        return fact;
    }
}
