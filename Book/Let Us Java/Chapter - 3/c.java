// reverse the five digits number
import java.util.Scanner;
public class c {
    public static void main(String[] args) {
        int number, rem, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number up to five digits: ");
        number = sc.nextInt();
        while (number > 0) {
            rem = number % 10;
            rev = (rev * 10) + rem;
            number /= 10;
        }
        System.out.println("Reverse number: " + rev);
        sc.close();

    }
}
