// absolute value of a number
import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        if (number < 0)
            number = -number;
        System.out.println("Absolute value: " + number);
        sc.close();
    }
}
