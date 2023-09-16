// calculate the sum of five digits number
import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        int number, sum = 0, rem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number up to five digits: ");
        number = sc.nextInt();
        while (number > 0) {
            rem = number % 10;
            sum += rem;
            number /= 10;
        }
        System.out.println("The Value of Sum is " + sum);
        sc.close();
    }
}
