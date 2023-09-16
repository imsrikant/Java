// take input in two number and switch the content of two number
import java.util.Scanner;
public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, temp;
        System.out.println("Enter the number for a: ");
        a = sc.nextDouble();
        System.out.println("Enter the number for b: ");
        b = sc.nextDouble();
        temp = a;
        a = b;
        b = temp;
        System.out.println("Changed Value of a = " + a + " and b = " + b);
        sc.close();
    }
}
